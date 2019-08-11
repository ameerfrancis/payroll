package com.payroll.Domain.User;

import com.payroll.Factory.User.EmployeeFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getFirstName() {

        Employee a = EmployeeFactory.getEmployee("Ameer", "Francis");
        Assert.assertEquals("Ameer", a.getFirstName());
    }

    @Test
    public void getLastName() {

        Employee a = EmployeeFactory.getEmployee("Ameer", "Francis");
        Assert.assertEquals("Francis", a.getLastName());
    }
}