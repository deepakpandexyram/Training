package com.xyram.abstractclass.abstractclasspattern;

import java.math.BigDecimal;

public abstract class Person {
    private String name;
    private String address;
    private BigDecimal basicSalary;
    private BigDecimal fixedSalary;

    public boolean isAllowRestrictedAccess() {
        return allowRestrictedAccess;
    }

    public void setAllowRestrictedAccess(boolean allowRestrictedAccess) {
        this.allowRestrictedAccess = allowRestrictedAccess;
    }

    public BigDecimal getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(BigDecimal fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    private boolean allowRestrictedAccess;

    public Person(String name, String address, BigDecimal basicSalary, BigDecimal fixedSalary) {
        this.name = name;
        this.address = address;
        this.basicSalary = basicSalary;
        this.fixedSalary = fixedSalary;
    }

    public BigDecimal calculateSalary(){
        return basicSalary.add(fixedSalary);
    }
    public void printDetail(){
        System.out.println(this.name + " " + this.address);
    }

    abstract public void allowResrictedAcces();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(BigDecimal basicSalary) {
        this.basicSalary = basicSalary;
    }
}
