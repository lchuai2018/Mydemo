package com.example.demo.collect;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingLong;
import static java.util.stream.Collectors.*;

public class TestUser {

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User(21L, "张三"));
        list.add(new User(25L, "李四"));
        list.add(new User(22L, "王五"));
        list.add(new User(19L, "赵柳"));
        list.add(new User(32L, "王5"));
        list.add(new User(29L, "王6"));
        list.add(new User(21L, "王7"));

        // 对象根据年龄属性升序排序
        List<User> newList1 = list.stream().sorted(Comparator.comparing(User::getAge)).collect(toList());

        // 对象根据年龄属性降序排序
        List<User> newList = list.stream().sorted(Comparator.comparing(User::getAge).reversed()).collect(toList());

        // 标识升序，再按创建日期降序
        // List<BhAnnouncement> newList = announcementList.stream().sorted(Comparator.comparing(BhAnnouncement::getReadFlag).thenComparing(BhAnnouncement::getSendTime).reversed()).collect(toList());

        // list遍历
        newList.forEach(System.out::println);

        // 平均数
        double asDouble = list.stream().mapToLong(User::getAge).average().getAsDouble();
        System.out.println("average:" + asDouble);

        double avg = list.stream().collect(Collectors.averagingLong(User::getAge));
        System.out.println("average:" + avg);

        // 最大值
        long asLong = list.stream().mapToLong(User::getAge).max().getAsLong();
        System.out.println("max:" + asLong);

        // 最小值
        long asLong1 = list.stream().mapToLong(User::getAge).min().getAsLong();
        System.out.println("min:" + asLong1);

        // 求和
        long sum1 = list.stream().mapToLong(User::getAge).sum();
        System.out.println("sum:" + sum1);

        // 提取对象属性生成list
        List<Long> ids = list.stream().map(User::getAge).collect(toList());
        System.out.println(ids);

        // list升序排序
        Collections.sort(ids);
        System.out.println(ids);

        // 生成中位数
        Long j;
        if (ids.size() % 2 == 0) {
            j = (ids.get(ids.size() / 2 - 1) + ids.get(ids.size() / 2)) / 2;
            System.out.println("中位数为" + j);
        } else {
            j = ids.get(ids.size() / 2);
            System.out.println("中位数为" + j);
        }

        // list倒序排序
        ids.sort(Comparator.reverseOrder());
        System.out.println(ids);

        // 去重
        List<User> users = list.stream().collect(collectingAndThen(toCollection(() -> new TreeSet<>(comparingLong(User::getAge))), ArrayList::new));
        System.out.println("去重:"+users);

        /**
         * List -> Map
         * 需要注意的是：toMap 如果集合对象有重复的key，会报错Duplicate key ....
         *  apple1,apple12的id都为1。可以用 (k1,k2)->k1 来设置，如果有重复的key,则保留key1,舍弃key2
         */
        Map<Long, User> userMap = list.stream().collect(Collectors.toMap(User::getAge, a -> a, (k1, k2) -> k1));
        System.out.println(userMap);

        //过滤出符合条件的数据
        List<User> filterList = list.stream().filter(a -> a.getName().equals("李四")).collect(toList());
        System.out.println("filterList:" + filterList);


        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);

        int sum = list2.stream().reduce(0, (acc, value) -> acc + value);
        System.out.println(sum);

        List<Integer> result = list2.stream().filter((value) -> value > 2).collect(toList());
        result.forEach(System.out::println);

        List<String> result2 = list2.stream().map(value -> String.format("String:%s", value)).collect(toList());
        result2.forEach(System.out::println);

        // 用于收集统计数据的状态对象，例如count，min，max，sum和平均。
        IntSummaryStatistics stats = list2.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Max : " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Sun: " + stats.getSum());
        System.out.println("Average : " + stats.getAverage());
        System.out.println("Count : " + stats.getCount());
        System.out.println("toString : " + stats.toString());

    }


}
