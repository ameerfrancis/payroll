package com.payroll.Service.impl;

import com.payroll.Domain.Demography.Gender;
import com.payroll.Domain.User.Employee;
import com.payroll.Factory.Demography.GenderFactory;
import com.payroll.Factory.User.EmployeeFactory;
import com.payroll.Repository.impl.GenderRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GenderServiceTest {

    private GenderRepository repository;
    private Gender gender;


    private Gender getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = com.payroll.Repository.impl.GenderRepository.getRepository();
        this.gender = GenderFactory.getGender("Male");
    }

    @Test
    public void create() {

        Gender created = this.repository.create(this.gender);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.gender);
    }

    @Test
    public void update() {

        String newGender = "Female";
        Gender updated = new Gender.Builder().genderType(newGender).genderType(newGender).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newGender, updated.getGenderType());
    }

    com.payroll.Repository.impl.GenderRepository object = com.payroll.Repository.impl.GenderRepository.getRepository();

    GenderFactory genFac = new GenderFactory();

    Gender test1 = genFac.getGender("Male");
    Gender test2 = genFac.getGender("Female");

    @Test
    public void delete() {

        object.create(test1);
        this.repository.delete(test1.getGenderType());
        getAll();
    }

    @Test
    public void read() {

        object.create(test2);
        Gender read = object.read(test2.getGenderType());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, test2);
    }

    @Test
    public void getAll() {

        ArrayList<Gender> genders = this.repository.getAll();
        System.out.println("In getall, all = " + genders);
    }
}