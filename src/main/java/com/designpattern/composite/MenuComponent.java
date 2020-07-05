package com.designpattern.composite;

import java.util.List;

public abstract class MenuComponent {
    
    void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }
    
    void remove(MenuComponent component) {
        throw new UnsupportedOperationException();
    }
    
    List<MenuComponent> getSubMenus(){
        throw new UnsupportedOperationException();
    }
    
    String getName() {
        throw new UnsupportedOperationException();
    }
    
    String getDescription() {
        throw new UnsupportedOperationException();
    }
    
    void print() {
        throw new UnsupportedOperationException();
    }
}
