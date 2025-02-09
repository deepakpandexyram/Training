package com.xyram.abstractclass.nonabstractclasspattern;

import java.math.BigDecimal;

public class HRClient {
    public void printdetail(String type){
        if(type.equals("Developer")){
            Developer developer = new Developer("Neeraj", "Lucknow",
                    new BigDecimal(30000), "B.Tech", "IIT",
                    new BigDecimal(10000));
            developer.printDevDetails();
        } else if(type.equals("SalesAssociate")) {
            SalesAssociate salesAssociate = new SalesAssociate("Pankaj", "Bangalore",
                    new BigDecimal(25000),"Godrage", "Marathalli",
                    new BigDecimal(7000));
           salesAssociate.printSalePerDetails();
        } else if(type.equals("Architecht")){
            Architect architect = new Architect("Manoj", "Manglore",
                    new BigDecimal(50000), "5 years as Architect", true,
                    new BigDecimal(10000));
            architect.printArchDetail();
        } else{
            throw new RuntimeException("Person type is not available in the organization");
        }
    }
}
