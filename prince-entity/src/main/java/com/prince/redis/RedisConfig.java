package com.prince.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 81439
 */
@Configuration
public class RedisConfig {
    @Autowired
    private RedisProperties redisProperties;

    @Bean
    public JedisCluster getJedisCluster(){
        //获取redis集群的ip及端口号等相关信息；
        String[] array = redisProperties.getNodes().split(",");
        Set<HostAndPort> nodes = new HashSet<>();
        for (String s : array) {
            String[] port = s.split(":");
            nodes.add(new HostAndPort(port[0],Integer.valueOf(port[1])));
        }
        return new JedisCluster(nodes,redisProperties.getCommandTimeout());
    }
}
