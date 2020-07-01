package com.designpattern.template;

public class ContractualEmployeeContract extends EmployeeContract {

    @Override
    void addPersonDetails() {
        System.out.println("Person detail is added");
    }

    @Override
    void addPrevEmploymentDetails() {
        System.out.println("Previous Employement Details added");
    }

    @Override
    boolean isContractual() {
        return true;
    }
}
