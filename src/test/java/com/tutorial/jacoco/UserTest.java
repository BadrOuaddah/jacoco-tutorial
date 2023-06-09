package com.tutorial.jacoco;

import org.junit.Assert;
import org.junit.Test;



public class UserTest {

    User user = new User();

    @Test
    public void testUserWithName() {
        Assert.assertEquals("Username : Davie is added successfully",user.addUser("Davie"));
    }
    @Test
    public void testUserWithNull() {
        Assert.assertEquals("Please provide the username",user.addUser(null));
    }

}