package com.example;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void getAllUsers() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        List<User> expected = User.getAllUsers();

        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetAllUsers() {
    }

    @Test
    public void hasUser() {
    }

    @Test
    public void getHowManyUsers() {
    }

    @Test
    public void testGetHowManyUsers() {
    }

    @Test
    public void getAllAgeUsers() {
    }

    @Test
    public void testGetAllAgeUsers() {
    }

    @Test
    public void getAverageAgeOfAllUsers() {
    }

    @Test
    public void testGetAverageAgeOfAllUsers() {
    }

    @Test
    public void getId() {
    }

    @Test
    public void getName() {
    }

    @Test
    public void getAge() {
    }

    @Test
    public void getSex() {
    }
}