package com.payroll.Repository.impl;

import com.payroll.Domain.Demography.Race;
import com.payroll.Factory.Demography.RaceFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceRepositoryTest {

    RaceRepository object = RaceRepository.getRepository();

    RaceFactory authFac = new RaceFactory();

    Race test1 = authFac.getRace("Black");
    Race test2 = authFac.getRace("White");

    @Test
    public void getRepository() {

        RaceRepository race = RaceRepository.getRepository();

        Assert.assertNotNull(race);
    }

    @Test
    public void create() {

        object.create(test1);

        int num = object.getAll().size();

        Assert.assertEquals(1, num);
    }

    @Test
    public void read() {

        object.create(test1);
        object.create(test2);

        Race r = object.read("Black");

        Assert.assertEquals(test1, r);
    }

    @Test
    public void update() {

        object.create(test1);
        object.create(test2);

        Race r = object.update(test2);

        Assert.assertEquals(test2,r);
    }

    @Test
    public void delete() {

        object.create(test1);

        object.delete("Black");

        Assert.assertEquals(1, object.getAll().size());
    }
}