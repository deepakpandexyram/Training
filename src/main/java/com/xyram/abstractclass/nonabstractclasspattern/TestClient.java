package com.xyram.abstractclass.nonabstractclasspattern;

public class TestClient {
    public static void main(String[] args){
        AccountingClient accountingClient = new AccountingClient();
        accountingClient.calSalary("SalesAssociate");

        HRClient hrClient = new HRClient();
        hrClient.printdetail("Developer");

        AdminClient adminClient = new AdminClient();
        adminClient.allowRestrictedRoomAccess("Architect");
    }
}
