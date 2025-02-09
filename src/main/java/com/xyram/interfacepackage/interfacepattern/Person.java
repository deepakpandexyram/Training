package com.xyram.interfacepackage.interfacepattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

public interface Person {
    public BigDecimal calculateSalary();
    public void printDetail();
    public void allowResrictedAcces();
}
