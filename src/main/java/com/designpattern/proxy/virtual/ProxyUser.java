package com.designpattern.proxy.virtual;

public class ProxyUser implements User {

    private ActualUser actualUser;
    private String userId;
    private String name = "No Name";
    private String contact = "No Contact";
    private String email = "No Email";
    
    public ProxyUser(String userId) throws InterruptedException {
        super();
        
        Thread thread = new Thread(() -> {
            UserRepository repository = new UserRepository();
            User user = repository.getUserFromDB(userId);
            this.actualUser = (ActualUser) user;
        });
        thread.sleep(1000);
        thread.start();
    }

    public String getName() {
        
        if(actualUser == null) {
            return this.name;
        }else {
            return actualUser.getName();
        }
    }

    public String getContact() {
        if(actualUser == null) {
            return this.contact;
        }else {
            return actualUser.getContact();
        }
    }

    public String getEmail() {
        if(actualUser == null) {
            return this.email;
        }else {
            return actualUser.getName();
        }
    }

    public String getUserId() {
        return this.userId;
    }

}
