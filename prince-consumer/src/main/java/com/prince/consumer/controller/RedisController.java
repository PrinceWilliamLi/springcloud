package com.prince.consumer.controller;

import com.prince.redis.JedisClientCluster;
import com.prince.redis.RedisConfig;
import com.prince.redis.RedisProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author 81439
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisProperties redisProperties;

    @Autowired
    private RedisConfig redisConfig;

    @Autowired
    private JedisClientCluster jedisClientCluster;

    @RequestMapping(value = "/getRedisValue")
    public String getRedisValue(){
        System.out.println(redisProperties.toString());
        System.out.println(redisConfig.getJedisCluster().getClusterNodes());
        System.out.println(jedisClientCluster.get("yp"));
        jedisClientCluster.set("12","12");
        System.out.println(jedisClientCluster.get("12"));
        return jedisClientCluster.get("12");
    }
}
