package com.xyram.interfacepackage.interfacepattern;

import com.xyram.interfacepackage.noninterface.Architect;
import com.xyram.interfacepackage.noninterface.Developer;
import com.xyram.interfacepackage.noninterface.SalesAssociate;

import java.math.BigDecimal;

public class AdminClient {
    public void allowRestrictedRoomAccess(Person person){
        person.allowResrictedAcces();
    }

}
