package com.xyram.interfacepackage.noninterface;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SalesAssociate {
    private String name;
    private String address;
    private BigDecimal basicSalary;
    private String salesExperience;
    private String salesArea;
    private BigDecimal salesComission;
    private boolean confidentialRoomAccess;

    public SalesAssociate(String name, String address, BigDecimal basicSalary, String salesExperience, String salesArea, BigDecimal salesComission) {
        this.name = name;
        this.address = address;
        this.basicSalary = basicSalary;
        this.salesExperience = salesExperience;
        this.salesArea = salesArea;
        this.salesComission = salesComission;
    }

    public BigDecimal calSaleAssocSalary(){
        return basicSalary.add(salesComission);
    }

    public void printSalePerDetails(){
        System.out.println(getName() + " " + getAddress() + " " + salesArea + " " + salesExperience);
    }

    public void allowSalesPersonAccess(){
        confidentialRoomAccess = false;
    }
}
