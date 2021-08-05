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
    public void getAllUsersNOT_NULL() {
        List<User> expected = User.getAllUsers();
        assertNotNull(expected);
    }

    @Test
    public void GetAllUsers_MALE() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        List<User> expected = User.getAllUsers(Sex.MALE);

        List<User> actual = new ArrayList<>();
        actual.add(user);

        assertEquals(expected, actual);

    }

    @Test
    public void GetAllUsers_MALE_NOT_NULL() {
        List<User> expected = User.getAllUsers(Sex.MALE);
        assertNotNull(expected);
    }

    @Test
    public void GetAllUsers_FEMALE() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        List<User> expected = User.getAllUsers(Sex.FEMALE);
        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);

        assertEquals(expected, actual);
    }

    @Test
    public void GetAllUsers_FEMALE_NOT_NULL() {
        List<User> expected = User.getAllUsers(Sex.FEMALE);
        assertNotNull(expected);
    }

    @Test
    public void getHowManyUsers() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        int expected = User.getHowManyUsers();
        int actual = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void GetHowManyUsers_MALE() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        int expected = User.getHowManyUsers(Sex.MALE);
        int actual = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void GetHowManyUsers_FEMALE() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        int expected = User.getHowManyUsers(Sex.FEMALE);
        int actual = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsers() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        int expected = User.getAllAgeUsers();
        int actual = 76;

        assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsers_MALE() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        int expected = User.getAllAgeUsers(Sex.MALE);
        int actual = 35;

        assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsers_FEMALE() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        int expected = User.getAllAgeUsers(Sex.FEMALE);
        int actual = 41;

        assertEquals(expected, actual);
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