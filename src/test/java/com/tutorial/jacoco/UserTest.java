package com.tutorial.jacoco;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class UserTest {

    User user = new User();

    @Test
    void testUserWithName() {
        Assert.assertEquals("Username : Davie is added successfully",user.addUser("Davie"));
    }
    @Test
    void testUserWithNull() {
        Assert.assertEquals("Please provide the username",user.addUser(null));
    }
}