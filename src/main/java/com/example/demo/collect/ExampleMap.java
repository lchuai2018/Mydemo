package com.example.demo.collect;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {
   private static Map<String,Integer> maps=new HashMap<>();
    static {
        maps.put("A", 10);
        maps.put("B", 20);
        maps.put("C", 30);
        maps.put("D", 40);
        maps.put("E", 50);
        maps.put("F", 60);
    }

    public static void main(String[] args) {
     for (Map.Entry<String,Integer> entry:maps.entrySet()){
         System.out.println("key"+entry.getKey()+"value"+entry.getValue());
     }
     maps.forEach((key,value)->System.out.println("key:" + key + " value:" + value));
    }
}
