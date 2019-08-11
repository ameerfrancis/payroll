package com.payroll.Domain.User;

import com.payroll.Factory.User.EmployeeRaceFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRaceTest {

    EmployeeRace a = EmployeeRaceFactory.getEmployeeRace("Ameer", "Francis", "Coloured");

    @Test
    public void getFirstName() {

        Assert.assertEquals("Ameer", a.getFirstName());
    }

    @Test
    public void getLastName() {

        Assert.assertEquals("Francis", a.getLastName());
    }

    @Test
    public void getRace() {

        Assert.assertEquals("Coloured", a.getRace());
    }
}