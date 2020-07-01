package com.designpattern.template;

public class PermanentEmployeeContract extends EmployeeContract {

    @Override
    void addPersonDetails() {
        System.out.println("Person detail is added");
    }

    @Override
    void addPrevEmploymentDetails() {
        System.out.println("Previous Employement Details added");
    }

}
