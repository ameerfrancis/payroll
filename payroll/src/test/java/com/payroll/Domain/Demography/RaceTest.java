package com.payroll.Domain.Demography;

import com.payroll.Factory.Demography.RaceFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getRaceType() {

        Race a = RaceFactory.getRace("coloured");
        Assert.assertEquals("coloured", a.getRaceType());
    }
}