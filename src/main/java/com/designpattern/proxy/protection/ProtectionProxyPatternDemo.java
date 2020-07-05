package com.designpattern.proxy.protection;

import java.lang.reflect.Proxy;

public class ProtectionProxyPatternDemo {

    public static void main(String[] args) {

        ProtectionProxyPatternDemo demo = new ProtectionProxyPatternDemo();
        Employee employee = new EmployeeBean("John", "$ 25,000", "Graphics Designer");
        System.out.println("Initial Employee Information: "+employee);
        Employee employeeReadOnly = demo.getReadProxy(employee);
        employeeReadOnly.setName("Peter");
        System.out.println("Emp ReadOnly after trying to set Name: " + employeeReadOnly);

        Employee employeeReadAndWrite = demo.getReadAndWriteProxy(employee);
        employeeReadAndWrite.setName("John Doe Jr.");
        employeeReadAndWrite.setDesignation("Sr. Java Programmer");
        System.out.println("Emp with Read and write access trying to set Designation and name: " + employeeReadAndWrite);
    }

    public Employee getReadProxy(Employee employee) {
        Employee proxyEmp = (Employee) Proxy.newProxyInstance(
            employee.getClass().getClassLoader(),
            employee.getClass().getInterfaces(),
            new ReadInvocationHandler(employee));
        return proxyEmp;
    }

    public Employee getReadAndWriteProxy(Employee employee) {
        Employee proxyEmp = (Employee) Proxy.newProxyInstance(
            employee.getClass().getClassLoader(),
            employee.getClass().getInterfaces(),
            new ReadAndWriteInvocationHandler(employee));
        return proxyEmp;
    }
}