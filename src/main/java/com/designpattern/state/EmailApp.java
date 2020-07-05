package com.designpattern.state;

public class EmailApp {
    
    private State newEmail;
    private State emailComposed;
    private State recipientAdded;
    private State emailSent;
    private State currentState;
    
    public EmailApp() {
        super();
        newEmail = new NewEmail(this);
        emailComposed = new EmailComposed(this);
        recipientAdded = new RecipientAdded(this);
        emailSent = new EmailSent(this);
        
        currentState = newEmail;
    }

    public State getNewEmail() {
        return newEmail;
    }

    public State getEmailComposed() {
        return emailComposed;
    }

    public State getRecipientAdded() {
        return recipientAdded;
    }

    public State getEmailSent() {
        return emailSent;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    @Override
    public String toString() {
        return "EmailApp [currentState=" + currentState + "]";
    }
    
    public void composeEmail() {
        currentState.composeEmail();
    }
    
    public void addRecipients() {
        currentState.addRecipients();
    }
    
    public void sendEmail() {
        currentState.sendEmail();
    }
}
