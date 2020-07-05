package com.designpattern.state;

public class EmailSent implements State {

    private EmailApp emailApp;
    
    public EmailSent(EmailApp emailApp) {
        this.emailApp = emailApp;
    }
    

    @Override
    public void composeEmail() {
        System.out.println("Action Denied! Email Already Composed");
    }

    @Override
    public void addRecipients() {
        System.out.println("Action Denied! Recipient Already Added");
    }

    @Override
    public void sendEmail() {
        System.out.println("Action Denied! Email Already Sent");
    }

    @Override
    public String toString() {
        return "Email Sent";
    }
}
