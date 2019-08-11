package com.payroll.Domain.User;

import com.payroll.Factory.User.EmployeeGenderFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderTest {

    //EmployeeGender a = EmployeeGenderFactory.getEmployeeGender("Ameer", "Francis", "Male");

    @Test
    public void getFirstName() {

        EmployeeGender a = EmployeeGenderFactory.getEmployeeGender("Ameer", "Francis", "Male");

        Assert.assertEquals("Ameer", a.getFirstName());
    }

    @Test
    public void getLastName() {

        EmployeeGender a = EmployeeGenderFactory.getEmployeeGender("Ameer", "Francis", "Male");
        Assert.assertEquals("Francis", a.getLastName());
    }

    @Test
    public void getGender() {

        EmployeeGender a = EmployeeGenderFactory.getEmployeeGender("Ameer", "Francis", "Male");
        Assert.assertEquals("Male", a.getGender());
    }
}