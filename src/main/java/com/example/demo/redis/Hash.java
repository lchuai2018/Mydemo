package com.example.demo.redis;

import java.util.List;
import java.util.Set;

public class Hash {


 /*   *//**
     741          * 从hash中删除指定的存储
     742          * @param String key
     743          * @param String  fieid 存储的名字
     744          * @return 状态码，1成功，0失败
     745          * *//*
 746

    public long hdel(String key, String fieid) {
        747 Jedis jedis = getJedis();
        748 long s = jedis.hdel(key, fieid);
        749 returnJedis(jedis);
        750 return s;
        751
    }
 752
         753

    public long hdel(String key) {
        754 Jedis jedis = getJedis();
        755 long s = jedis.del(key);
        756 returnJedis(jedis);
        757 return s;
        758
    }
 759
         760         *//**
  761          * 测试hash中指定的存储是否存在
  762          * @param String key
  763          * @param String  fieid 存储的名字
  764          * @return 1存在，0不存在
  765          * *//*
         766

    public boolean hexists(String key, String fieid) {
        767             //ShardedJedis sjedis = getShardedJedis();
        768 Jedis sjedis = getJedis();
        769 boolean s = sjedis.hexists(key, fieid);
        770 returnJedis(sjedis);
        771 return s;
        772
    }
 773
         774         *//**
  775          * 返回hash中指定存储位置的值
  776          *
  777          * @param String key
  778          * @param String fieid 存储的名字
  779          * @return 存储对应的值
  780          * *//*
         781

    public String hget(String key, String fieid) {
        782             //ShardedJedis sjedis = getShardedJedis();
        783 Jedis sjedis = getJedis();
        784 String s = sjedis.hget(key, fieid);
        785 returnJedis(sjedis);
        786 return s;
        787
    }
 788
         789

    public byte[] hget(byte[] key, byte[] fieid) {
        790             //ShardedJedis sjedis = getShardedJedis();
        791 Jedis sjedis = getJedis();
        792 byte[] s = sjedis.hget(key, fieid);
        793 returnJedis(sjedis);
        794 return s;
        795
    }
 796
         797         *//**
  798          * 以Map的形式返回hash中的存储和值
  799          * @param String    key
  800          * @return Map<Strinig,String>
  801          * *//*
         802

    public Map<String, String> hgetAll(String key) {
        803             //ShardedJedis sjedis = getShardedJedis();
        804 Jedis sjedis = getJedis();
        805 Map<String, String> map = sjedis.hgetAll(key);
        806 returnJedis(sjedis);
        807 return map;
        808
    }
 809
         810         *//**
  811          * 添加一个对应关系
  812          * @param String  key
  813          * @param String fieid
  814          * @param String value
  815          * @return 状态码 1成功，0失败，fieid已存在将更新，也返回0
  816          * **//*
         817

    public long hset(String key, String fieid, String value) {
        818 Jedis jedis = getJedis();
        819 long s = jedis.hset(key, fieid, value);
        820 returnJedis(jedis);
        821 return s;
        822
    }
 823
         824

    public long hset(String key, String fieid, byte[] value) {
        825 Jedis jedis = getJedis();
        826 long s = jedis.hset(key.getBytes(), fieid.getBytes(), value);
        827 returnJedis(jedis);
        828 return s;
        829
    }
 830
         831         *//**
  832          * 添加对应关系，只有在fieid不存在时才执行
  833          * @param String key
  834          * @param String fieid
  835          * @param String value
  836          * @return 状态码 1成功，0失败fieid已存
  837          * **//*
         838

    public long hsetnx(String key, String fieid, String value) {
        839 Jedis jedis = getJedis();
        840 long s = jedis.hsetnx(key, fieid, value);
        841 returnJedis(jedis);
        842 return s;
        843
    }
 844
         845         *//**
  846          * 获取hash中value的集合
  847          *
  848          * @param String
  849          *            key
  850          * @return List<String>
  851          * *//*
         852

    public List<String> hvals(String key) {
        853             //ShardedJedis sjedis = getShardedJedis();
        854 Jedis sjedis = getJedis();
        855 List<String> list = sjedis.hvals(key);
        856 returnJedis(sjedis);
        857 return list;
        858
    }
 859
         860         *//**
  861          * 在指定的存储位置加上指定的数字，存储位置的值必须可转为数字类型
  862          * @param String  key
  863          * @param String  fieid 存储位置
  864          * @param String long value 要增加的值,可以是负数
  865          * @return 增加指定数字后，存储位置的值
  866          * *//*
         867

    public long hincrby(String key, String fieid, long value) {
        868 Jedis jedis = getJedis();
        869 long s = jedis.hincrBy(key, fieid, value);
        870 returnJedis(jedis);
        871 return s;
        872
    }
 873
         874         *//**
  875          * 返回指定hash中的所有存储名字,类似Map中的keySet方法
  876          * @param String key
  877          * @return Set<String> 存储名称的集合
  878          * *//*
         879

    public Set<String> hkeys(String key) {
        880             //ShardedJedis sjedis = getShardedJedis();
        881 Jedis sjedis = getJedis();
        882 Set<String> set = sjedis.hkeys(key);
        883 returnJedis(sjedis);
        884 return set;
        885
    }
 886
         887         *//**
  888          * 获取hash中存储的个数，类似Map中size方法
  889          * @param String  key
  890          * @return long 存储的个数
  891          * *//*
         892

    public long hlen(String key) {
        893             //ShardedJedis sjedis = getShardedJedis();
        894 Jedis sjedis = getJedis();
        895 long len = sjedis.hlen(key);
        896 returnJedis(sjedis);
        897 return len;
        898
    }
 899
         900         *//**
  901          * 根据多个key，获取对应的value，返回List,如果指定的key不存在,List对应位置为null
  902          * @param String  key
  903          * @param String ... fieids 存储位置
  904          * @return List<String>
  905          * *//*
         906

    public List<String> hmget(String key, String... fieids) {
        907             //ShardedJedis sjedis = getShardedJedis();
        908 Jedis sjedis = getJedis();
        909 List<String> list = sjedis.hmget(key, fieids);
        910 returnJedis(sjedis);
        911 return list;
        912
    }
 913
         914

    public List<byte[]> hmget(byte[] key, byte[]... fieids) {
        915             //ShardedJedis sjedis = getShardedJedis();
        916 Jedis sjedis = getJedis();
        917 List<byte[]> list = sjedis.hmget(key, fieids);
        918 returnJedis(sjedis);
        919 return list;
        920
    }
 921
         922         *//**
  923          * 添加对应关系，如果对应关系已存在，则覆盖
  924          * @param Strin   key
  925          * @param Map <String,String> 对应关系
  926          * @return 状态，成功返回OK
  927          * *//*
         928

    public String hmset(String key, Map<String, String> map) {
        929 Jedis jedis = getJedis();
        930 String s = jedis.hmset(key, map);
        931 returnJedis(jedis);
        932 return s;
        933
    }
 934
         935         *//**
  936          * 添加对应关系，如果对应关系已存在，则覆盖
  937          * @param Strin key
  938          * @param Map <String,String> 对应关系
  939          * @return 状态，成功返回OK
  940          * *//*
         941

    public String hmset(byte[] key, Map<byte[], byte[]> map) {
        942 Jedis jedis = getJedis();
        943 String s = jedis.hmset(key, map);
        944 returnJedis(jedis);
        945 return s;
        946
    }
 947*/
}
