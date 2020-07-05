package com.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class ParentMenuComponent extends MenuComponent {

    private List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    private String name;
    private String description;

    public ParentMenuComponent(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }

    @Override
    void add(MenuComponent component) {
        menuComponents.add(component);
    }

    @Override
    void remove(MenuComponent component) {
        menuComponents.remove(component);
    }

    @Override
    List<MenuComponent> getSubMenus() {
        return menuComponents;
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

        for (MenuComponent menuComponent : menuComponents) {
            System.out.println("Submenu Name : " + menuComponent.getName());
            System.out.println("Submenu Description : " + menuComponent.getDescription());
            menuComponent.print();
        }
    }
}
