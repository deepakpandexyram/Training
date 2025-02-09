package com.xyram.interfacepackage.noninterface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {
    private String name;
    private String address;
    private BigDecimal basicSalary;
    private boolean confidentialRoomAccess;
}
