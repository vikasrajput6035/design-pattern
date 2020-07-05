package com.designpattern.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ReadAndWriteInvocationHandler implements InvocationHandler{

    private Employee employee;
    
    public ReadAndWriteInvocationHandler(Employee employee) {
        this.employee = employee;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        
        if(method.getName().contains("get") || method.getName().contains("set") || method.getName().contains("toString")) {
            return method.invoke(employee, args);
        }else {
            return "Access Denied";
        }
    }

}
