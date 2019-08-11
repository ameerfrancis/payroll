package com.payroll.Factory.User;

import com.payroll.Domain.User.EmployeeRace;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRaceFactoryTest {

    EmployeeRace a = EmployeeRaceFactory.getEmployeeRace("Ameer", "Francis", "Coloured");


    @Test
    public void getEmployeeRace() {

        Assert.assertEquals("Ameer", a.getFirstName());

    }
}