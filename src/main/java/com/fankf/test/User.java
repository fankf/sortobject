package com.fankf.test;

public class User {
    private int id;
    private String name;
    private String age;

    public User() {
    }

    public User(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "id: " + id + " name: " + name + " age: " + age;
    }
}
