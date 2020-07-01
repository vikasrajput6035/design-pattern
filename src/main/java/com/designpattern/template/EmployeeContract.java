package com.designpattern.template;

public abstract class EmployeeContract {

    void prepareContract() {
        addCompanyContactInfo();
        addCompanyPolicy();
        addPersonDetails();
        addPrevEmploymentDetails();
        if(isContractual()) { //here isContractual() method acts as hook
            addLeaveBenefits();
            addHealthInsuranceBenefits();
        }
    }

    void addCompanyContactInfo() {
        System.out.println("XYZ Inc, California");
    }
    
    void addCompanyPolicy() {
        System.out.println("Company Policy Added");
    }
    
    abstract void addPersonDetails();
    
    abstract void addPrevEmploymentDetails();
    
    //hook method provides default implementation. It is used to execute optional steps of an algorithm in template method.
    boolean isContractual() {
        return false;
    }
    
    void addLeaveBenefits() {
        System.out.println("30 days annual leave added...");
    }
    
    void addHealthInsuranceBenefits() {
        System.out.println("XYX Health Insurance added...");
    }
}
