package com.designpattern.adapter;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        ApplicationLogin applicationLogin = new ApplicationLogin();
        UserAccount userAccount = new SystemUserAccount("John", "Adams", "john@gmail.com", "7874912389");
        applicationLogin.login(userAccount);
        
        FBUserAccount fbUserAccount = new FBUserAccount("Peter", "Johnas", "peter@gmail.com", "445233223");
        FBUserAdapter fbUserAdapter = new FBUserAdapter(fbUserAccount);
        applicationLogin.login(fbUserAdapter);
    }

}
