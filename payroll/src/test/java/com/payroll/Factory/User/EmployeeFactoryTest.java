package com.payroll.Factory.User;

import com.payroll.Domain.User.Employee;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getEmployee() {

        Employee a = EmployeeFactory.getEmployee("Bob", "Marley");
        Assert.assertEquals("Marley", a.getLastName());
    }
}