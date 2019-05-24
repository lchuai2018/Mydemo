package com.example.demo.collect;

import java.util.HashMap;
import java.util.Map;

public class TestMapLam {

    public static void main(String[] args) {
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        System.out.println("遍历map元素");
        items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

        System.out.println("遍历map元素 并且键E为key");
        items.forEach((k,v)->{
            System.out.println("Item : " + k + " Count : " + v);
            if("E".equals(k)){
                System.out.println("Hello E");
            }
        });

        items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));


    }
}
