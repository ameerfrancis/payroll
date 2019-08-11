package com.payroll.Repository.impl;

import com.payroll.Domain.Demography.Gender;
import com.payroll.Factory.Demography.GenderFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderRepositoryTest {

    GenderRepository object = GenderRepository.getRepository();

    GenderFactory authFac = new GenderFactory();

    Gender test1 = authFac.getGender("Female");
    Gender test2 = authFac.getGender("Male");
    //Gender test3 = authFac.getAuthor("bob", "734657");

    @Test
    public void getRepository() {

        GenderRepository gender = GenderRepository.getRepository();

        Assert.assertNotNull(gender);
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

        Gender gen = object.read("Male");

        Assert.assertEquals(test2, gen);
    }

    @Test
    public void update() {

        object.create(test1);
        object.create(test2);

        Gender gen = object.update(test2);

        Assert.assertEquals(test2,gen);
    }

    @Test
    public void delete() {

        object.create(test1);

        object.delete("Female");

        Assert.assertEquals(1, object.getAll().size());
    }
}