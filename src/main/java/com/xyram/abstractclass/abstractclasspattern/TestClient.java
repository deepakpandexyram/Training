package com.xyram.abstractclass.abstractclasspattern;

import java.math.BigDecimal;

public class TestClient {
    public static void main(String[] args){
        Developer developer = new Developer("Neeraj", "Lucknow",
                new BigDecimal(30000), "B.Tech", "IIT",
                new BigDecimal(10000));
        SalesAssociate salesAssociate = new SalesAssociate("Pankaj", "Bangalore",
                new BigDecimal(25000), new BigDecimal(7000), "Godrage", "Marathalli", new BigDecimal(2000) );
        Architect architect = new Architect("Manoj", "Manglore",
                new BigDecimal(50000), new BigDecimal(10000),"5 years as Architect", true, new BigDecimal(10000));

        AccountDepartment accountClient = new AccountDepartment();
        accountClient.calculateSalary(developer);

        HRDepartment hrClient = new HRDepartment();
        hrClient.printdetail(architect);

        AdminDepartment adminClient = new AdminDepartment();
        adminClient.allowRestrictedAccess(salesAssociate);
    }
}
