package com.xyram.abstractclass.abstractclasspattern;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SalesAssociate extends Person {
    private String salesExperience;
    private String salesArea;
    private BigDecimal salesComission;

    public SalesAssociate(String name, String address, BigDecimal basicSalary, BigDecimal fixedSalary, String salesExperience, String salesArea, BigDecimal salesComission) {
        super(name, address, basicSalary, fixedSalary);
        this.salesExperience = salesExperience;
        this.salesArea = salesArea;
        this.salesComission = salesComission;
    }

    @Override
    public BigDecimal calculateSalary() {
        return super.calculateSalary().add(salesComission);
    }

    @Override
    public void printDetail() {
        super.printDetail();
        System.out.println(salesArea + " " + salesExperience);
    }

    @Override
    public void allowResrictedAcces() {
        setAllowRestrictedAccess(true);
    }
}
