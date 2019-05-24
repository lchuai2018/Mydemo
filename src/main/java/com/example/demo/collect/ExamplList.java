package com.example.demo.collect;

import java.util.ArrayList;
import java.util.List;

public class ExamplList {

    private static List<String> items = new ArrayList<>();

    static {
        items.add("A");
        items.add("BC");
        items.add("C");
        items.add("BD");
        items.add("E");
    }

    public static void main(String[] args) {
/*
        // 相当于foreach遍历操作结果值
        Integer out = Stream.of(10, 5, 3, 2, 1, 0).reduce((result, item) -> {
            if (item >= 3) {
                result = result + item;
            }
            return result;
        }).get();
        System.out.println(out);


        for (String itam : items) {
            System.out.println(itam);
            ;
        }

        items.forEach(c -> System.out.println(c));


        items.forEach(item -> {
                    if ("C".equals(item)) {
                        System.out.println(item);
                    }
                });
*/
        //集合包含了元素B输出这个集合
        items.stream().filter(s -> s.contains("B")).forEach(c1 -> System.out.println(c1));

    }


}
