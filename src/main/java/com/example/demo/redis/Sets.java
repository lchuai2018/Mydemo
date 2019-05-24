package com.example.demo.redis;

import redis.clients.jedis.Jedis;

import java.util.Set;

import static com.example.demo.redis.JedisUtil.getJedis;
import static com.example.demo.redis.JedisUtil.returnJedis;

public class Sets {

    /**
     * 330          * 向Set添加一条记录，如果member已存在返回0,否则返回1
     * 331          * @param String  key
     * 332          * @param String member
     * 333          * @return 操作码,0或1
     * 334          *
     */

    public long sadd(String key, String member) {
        Jedis jedis = getJedis();
        long s = jedis.sadd(key, member);
        returnJedis(jedis);
        return s;
    }



    public long sadd(byte[] key, byte[] member) {
        Jedis jedis = getJedis();
        long s = jedis.sadd(key, member);
        returnJedis(jedis);
        return s;

    }

    /**
     * 350          * 获取给定key中元素个数
     * 351          * @param String key
     * 352          * @return 元素个数
     * 353          *
     */


    public long scard(String key) {
        //ShardedJedis sjedis = getShardedJedis();
        Jedis sjedis = getJedis();
        long len = sjedis.scard(key);
        returnJedis(sjedis);
        return len;
    }

    /**
     * 363          * 返回从第一组和所有的给定集合之间的差异的成员
     * 364          * @param String ... keys
     * 365          * @return 差异的成员集合
     * 366          *
     */

    public Set<String> sdiff(String... keys) {
        Jedis jedis = getJedis();
        Set<String> set = jedis.sdiff(keys);
        returnJedis(jedis);
        return set;

    }

    /**
     * 375          * 这个命令等于sdiff,但返回的不是结果集,而是将结果集存储在新的集合中，如果目标已存在，则覆盖。
     * 376          * @param String newkey 新结果集的key
     * 377          * @param String ... keys 比较的集合
     * 378          * @return 新集合中的记录数
     * 379          *
     **/


    public long sdiffstore(String newkey, String... keys) {
        Jedis jedis = getJedis();
        long s = jedis.sdiffstore(newkey, keys);
        returnJedis(jedis);
        return s;
    }

    /**
     * 388          * 返回给定集合交集的成员,如果其中一个集合为不存在或为空，则返回空Set
     * 389          * @param String ... keys
     * 390          * @return 交集成员的集合
     * 391          *
     **/

    public Set<String> sinter(String... keys) {
        Jedis jedis = getJedis();
        Set<String> set = jedis.sinter(keys);
        returnJedis(jedis);
        return set;
    }

    /**
     * 400          * 这个命令等于sinter,但返回的不是结果集,而是将结果集存储在新的集合中，如果目标已存在，则覆盖。
     * 401          * @param String  newkey 新结果集的key
     * 402          * @param String ... keys 比较的集合
     * 403          * @return 新集合中的记录数
     * 404          *
     **/

    public long sinterstore(String newkey, String... keys) {
        Jedis jedis = getJedis();
        long s = jedis.sinterstore(newkey, keys);
        returnJedis(jedis);
        return s;
    }

    /**
     * 413          * 确定一个给定的值是否存在
     * 414          * @param String  key
     * 415          * @param String member 要判断的值
     * 416          * @return 存在返回1，不存在返回0
     * 417          *
     **/


    public boolean sismember(String key, String member) {
        //ShardedJedis sjedis = getShardedJedis();
        Jedis sjedis = getJedis();
        boolean s = sjedis.sismember(key, member);
        returnJedis(sjedis);
        return s;
    }

    /**
     * 427          * 返回集合中的所有成员
     * 428          * @param String  key
     * 429          * @return 成员集合
     * 430          *
     */


    public Set<String> smembers(String key) {
        //ShardedJedis sjedis = getShardedJedis();
        Jedis sjedis = getJedis();
        Set<String> set = sjedis.smembers(key);
        returnJedis(sjedis);
        return set;

    }


/*    public Set<byte[]> smembers(byte[] key) {
        440             //ShardedJedis sjedis = getShardedJedis();
        441 Jedis sjedis = getJedis();
        442 Set<byte[]> set = sjedis.smembers(key);
        443 returnJedis(sjedis);
        444 return set;
        445
    }
 446
         447         *//**
     448          * 将成员从源集合移出放入目标集合 <br/>
     449          * 如果源集合不存在或不包哈指定成员，不进行任何操作，返回0<br/>
     450          * 否则该成员从源集合上删除，并添加到目标集合，如果目标集合中成员已存在，则只在源集合进行删除
     451          * @param String  srckey 源集合
     452          * @param String dstkey 目标集合
     453          * @param String member 源集合中的成员
     454          * @return 状态码，1成功，0失败
     455          * *//*
         456

    public long smove(String srckey, String dstkey, String member) {
        457 Jedis jedis = getJedis();
        458 long s = jedis.smove(srckey, dstkey, member);
        459 returnJedis(jedis);
        460 return s;
        461
    }
 462
         463         *//**
     464          * 从集合中删除成员
     465          * @param String  key
     466          * @return 被删除的成员
     467          * *//*
         468

    public String spop(String key) {
        469 Jedis jedis = getJedis();
        470 String s = jedis.spop(key);
        471 returnJedis(jedis);
        472 return s;
        473
    }
 474
         475         *//**
     476          * 从集合中删除指定成员
     477          * @param String key
     478          * @param String  member 要删除的成员
     479          * @return 状态码，成功返回1，成员不存在返回0
     480          * *//*
         481

    public long srem(String key, String member) {
        482 Jedis jedis = getJedis();
        483 long s = jedis.srem(key, member);
        484 returnJedis(jedis);
        485 return s;
        486
    }
 487
         488         *//**
     489          * 合并多个集合并返回合并后的结果，合并后的结果集合并不保存<br/>
     490          * @param String  ... keys
     491          * @return 合并后的结果集合
     492          * @see sunionstore
     493          * *//*
         494

    public Set<String> sunion(String... keys) {
        495 Jedis jedis = getJedis();
        496 Set<String> set = jedis.sunion(keys);
        497 returnJedis(jedis);
        498 return set;
        499
    }
 500
         501         *//**
     502          * 合并多个集合并将合并后的结果集保存在指定的新集合中，如果新集合已经存在则覆盖
     503          * @param String  newkey 新集合的key
     504          * @param String ... keys 要合并的集合
     505          * **//*
         506

    public long sunionstore(String newkey, String... keys) {
        507 Jedis jedis = getJedis();
        508 long s = jedis.sunionstore(newkey, keys);
        509 returnJedis(jedis);
        510 return s;
        511
    }
 512*/
}


