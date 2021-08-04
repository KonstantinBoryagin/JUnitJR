package com.example;

import java.util.*;

public class User {

    private int id;
    private String name;
    private int age;
    private Sex sex;
    private static Map<Integer, User> allUsers;
    private static int countId = 0;

    public User(String name, int age, Sex sex) {
        if (allUsers == null) {
            allUsers = new HashMap<>();
        }

        this.name = name;
        this.age = age;
        this.sex = sex;

        if (!hasUser()) {
            countId++;
            this.id = countId;
            allUsers.put(id, this);
        }
    }

    public static List<User> getAllUsers() {
        return new ArrayList<>(allUsers.values());
    }

    public static List<User> getAllUsers(Sex sex) {

    }

    public boolean hasUser() {
        for (User user : allUsers.values()) {
            if (user.equals(this) && user.hashCode() == this.hashCode()) {
                return true;
            }
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(sex, user.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
