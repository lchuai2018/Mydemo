package com.example.demo.redis;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeUtil {

/*    *//**
     10      * 序列化
     11      *
     12      * @param object
     13      * @return
     14      *//*
15     public static byte[] serialize(Object object) {
        16         ObjectOutputStream oos = null;
        17         ByteArrayOutputStream baos = null;
        18         try {
            19             // 序列化
            20             baos = new ByteArrayOutputStream();
            21             oos = new ObjectOutputStream(baos);
            22             oos.writeObject(object);
            23             byte[] bytes = baos.toByteArray();
            24             return bytes;
            25         } catch (Exception e) {
            26
            27         }
        28         return null;
        29     }
30
        31     *//**
 32      * 反序列化
 33      *
 34      * @param bytes
 35      * @return
 36      *//*
        37     public static Object unserialize(byte[] bytes) {
        38         ByteArrayInputStream bais = null;
        39         try {
            40             // 反序列化
            41             bais = new ByteArrayInputStream(bytes);
            42             ObjectInputStream ois = new ObjectInputStream(bais);
            43             return ois.readObject();
            44         } catch (Exception e) {
            45
            46         }
        47         return null;
        48     }*/





/*

    1 JedisUtil jedisUtil= JedisUtil.getInstance();
2         JedisUtil.Strings strings=jedisUtil.new Strings();
3         strings.set("nnn", "nnnn");
4         System.out.println("-----"+strings.get("nnn"));


复制代码
1                Jedis jedis=JedisUtil.getInstance().getJedis();
2         for (int i = 0; i < 10; i++) {
3             jedis.set("test", "test");
4             System.out.println(i+"=="+jedis.get("test"));
5
6         }
7         JedisUtil.getInstance().returnJedis(jedis);
复制代码


复制代码
 1        Person p = new Person();
 2         p.setId(3);
 3         p.setName("测试");
 4
 5         JedisUtil.Strings strings=jedisUtil.new Strings();
 6         strings.set("object3", SerializeUtil.serialize(p));
 7
 8         //jedis.set(SafeEncoder.encode("object1"),SerializeUtil.serialize(p));
 9         byte[] personBy = jedis.get(SafeEncoder.encode("object3"));
10         Person p1 = (Person) SerializeUtil.unserialize(personBy);
11         System.out.println(p1.getName());


*/

}
