package com.xyram.interfacepackage.interfacepattern;

import java.math.BigDecimal;

public class TestClient {
    public static void main(String[] args){
        Person developer = new Developer("Neeraj", "Lucknow",
                new BigDecimal(30000), "B.Tech", "IIT",
                new BigDecimal(10000));
        Person salesAssociate = new SalesAssociate("Pankaj", "Bangalore",
                new BigDecimal(25000),"Godrage", "Marathalli",
                new BigDecimal(7000));
        Person architect = new Architect("Manoj", "Manglore",
                new BigDecimal(50000), "5 years as Architect", true,
                new BigDecimal(10000));

        AccountDepartment accountClient = new AccountDepartment();
        accountClient.calculateSalary(developer);

        HRDepartment hrClient = new HRDepartment();
        hrClient.printdetail(architect);

        AdminDepartment adminClient = new AdminDepartment();
        adminClient.allowRestrictedRoomAccess(salesAssociate);
    }
}
