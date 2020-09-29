package com.prince.redis;

/**
 * @author 81439
 */
public interface RedisClient {

    String set(String key,String value);

    String get(String key);

    Boolean exists(String key);

    Long ttl(String key);

    Long incr(String key);

    Long hset(String key, String field, String value);

    String hget(String key, String field);

    Long hdel(String key, String... field);
}
