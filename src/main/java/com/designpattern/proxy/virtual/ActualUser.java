package com.designpattern.proxy.virtual;

public class ActualUser implements User {

    private String userId;
    private String name;
    private String contact;
    private String email;

    public ActualUser(String userId, String name, String contact, String email){
        this.userId = userId;
        this.name = name;
        this.contact = contact;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getContact() {
        return this.contact;
    }

    public String getEmail() {
        return this.email;
    }

    public String getUserId() {
        return this.userId;
    }

}
