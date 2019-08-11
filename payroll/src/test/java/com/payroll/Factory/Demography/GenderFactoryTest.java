package com.payroll.Factory.Demography;

import com.payroll.Domain.Demography.Gender;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getGender() {

        Gender a = GenderFactory.getGender("Female");
        Assert.assertEquals("Female", a.getGenderType());
    }
}