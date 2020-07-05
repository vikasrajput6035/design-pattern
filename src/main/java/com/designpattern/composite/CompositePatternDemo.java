package com.designpattern.composite;

public class CompositePatternDemo {

    public static void main(String[] args) {

        // Home
        // Services -> IT Services, HR Services, Consulting Services
        // Contact US
        
        MenuComponent menuComponent = new ParentMenuComponent("Website Main Menu","Main Website Menu Description");
        
        MenuComponent home = new ChildMenuComponent("Home","Home Description");
        MenuComponent services = new ParentMenuComponent("Services", "Service Description");
        MenuComponent itServices = new ChildMenuComponent("IT Services", "IT Services Description");
        MenuComponent hrServices = new ChildMenuComponent("HR Services", "HR Services Description");
        MenuComponent consultingServices = new ChildMenuComponent("Consulting Services", "Consulting Services Description");
        services.add(itServices);
        services.add(hrServices);
        services.add(consultingServices);
        MenuComponent contact = new ChildMenuComponent("Contact Us","Contact Us Description");
        
        menuComponent.add(home);
        menuComponent.add(services);
        menuComponent.add(contact);
        menuComponent.print();
    }
    
    
}
