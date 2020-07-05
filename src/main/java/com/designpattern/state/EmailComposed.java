package com.designpattern.state;

public class EmailComposed implements State {

    private EmailApp emailApp;
    
    public EmailComposed(EmailApp emailApp) {
        this.emailApp = emailApp;
    }
    

    @Override
    public void composeEmail() {
        System.out.println("Action Denied! Email Already Composed");
    }

    @Override
    public void addRecipients() {
        emailApp.setCurrentState(emailApp.getRecipientAdded());
        System.out.println("Recipients Added Successfully");
    }

    @Override
    public void sendEmail() {
        System.out.println("Action Denied! Can't Send without adding recipient in the email");
    }

    @Override
    public String toString() {
        return "Email Composed";
    }
}
