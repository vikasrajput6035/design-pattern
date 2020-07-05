package com.designpattern.state;

public class StatePatternDemo {

    public static void main(String[] args) {
        EmailApp emailApp = new EmailApp();
        emailApp.composeEmail();
        emailApp.addRecipients();
        emailApp.addRecipients();
        emailApp.composeEmail();
        emailApp.sendEmail();
        System.out.println(emailApp);
    }

}
