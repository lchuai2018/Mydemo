package com.example.demo.redis;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.List;

public class Buchong {

/*

    *//**
     2      * @Title:
     3      * getList @Description：(根据key以及类得到redis服务器中集合字符串对应的集合) @param @param
     4      * key @param @param clazz @param @return 设定文件 @return List<T> 返回类型 @throws
     5      *//*
 6     public <T> List<T> getList(String key, Class<T> clazz) {
        7         String valueStr = this.get(key);
        8         if (valueStr == null || "".equals(valueStr))
            9             return null;
        10         if (!isGoodJson(valueStr)) {
            11             valueStr = JSON.toJSONString(valueStr);
            12         }
        13         return JSONArray.parseArray(valueStr, clazz);
        14     }
15
        16     *//**
 17      *
 18      * @Title: getObject @Description:
 19      * (根据key以及类得到redis服务器中对象字符串对应的对象) @param @param key @param @param
 20      * clazz @param @return 设定文件 @return T 返回类型 @throws
 21      *//*
        22     public <T> T getObject(String key, Class<T> clazz) {
        23         String valueStr = this.get(key);
        24         if (valueStr == null || "".equals(valueStr))
            25             return null;
        26         if (!isGoodJson(valueStr)) {
            27             valueStr = JSON.toJSONString(valueStr);
            28         }
        29         return (T) JSON.parseObject(valueStr, clazz);
        30     }
31
        32     *//**
 33      *
 34      * @Title: isGoodJson @Description: (判断是否是json格式字符串) @param @param
 35      * json @param @return 设定文件 @return boolean 返回类型 @throws
 36      *//*
        37     public static boolean isGoodJson(String json) {
        38         if (StringUtils.isBlank(json)) {
            39             return false;
            40         }
        41         try {
            42             JSON.parse(json);
            43             return true;
            44         } catch (Exception e) {
            45             return false;
            46         }
        47     }*/
}
