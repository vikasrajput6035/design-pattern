package com.designpattern.adapter;

public class SystemUserAccount implements UserAccount {

    private String firstName;
    private String lastName;
    private String email;
    private String contactNo;

    public SystemUserAccount(String firstName, String lastName, String email, String contactNo) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contactNo = contactNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNo() {
        return contactNo;
    }

}
