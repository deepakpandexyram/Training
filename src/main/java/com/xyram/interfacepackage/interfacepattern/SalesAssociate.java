package com.xyram.interfacepackage.interfacepattern;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SalesAssociate implements Person {
    private String name;
    private String address;
    private BigDecimal basicSalary;
    private String salesExperience;
    private String salesArea;
    private BigDecimal salesComission;
    private boolean allowRestrictedAccess;

    public SalesAssociate(String name, String address, BigDecimal basicSalary, String salesExperience, String salesArea, BigDecimal salesComission) {
        this.name = name;
        this.address = address;
        this.basicSalary = basicSalary;
        this.salesExperience = salesExperience;
        this.salesArea = salesArea;
        this.salesComission = salesComission;
    }

    @Override
    public BigDecimal calculateSalary() {
        return basicSalary.add(salesComission);
    }

    @Override
    public void printDetail() {
        System.out.println(name + " " + address + " " + salesArea + " " + salesExperience);
    }

    @Override
    public void allowResrictedAcces() {
        this.allowRestrictedAccess = false;
    }
}
