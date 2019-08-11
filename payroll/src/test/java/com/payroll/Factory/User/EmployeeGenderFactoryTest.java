package com.payroll.Factory.User;

import com.payroll.Domain.User.EmployeeGender;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderFactoryTest {

    @Test
    public void getEmployeeGender() {

        EmployeeGender a = EmployeeGenderFactory.getEmployeeGender("Ameer", "Francis", "Male");

        Assert.assertEquals("Ameer", a.getFirstName());
    }
}