package com.designpattern.adapter;

public class FBUserAccount {

    private String firstName;
    private String lastName;
    private String mbNo;
    private String emailId;
    
    public FBUserAccount(String firstName, String lastName, String emailId, String mbNo) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.mbNo = mbNo;
    }
    
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getMbNo() {
        return mbNo;
    }
    public String getEmailId() {
        return emailId;
    }
    
    
    
}
