package com.xyram.interfacepackage.interfacepattern;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Developer implements Person {
    private String name;
    private String address;
    private BigDecimal basicSalary;
    private String highestQualification;
    private String collegeName;
    private BigDecimal fixedSalAmnt;
    private boolean allowRestrictedAccess;

    public Developer(String name, String address, BigDecimal basicSalary, String highestQualification, String collegeName, BigDecimal fixedSalAmnt) {
        this.name = name;
        this.address = address;
        this.basicSalary = basicSalary;
        this.highestQualification = highestQualification;
        this.collegeName = collegeName;
        this.fixedSalAmnt = fixedSalAmnt;
    }

    public BigDecimal calculateDevSalary(){
        return getBasicSalary().add(fixedSalAmnt);
    }

    public void printDevDetails(){
        System.out.println(getName() + " " + getAddress() + " " +getCollegeName() + " " + getHighestQualification());
    }

    @Override
    public BigDecimal calculateSalary() {
        return basicSalary.add(fixedSalAmnt);
    }

    @Override
    public void printDetail() {
        System.out.println(getName() + " " + address + " " + collegeName + " " + highestQualification);
    }

    @Override
    public void allowResrictedAcces() {
        this.allowRestrictedAccess = false;
    }
}
