package com.designpattern.template;

public class TemplatePatternDemo {

    public static void main(String[] args) {
        PermanentEmployeeContract permanentEmp = new PermanentEmployeeContract();
        permanentEmp.prepareContract();
        
        ContractualEmployeeContract contractualEmployee = new ContractualEmployeeContract();
        contractualEmployee.prepareContract();
    }

}
