package com.payroll.Service.impl;

import com.payroll.Domain.Demography.Gender;
import com.payroll.Domain.Demography.Race;
import com.payroll.Factory.Demography.RaceFactory;
import com.payroll.Repository.impl.RaceRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RaceServiceTest {

    private RaceRepository repository;
    private Race race;


    private Race getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = RaceRepository.getRepository();
        this.race = RaceFactory.getRace("Black");
    }

    @Test
    public void create() {

        Race created = this.repository.create(this.race);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.race);
    }

    @Test
    public void update() {

        String newRace = "White";
        Race updated = new Race.Builder().raceType(newRace).raceType(newRace).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newRace, updated.getRaceType());
    }

    com.payroll.Repository.impl.RaceRepository object = com.payroll.Repository.impl.RaceRepository.getRepository();

    RaceFactory raceFac = new RaceFactory();

    Race test1 = raceFac.getRace("Black");
    Race test2 = raceFac.getRace("White");

    @Test
    public void delete() {

        object.create(test1);
        this.repository.delete(test1.getRaceType());
        getAll();
    }

    @Test
    public void read() {

        object.create(test2);
        Race read = object.read(test2.getRaceType());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, test2);
    }

    @Test
    public void getAll() {

        ArrayList<Race> races = this.repository.getAll();
        System.out.println("In getall, all = " + races);
    }
}