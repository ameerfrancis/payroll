package com.payroll.Factory.Demography;

import com.payroll.Domain.Demography.Race;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getRace() {

        Race a = RaceFactory.getRace("white");
        Assert.assertEquals("white", a.getRaceType());
    }
}