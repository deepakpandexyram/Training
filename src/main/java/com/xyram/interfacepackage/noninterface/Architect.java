package com.xyram.interfacepackage.noninterface;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Architect {
    private String name;
    private String address;
    private BigDecimal basicSalary;
    private String architectExperience;
    private boolean isMicroServiceExp;
    private BigDecimal architectCommission;
    private boolean confidentialRoomAccess;

    public Architect(String name, String address, BigDecimal basicSalary, String architectExperience, boolean isMicroServiceExp, BigDecimal architectCommission) {
        this.name = name;
        this.address = address;
        this.basicSalary = basicSalary;
        this.architectExperience = architectExperience;
        this.isMicroServiceExp = isMicroServiceExp;
        this.architectCommission = architectCommission;
    }

    public BigDecimal calculateArchSal(){
        return basicSalary.add(architectCommission);
    }

    public void printArchDetail(){
        System.out.println(getName() + " " + getAddress() + " " + architectExperience + " " + isMicroServiceExp);
    }

    public void allowArcitectAccess(){
        confidentialRoomAccess = true;
    }

}
