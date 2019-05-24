package com.example.demo.collect;

import java.util.*;
import java.util.stream.Collectors;

public class TestMessageList {


    public static void main(String[] args) {
        List<Message> list1 = new ArrayList<>();
        list1.add(new Message(1L, "a", new Date()));
        list1.add(new Message(2L, "b", new Date()));
        list1.add(new Message(4L, "b", new Date()));
        list1.add(new Message(3L, "c", new Date()));

        List<Message> list = getMessageList();
        System.out.print("删除前:");
        list.stream().forEach(item -> System.out.print(item));

        Iterator<Message> it = list.iterator();
        while (it.hasNext()) {
            Message s = it.next();
            if (s.getMsg().equals("b")) {
                it.remove();
            }
        }
        System.out.print("\n删除后:");
        list.stream().forEach(item -> System.out.print(item));
    }

    private static List<Message> getMessageList() {
        List<Message> list = new ArrayList<>();
        list.add(new Message(1L, "a", new Date()));
        list.add(new Message(2L, "b", new Date()));
        list.add(new Message(4L, "b", new Date()));
        list.add(new Message(3L, "c", new Date()));
        return list;
    }

    private static void TestArrayList() {
        List<Message> list = getMessageList();
        System.out.print("删除前:");
        list.stream().forEach(item -> System.out.print(item));

        Iterator<Message> it = list.iterator();
        while (it.hasNext()) {
            Message s = it.next();
            if (s.getMsg().equals("b")) {
                it.remove();
            }
        }
        System.out.print("\n删除后:");
        list.stream().forEach(item -> System.out.print(item));
    }

    private static void filterList() {
        List<Message> list1 = getMessageList();
        //过滤所有msg是b的记录
        List<Message> list2 = list1.stream().filter(s -> !s.getMsg().equals("b")).collect(Collectors.toList());
        list2.stream().forEach(item -> System.out.println(item));
    }

    //对单个字段排序
    private static void sortList() {
        List<Message> list = getMessageList();
        if (list != null && !list.isEmpty()) {
            System.out.println("===排序前如下===");
            list.stream().forEach(item -> System.out.println(item));

            //根据Id升序排序
            list.sort((a, b) -> a.getId().compareTo(b.getId()));

            //根据Id升序排序(简写)
            list.sort(Comparator.comparing(Message::getId));

            //根据Id降序排序(简写)
            list.sort(Comparator.comparing(Message::getId).reversed());

            System.out.println("===排序后如下===");
            list.stream().forEach(item -> System.out.println(item));
        }
    }

    //对多个字段排序
    private static void sortAllList(){
        List<Message> list = getMessageList();
        if (list != null && !list.isEmpty()){
            System.out.println("===排序前如下===");
            list.stream().forEach(item -> System.out.println(item));

            //根据多条件组合排序,先根据msg(升序),再根据id(升序)
            list.sort(Comparator.comparing(Message:: getMsg).thenComparing(Message::getId));

            //根据多条件组合排序,先根据msg(升序),再根据id(降序)
            list.sort(Comparator.comparing(Message:: getMsg).thenComparing(Comparator.comparing(Message::getId).reversed()));

            //根据多条件组合排序,先根据msg(降序),再根据id(降序)
            list.sort(Comparator.comparing(Message:: getMsg).thenComparing(Message::getId).reversed());

            //根据多条件组合排序,先根据msg(降序),再根据id(升序)
            list.sort(Comparator.comparing(Message:: getMsg).reversed().thenComparing(Message::getId));

            System.out.println("===排序后如下===");
            list.stream().forEach(item -> System.out.println(item));
        }
    }

    //list 转换为map
    private static void listToMap(){
        List<Message> list = getMessageList();
        Map<String, Message> map = list.stream().collect(Collectors.toMap(Message :: getMsg, a-> a, (k1, k2) -> k1));
        System.out.println(map.size());
    }




    // List求和、求最大值、平均值
    private static void statisticsList() {
        List<Message> list = getMessageList();
        //求和
        Long sum = list.stream().mapToLong(Message::getId).sum();
        System.out.println("sum = " + sum);

        //求最大值
        Optional<Message> maxMassage = list.stream().collect(Collectors.maxBy(Comparator.comparing(Message::getId)));
        Long maxId = maxMassage.get().getId();
        System.out.println("maxId = " + maxId);


        LongSummaryStatistics lss = list.stream().collect(Collectors.summarizingLong(Message::getId));
        System.out.println("sum = " + lss.getSum());
        System.out.println("max = " + lss.getMax());
        System.out.println("min = " + lss.getMin());
        System.out.println("avg = " + lss.getAverage());
    }
}
