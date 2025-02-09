package com.xyram.interfacepackage.noninterface;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Developer {
    private String name;
    private String address;
    private BigDecimal basicSalary;
    private String highestQualification;
    private String collegeName;
    private BigDecimal fixedSalAmnt;
    private boolean confidentialRoomAccess;

    public Developer(String name, String address, BigDecimal basicSalary, String highestQualification, String collegeName, BigDecimal fixedSalAmnt) {
        this.name = name;
        this.address = address;
        this.basicSalary = basicSalary;
        this.highestQualification = highestQualification;
        this.collegeName = collegeName;
        this.fixedSalAmnt = fixedSalAmnt;
    }

    public BigDecimal calculateDevSalary(){
        return basicSalary.add(fixedSalAmnt);
    }

    public void printDevDetails(){
        System.out.println(name + " " + getAddress() + " " +getCollegeName() + " " + getHighestQualification());
    }

    public void allowDeveloperAccess(){
        confidentialRoomAccess = false;
    }
}
