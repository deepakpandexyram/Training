package com.xyram.abstractclass.abstractclasspattern;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Architect extends Person {
    private String architectExperience;
    private boolean isMicroServiceExp;
    private BigDecimal architectCommission;

    public Architect(String name, String address, BigDecimal basicSalary,BigDecimal fixedSalAmnt, String architectExperience, boolean isMicroServiceExp, BigDecimal architectCommission) {
        super(name, address, basicSalary, fixedSalAmnt);
        this.architectExperience = architectExperience;
        this.isMicroServiceExp = isMicroServiceExp;
        this.architectCommission = architectCommission;
    }

    @Override
    public BigDecimal calculateSalary() {
        return super.calculateSalary().add(architectCommission);
    }

    @Override
    public void printDetail() {
        super.printDetail();
        System.out.println(architectExperience + " " + isMicroServiceExp);
    }

    @Override
    public void allowResrictedAcces() {
        setAllowRestrictedAccess(true);
    }
}
