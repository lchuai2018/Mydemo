package com.example.demo.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.util.SafeEncoder;

import java.util.List;

import static com.example.demo.redis.JedisUtil.getJedis;
import static com.example.demo.redis.JedisUtil.returnJedis;

public class Lists {


    /**
     * 1181          * List长度
     * 1182          * @param String key
     * 1183          * @return 长度
     * 1184          *
     */

    public long llen(String key) {
        return llen(SafeEncoder.encode(key));

    }

    /**
     * 1190          * List长度
     * 1191          * @param byte[] key
     * 1192          * @return 长度
     * 1193          *
     */

    public long llen(byte[] key) {
        //ShardedJedis sjedis = getShardedJedis();
        Jedis sjedis = getJedis();
        long count = sjedis.llen(key);
        returnJedis(sjedis);
        return count;

    }

    /**
     * 1203          * 覆盖操作,将覆盖List中指定位置的值
     * 1204          * @param byte[] key
     * 1205          * @param int index 位置
     * 1206          * @param byte[] value 值
     * 1207          * @return 状态码
     * 1208          *
     */


    public String lset(byte[] key, int index, byte[] value) {
        Jedis jedis = getJedis();
        String status = jedis.lset(key, index, value);
        returnJedis(jedis);
        return status;
    }

    /**
     * 1217          * 覆盖操作,将覆盖List中指定位置的值
     * 1218          * @param key
     * 1219          * @param int index 位置
     * 1220          * @param String  value 值
     * 1221          * @return 状态码
     * 1222          *
     */


    public String lset(String key, int index, String value) {
        return lset(SafeEncoder.encode(key), index,
                SafeEncoder.encode(value));

    }
    /**
     1229          * 在value的相对位置插入记录
     1230          * @param key
     1231          * @param LIST_POSITION   前面插入或后面插入
     1232          * @param String pivot 相对位置的内容
     1233          * @param String value 插入的内容
     1234          * @return 记录总数
     1235          * */

/*
    public long linsert(String key, LIST_POSITION where, String pivot,
 String value) {
      return linsert(SafeEncoder.encode(key), where,
          SafeEncoder.encode(pivot), SafeEncoder.encode(value));

    }*/

    /**
     * 1243          * 在指定位置插入记录
     * 1244          * @param String key
     * 1245          * @param LIST_POSITION 前面插入或后面插入
     * 1246          * @param byte[] pivot 相对位置的内容
     * 1247          * @param byte[] value 插入的内容
     * 1248          * @return 记录总数
     * 1249          *
     */


 /*   public long linsert(byte[] key, LIST_POSITION where, byte[] pivot,
                        byte[] value) {
        Jedis jedis = getJedis();
        long count = jedis.linsert(key, where, pivot, value);
        returnJedis(jedis);
        return count;

    }*/

    /**
     * 1259          * 获取List中指定位置的值
     * 1260          * @param String  key
     * 1261          * @param int index 位置
     * 1262          * @return 值
     * 1263          *
     **/


    public String lindex(String key, int index) {
        return SafeEncoder.encode(lindex(SafeEncoder.encode(key), index));

    }

    /**
     * 1269          * 获取List中指定位置的值
     * 1270          * @param byte[] key
     * 1271          * @param int index 位置
     * 1272          * @return 值
     * 1273          *
     **/


    public byte[] lindex(byte[] key, int index) {
        //ShardedJedis sjedis = getShardedJedis();
        Jedis sjedis = getJedis();
        byte[] value = sjedis.lindex(key, index);
        returnJedis(sjedis);
        return value;

    }

    /**
     * 1283          * 将List中的第一条记录移出List
     * 1284          * @param String key
     * 1285          * @return 移出的记录
     * 1286          *
     */


    public String lpop(String key) {
        return SafeEncoder.encode(lpop(SafeEncoder.encode(key)));

    }

    /**
     * 1292          * 将List中的第一条记录移出List
     * 1293          * @param byte[] key
     * 1294          * @return 移出的记录
     * 1295          *
     */


    public byte[] lpop(byte[] key) {
        Jedis jedis = getJedis();
        byte[] value = jedis.lpop(key);
        returnJedis(jedis);
        return value;

    }

    /**
     * 1304          * 将List中最后第一条记录移出List
     * 1305          *
     * 1306          * @param byte[] key
     * 1307          * @return 移出的记录
     * 1308          *
     */


    public String rpop(String key) {
        Jedis jedis = getJedis();
        String value = jedis.rpop(key);
        returnJedis(jedis);
        return value;

    }

    /**
     * 1317          * 向List尾部追加记录
     * 1318          * @param String key
     * 1319          * @param String value
     * 1320          * @return 记录总数
     * 1321          *
     */


    public static long lpush(String key, String value) {
        return lpush(SafeEncoder.encode(key), SafeEncoder.encode(value));

    }

    /**
     * 1327          * 向List头部追加记录
     * 1328          * @param String  key
     * 1329          * @param String  value
     * 1330          * @return 记录总数
     * 1331          *
     */


    public long rpush(String key, String value) {
        Jedis jedis = getJedis();
        long count = jedis.rpush(key, value);
        returnJedis(jedis);
        return count;

    }

    /**
     * 1340          * 向List头部追加记录
     * 1341          * @param String key
     * 1342          * @param String value
     * 1343          * @return 记录总数
     * 1344          *
     */


    public long rpush(byte[] key, byte[] value) {
        Jedis jedis = getJedis();
        long count = jedis.rpush(key, value);
        returnJedis(jedis);
        return count;
    }

    /**
     * 1353          * 向List中追加记录
     * 1354          * @param byte[] key
     * 1355          * @param byte[] value
     * 1356          * @return 记录总数
     * 1357          *
     */


    public static long lpush(byte[] key, byte[] value) {
        Jedis jedis = getJedis();
        long count = jedis.lpush(key, value);
        returnJedis(jedis);
        return count;

    }

    /**
     * 1366          * 获取指定范围的记录，可以做为分页使用
     * 1367          * @param String key
     * 1368          * @param long start
     * 1369          * @param long end
     * 1370          * @return List
     * 1371          *
     */


    public static List<String> lrange(String key, long start, long end) {
        //ShardedJedis sjedis = getShardedJedis();
        Jedis sjedis = getJedis();
        List<String> list = sjedis.lrange(key, start, end);
        returnJedis(sjedis);
        return list;

    }

    /**
     * 1381          * 获取指定范围的记录，可以做为分页使用
     * 1382          * @param byte[] key
     * 1383          * @param int start
     * 1384          * @param int end 如果为负数，则尾部开始计算
     * 1385          * @return List
     * 1386          *
     */


    public List<byte[]> lrange(byte[] key, int start, int end) {
        //ShardedJedis sjedis = getShardedJedis();
        Jedis sjedis = getJedis();
        List<byte[]> list = sjedis.lrange(key, start, end);
        returnJedis(sjedis);
        return list;

    }

    /**
     * 1396          * 删除List中c条记录，被删除的记录值为value
     * 1397          * @param byte[] key
     * 1398          * @param int c 要删除的数量，如果为负数则从List的尾部检查并删除符合的记录
     * 1399          * @param byte[] value 要匹配的值
     * 1400          * @return 删除后的List中的记录数
     * 1401          *
     */


    public static long lrem(byte[] key, int c, byte[] value) {
        Jedis jedis = getJedis();
        long count = jedis.lrem(key, c, value);
        returnJedis(jedis);
        return count;

    }
    /**
     * 删除List中c条记录，被删除的记录值为value
     * @param String key
     * @param int c 要删除的数量，如果为负数则从List的尾部检查并删除符合的记录
     * @param String value 要匹配的值
     * @return 删除后的List中的记录数
     * */
    public static long lrem(String key, int c, String value) {
       return lrem(SafeEncoder.encode(key), c, SafeEncoder.encode(value));
    }


       /*
1419
        1420         *//**
     1421          * 算是删除吧，只保留start与end之间的记录
     1422          * @param byte[] key
     1423          * @param int start 记录的开始位置(0表示第一条记录)
     1424          * @param int end 记录的结束位置（如果为-1则表示最后一个，-2，-3以此类推）
     1425          * @return 执行状态码
     1426          * *//*
        1427

    public String ltrim(byte[] key, int start, int end) {
        1428 Jedis jedis = getJedis();
        1429 String str = jedis.ltrim(key, start, end);
        1430 returnJedis(jedis);
        1431 return str;
        1432
    }
1433
        1434         *//**
     1435          * 算是删除吧，只保留start与end之间的记录
     1436          * @param String key
     1437          * @param int start 记录的开始位置(0表示第一条记录)
     1438          * @param int end 记录的结束位置（如果为-1则表示最后一个，-2，-3以此类推）
     1439          * @return 执行状态码
     1440          * *//*
        1441

    public String ltrim(String key, int start, int end) {
        1442 return ltrim(SafeEncoder.encode(key), start, end);
        1443
    }*/

      /*  1446     public static void main(String[] args) {
        1447         JedisUtil jedisUtil= JedisUtil.getInstance();
        1448         JedisUtil.Strings strings=jedisUtil.new Strings();
        1449         strings.set("nnn", "nnnn");
        1450         System.out.println("-----"+strings.get("nnn"));
        1451
        1452         Jedis jedis=JedisUtil.getInstance().getJedis();
        1453         for (int i = 0; i < 10; i++) {
        1454             jedis.set("test", "test");
        1455             System.out.println(i+"=="+jedis.get("test"));
        1456
        1457         }
        1458         JedisUtil.getInstance().returnJedis(jedis);
        1459     }
        1460
        1461 }*/

}
