package com.example.demo.service;

import com.example.demo.redis.JedisUtil;
import com.example.demo.redis.Lists;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestRedisImpl implements TestRedis {




    @Override
    public void testLrem() {

        List<String> auths = Lists.lrange("IP_WHITELIST_KEY", 0, -1);
   //   long b= Lists.lpush("IP_WHITELIST_KEY", "192.168.11.1");
/*     long c= Lists.lpush("IP_WHITELIST_KEY", "192.168.11.1");
        long f= Lists.lpush("IP_WHITELIST_KEY", "192.168.11.1");
   long d= Lists.lpush("IP_WHITELIST_KEY", "192.168.11.2");

        long g= Lists.lpush("IP_WHITELIST_KEY", "192.168.11.2");
        long h= Lists.lpush("IP_WHITELIST_KEY", "192.168.11.1");*/
        long a= Lists.lrem("IP_WHITELIST_KEY",2,"192.168.11.1");


        System.out.println("a"+a);
    }
}
