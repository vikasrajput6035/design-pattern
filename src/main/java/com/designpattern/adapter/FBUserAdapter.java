package com.designpattern.adapter;

public class FBUserAdapter implements UserAccount {

    private FBUserAccount fbUserAccount;
    
    public FBUserAdapter(FBUserAccount fbUserAccount) {
        this.fbUserAccount = fbUserAccount;
    }

    public String getFirstName() {
        return fbUserAccount.getFirstName();
    }

    public String getLastName() {
        return fbUserAccount.getLastName();
    }

    public String getEmail() {
        return fbUserAccount.getEmailId();
    }

    public String getContactNo() {
        return fbUserAccount.getMbNo();
    }

}
