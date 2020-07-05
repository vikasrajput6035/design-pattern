package com.designpattern.composite;

public class ChildMenuComponent extends MenuComponent {

    private String name;
    private String description;

    public ChildMenuComponent(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    void print() {
        System.out.println("Name : " + getName());
        System.out.println("Description : " + getDescription());
    }
}
