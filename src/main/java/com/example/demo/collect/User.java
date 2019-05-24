package com.example.demo.collect;

public class User {

    private Long age;
    private String name;

    public User(Long i, String s) {
        this.age = i;
        this.name = s;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [age=" + age + ", name=" + name + "]";
    }


}
