package com.tutorial.jacoco;

public class User {
    public String addUser (String username){
        if(username == null || username.trim().length() == 0){
            return "Please provide the username";
        }
        else if (username.equalsIgnoreCase("Admin")) {
            return "Username Admin is not allowed";
        }
        else {
            return "Username : " + username + " is added successfully";
        }
    }
}
