package com.payroll.Domain.Demography;

import com.payroll.Factory.Demography.GenderFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getGenderType() {

        Gender a = GenderFactory.getGender("Male");
        Assert.assertEquals("Male", a.getGenderType());
    }
}