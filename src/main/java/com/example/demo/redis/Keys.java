package com.example.demo.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.SortingParams;
import redis.clients.jedis.util.SafeEncoder;

import java.util.List;
import java.util.Set;

import static com.example.demo.redis.JedisUtil.getJedis;
import static com.example.demo.redis.JedisUtil.returnJedis;

public class Keys {
    /**
     * 140          * 清空所有key
     * 141
     */

    public String flushAll() {
        Jedis jedis = getJedis();
        String stata = jedis.flushAll();
        returnJedis(jedis);
        return stata;
    }

    /**
     * 150          * 更改key
     * 151          * @param String oldkey
     * 152          * @param String  newkey
     * 153          * @return 状态码
     * 154          *
     */

    public String rename(String oldkey, String newkey) {
        return rename(SafeEncoder.encode(oldkey),
                SafeEncoder.encode(newkey));
    }

    /**
     * 161          * 更改key,仅当新key不存在时才执行
     * 162          * @param String oldkey
     * 163          * @param String newkey
     * 164          * @return 状态码
     * 165          *
     */

    public long renamenx(String oldkey, String newkey) {
        Jedis jedis = getJedis();
        long status = jedis.renamenx(oldkey, newkey);
        returnJedis(jedis);
        return status;
    }

    /**
     * 174          * 更改key
     * 175          * @param String oldkey
     * 176          * @param String newkey
     * 177          * @return 状态码
     * 178          *
     */

    public String rename(byte[] oldkey, byte[] newkey) {
        Jedis jedis = getJedis();
        String status = jedis.rename(oldkey, newkey);
        returnJedis(jedis);
        return status;

    }

    /**
     * 187          * 设置key的过期时间，以秒为单位
     * 188          * @param String key
     * 189          * @param 时间,已秒为单位
     * 190          * @return 影响的记录数
     * 191          *
     */

    public long expired(String key, int seconds) {
        Jedis jedis = getJedis();
        long count = jedis.expire(key, seconds);
        returnJedis(jedis);
        return count;
    }

    /**
     * 200          * 设置key的过期时间,它是距历元（即格林威治标准时间 1970 年 1 月 1 日的 00:00:00，格里高利历）的偏移量。
     * 201          * @param String key
     * 202          * @param 时间,已秒为单位
     * 203          * @return 影响的记录数
     * 204          *
     */


    public long expireAt(String key, long timestamp) {
        Jedis jedis = getJedis();
        long count = jedis.expireAt(key, timestamp);
        returnJedis(jedis);
        return count;
    }

    /**
     * 213          * 查询key的过期时间
     * 214          * @param String key
     * 215          * @return 以秒为单位的时间表示
     * 216          *
     */


    public long ttl(String key) {
        //ShardedJedis sjedis = getShardedJedis();
        Jedis sjedis = getJedis();
        long len = sjedis.ttl(key);
        returnJedis(sjedis);
        return len;
    }

    /**
     * 226          * 取消对key过期时间的设置
     * 227          * @param key
     * 228          * @return 影响的记录数
     * 229          *
     */


    public long persist(String key) {
        Jedis jedis = getJedis();
        long count = jedis.persist(key);
        returnJedis(jedis);
        return count;
    }

    /**
     * 238          * 删除keys对应的记录,可以是多个key
     * 239          * @param String  ... keys
     * 240          * @return 删除的记录数
     * 241          *
     */

    public long del(String... keys) {
        Jedis jedis = getJedis();
        long count = jedis.del(keys);
        returnJedis(jedis);
        return count;
    }

    /**
     * 250          * 删除keys对应的记录,可以是多个key
     * 251          * @param String .. keys
     * 252          * @return 删除的记录数
     * 253          *
     */


    public long del(byte[]... keys) {
        Jedis jedis = getJedis();
        long count = jedis.del(keys);
        returnJedis(jedis);
        return count;

    }

    /**
     * 262          * 判断key是否存在
     * 263          * @param String key
     * 264          * @return boolean
     * 265          *
     */


    public boolean exists(String key) {
        //ShardedJedis sjedis = getShardedJedis();
        Jedis sjedis = getJedis();
        boolean exis = sjedis.exists(key);
        returnJedis(sjedis);
        return exis;

    }

    /**
     * 275          * 对List,Set,SortSet进行排序,如果集合数据较大应避免使用这个方法
     * 276          * @param String key
     * 277          * @return List<String> 集合的全部记录
     * 278          *
     **/


    public List<String> sort(String key) {
        //ShardedJedis sjedis = getShardedJedis();
        Jedis sjedis = getJedis();
        List<String> list = sjedis.sort(key);
        returnJedis(sjedis);
        return list;

    }

    /**
     * 288          * 对List,Set,SortSet进行排序或limit
     * 289          * @param String key
     * 290          * @param SortingParams parame 定义排序类型或limit的起止位置.
     * 291          * @return List<String> 全部或部分记录
     * 292          *
     **/


    public List<String> sort(String key, SortingParams parame) {
        //ShardedJedis sjedis = getShardedJedis();
        Jedis sjedis = getJedis();
        List<String> list = sjedis.sort(key, parame);
        returnJedis(sjedis);
        return list;

    }

    /**
     * 302          * 返回指定key存储的类型
     * 303          * @param String key
     * 304          * @return String string|list|set|zset|hash
     * 305          *
     **/


    public String type(String key) {
        //ShardedJedis sjedis = getShardedJedis();
        Jedis sjedis = getJedis();
        String type = sjedis.type(key);
        returnJedis(sjedis);
        return type;
    }

    /**
     * 315          * 查找所有匹配给定的模式的键
     * 316          * @param String  key的表达式,*表示多个，？表示一个
     * 317          *
     */

    public Set<String> keys(String pattern) {
        Jedis jedis = getJedis();
        Set<String> set = jedis.keys(pattern);
        returnJedis(jedis);
        return set;
    }






}
