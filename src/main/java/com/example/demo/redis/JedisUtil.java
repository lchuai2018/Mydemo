package com.example.demo.redis;

import org.apache.logging.log4j.util.Strings;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisUtil {
    //private Logger log = Logger.getLogger(this.getClass());
    /**
     * 缓存生存时间
     */
    private final int expire = 60000;
    /**
     * 操作Key的方法
     */
    public Keys KEYS;
    /**
     * 对存储结构为String类型的操作
     */
    public Strings STRINGS;
    /**
     * 对存储结构为List类型的操作
     */
    public Lists LISTS;
    /**
     * 对存储结构为Set类型的操作
     */
    public Sets SETS;
    /**
     * 对存储结构为HashMap类型的操作
     */
    public Hash HASH;
    /**
     * 对存储结构为Set(排序的)类型的操作
     */
    public SortSet SORTSET;
    private static JedisPool jedisPool = null;

    private JedisUtil() {

    }

    static {
        JedisPoolConfig config = new JedisPoolConfig();
        //控制一个pool可分配多少个jedis实例，通过pool.getResource()来获取；
        //如果赋值为-1，则表示不限制；如果pool已经分配了maxActive个jedis实例，则此时pool的状态为exhausted(耗尽)。
        config.setMaxTotal(500);
        //控制一个pool最多有多少个状态为idle(空闲的)的jedis实例。
        config.setMaxIdle(5);
        //表示当borrow(引入)一个jedis实例时，最大的等待时间，如果超过等待时间，则直接抛出JedisConnectionException；
        config.setMaxWaitMillis(1000 * 100);
        //在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的；
        config.setTestOnBorrow(true);
        //redis如果设置了密码：
      /*          jedisPool = new JedisPool(config, JRedisPoolConfig.REDIS_IP,
                    JRedisPoolConfig.REDIS_PORT,
                     10000,JRedisPoolConfig.REDIS_PASSWORD);    */

        //redis未设置了密码：
        jedisPool = new JedisPool(config, "192.168.1.11", 6379,10000,"test@456");

    }


    public JedisPool getPool() {
        return jedisPool;
    }

    /**
     * 从jedis连接池中获取获取jedis对象
     *
     * @return
     */


    public static Jedis getJedis() {
        return jedisPool.getResource();
    }

    private static final JedisUtil jedisUtil = new JedisUtil();


    /**
     * 获取JedisUtil实例
     *
     * @return
     */


    public static JedisUtil getInstance() {
        return jedisUtil;
    }

    /**
     * 90      * 回收jedis(放到finally中)
     * 91      * @param jedis
     * 92
     */


    public static void returnJedis(Jedis jedis) {
/*        if (null != jedis && null != jedisPool) {
            jedisPool.returnResource(jedis);
        }*/
        if (jedis != null) {
            jedis.close();
            //jedisPool.returnResource(jedis);
        }

    }

    /**
     * 100      * 销毁连接(放到catch中)
     * 101      * @param pool
     * 102      * @param jedis
     * 103
     */


    public static void returnBrokenResource(Jedis jedis) {
/*
        if (null != jedis && null != jedisPool) {
            jedisPool.returnResource(jedis);
        }
*/

        if (jedis != null) {
            jedis.close();
            //jedisPool.returnResource(jedis);
        }

    }

    /**
     * 112      * 设置过期时间
     * 113      * @author ruan 2013-4-11
     * 114      * @param key
     * 115      * @param seconds
     * 116
     */


    public void expire(String key, int seconds) {
        if (seconds <= 0) {
            return;
        }
        Jedis jedis = getJedis();
        jedis.expire(key, seconds);
        returnJedis(jedis);
    }

    /**
     * 127      * 设置默认过期时间
     * 128      * @author ruan 2013-4-11
     * 129      * @param key
     * 130
     */

    public void expire(String key) {
        expire(key, expire);

    }
}
