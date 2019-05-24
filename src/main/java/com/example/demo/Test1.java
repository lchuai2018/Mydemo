package com.example.demo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String>  list=new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("9");
        list.add("10");
        list.add("11");
        list.add("12");


        int page = 3;//相当于pageNo
        int count = 10;//相当于pageSize
        int size = list.size();
        int pageCount=size/count;
        int fromIndex = count * (page - 1);
        int toIndex = fromIndex + count;
        if (toIndex >= size) {
            toIndex = size;
        }
        if(page>pageCount+1){
            fromIndex=0;
            toIndex=0;
        }

        System.out.println(list.subList(fromIndex, toIndex));
        System.out.println(size);
/*        Integer pageNo=2;
        Integer pageSize=10;

         pageNo=(pageNo-1)*pageSize;   //每页的起始索引


        Integer sum = list.size(); //记录总数

        if (pageNo+pageSize > sum) {
            list = list.subList(pageNo,sum );
        }else {
            list = list.subList(pageNo,pageNo+pageSize);
        }
        System.out.println("结果"+list);*/

    }



}
