package com.example.demo.collect;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.mongodb.morphia.aggregation.Projection.add;

public class TestLiatCart {
    public static void main(String[] args) {
        List<Cart> list = new ArrayList<Cart>(3);
        Cart cart1 = new Cart();
        cart1.setId(1);
        cart1.setCategoryId(1);
        cart1.setCount(1);
        list.add(cart1);

        Cart cart2 = new Cart();
        cart2.setId(2);
        cart2.setCategoryId(1);
        cart2.setCount(1);
        add(cart2);

        Cart cart3 = new Cart();
        cart3.setId(3);
        cart3.setCategoryId(2);
        cart3.setCount(1);
        add(cart3);

        //相同分类id的商品数量求和：

        Integer sum = list.stream().filter(item -> item.getCategoryId().equals(1)).collect(Collectors.toList()).stream().mapToInt(Cart::getCount).sum();

        System.out.println("总和"+sum);
    }


}
