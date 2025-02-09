package com.xyram.interfacepackage.interfacepattern;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Architect implements Person {
    private String name;
    private String address;
    private BigDecimal basicSalary;
    private String architectExperience;
    private boolean isMicroServiceExp;
    private BigDecimal architectCommission;
    private boolean allowRestrictedAccess;

    public Architect(String name, String address, BigDecimal basicSalary, String architectExperience, boolean isMicroServiceExp, BigDecimal architectCommission) {
        this.name = name;
        this.address = address;
        this.basicSalary = basicSalary;
        this.architectExperience = architectExperience;
        this.isMicroServiceExp = isMicroServiceExp;
        this.architectCommission = architectCommission;
    }

    @Override
    public BigDecimal calculateSalary() {
        return getBasicSalary().add(architectCommission);
    }

    @Override
    public void printDetail() {
        System.out.println(name + " " + address + " " + architectExperience + " " + isMicroServiceExp);
    }

    @Override
    public void allowResrictedAcces() {
        this.allowRestrictedAccess = true;
    }
}
