package com.designpattern.state;

public class RecipientAdded implements State {

    private EmailApp emailApp;
    
    public RecipientAdded(EmailApp emailApp) {
        this.emailApp = emailApp;
    }
    

    @Override
    public void composeEmail() {
        System.out.println("Action Denied! Email Already Composed");
    }

    @Override
    public void addRecipients() {
        System.out.println("Action Denied! Recipients Already Added");
    }

    @Override
    public void sendEmail() {
        emailApp.setCurrentState(emailApp.getEmailSent());
        System.out.println("Email Sent Successfully");
    }

    @Override
    public String toString() {
        return "Recipient Added";
    }
}
