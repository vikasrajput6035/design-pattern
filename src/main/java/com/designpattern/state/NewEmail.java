package com.designpattern.state;

public class NewEmail implements State {

    private EmailApp emailApp;
    
    public NewEmail(EmailApp emailApp) {
        this.emailApp = emailApp;
    }
    
    @Override
    public void composeEmail() {
        emailApp.setCurrentState(emailApp.getEmailComposed());
        System.out.println("Email is composed!");
    }

    @Override
    public void addRecipients() {
        System.out.println("Action Denied! Please compose the email before adding recipients");
    }

    @Override
    public void sendEmail() {
        System.out.println("Action Denied! Can't Send without composing and adding recipient in the email");
    }

    @Override
    public String toString() {
        return "New Email";
    }
}
