package com.xyram.abstractclass.nonabstractclasspattern;

import java.math.BigDecimal;

public class AccountingClient {
    public void calSalary(String type){
        if(type.equals("Developer")){
            Developer developer = new Developer("Neeraj", "Lucknow",
                    new BigDecimal(30000), "B.Tech", "IIT",
                    new BigDecimal(10000));
            System.out.println(developer.calculateDevSalary());
        } else if(type.equals("SalesAssociate")) {
            SalesAssociate salesAssociate = new SalesAssociate("Pankaj", "Bangalore",
                    new BigDecimal(25000),"Godrage", "Marathalli",
                    new BigDecimal(7000));
            System.out.println(salesAssociate.calSaleAssocSalary());
        } else if(type.equals("Architect")){
            Architect architect = new Architect("Manoj", "Manglore",
                    new BigDecimal(50000), "5 years as Architect", true,
                    new BigDecimal(10000));
            System.out.println(architect.calculateArchSal());
        } else{
            throw new RuntimeException("Person type is not available in the organization");
        }
    }
}
