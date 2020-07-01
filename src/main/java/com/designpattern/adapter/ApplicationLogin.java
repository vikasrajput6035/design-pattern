package com.designpattern.adapter;

public class ApplicationLogin {

    void login(UserAccount userAccount) {
        System.out.println("User "+userAccount.getFirstName()+" "+userAccount.getLastName()+" is logging into the system...");
    }
}
