package com.designpattern.proxy.virtual;

public class UserRepository {
    
    public User getUserFromDB(String userId){
        User user = new ActualUser(userId, "John", "Doe", "john@gmail.com");
        return user;
    }
}
