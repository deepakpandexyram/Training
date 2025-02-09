package com.xyram.abstractclass.abstractclasspattern;

import java.math.BigDecimal;

public class Developer extends Person {
    private String highestQualification;
    private String collegeName;
    private boolean confidentialRoomAccess;

    public Developer(String name, String address, BigDecimal basicSalary, String highestQualification, String collegeName, BigDecimal fixedSalAmnt) {
        super(name, address, basicSalary, fixedSalAmnt);
        this.highestQualification = highestQualification;
        this.collegeName = collegeName;
    }

    public BigDecimal calculateDevSalary(){
        BigDecimal salaryBasicComponent = super.calculateSalary();
        return getBasicSalary().add(salaryBasicComponent);
    }

    public void printDevDetails(){
        super.printDetail();
        System.out.println(collegeName + " " + highestQualification);
    }

    @Override
    public void allowResrictedAcces() {
        setAllowRestrictedAccess(false);
    }
}
