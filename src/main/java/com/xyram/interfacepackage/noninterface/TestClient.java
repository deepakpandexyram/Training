package com.xyram.interfacepackage.noninterface;

public class TestClient {
    public static void main(String[] args){
        AccountingDepartment accountingClient = new AccountingDepartment();
        accountingClient.calSalary("SalesAssociate");

        HRDepartment hrClient = new HRDepartment();
        hrClient.printdetail("Developer");

        AdminDepartment adminClient = new AdminDepartment();
        adminClient.allowRestrictedRoomAccess("Architect");
    }
}
