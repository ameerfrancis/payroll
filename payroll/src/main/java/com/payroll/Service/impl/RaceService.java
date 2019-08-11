package com.payroll.Service.impl;

import com.payroll.Domain.Demography.Gender;
import com.payroll.Domain.Demography.Race;
import com.payroll.Repository.GenderRepository;
import com.payroll.Repository.RaceRepository;

import java.util.ArrayList;

public class RaceService implements com.payroll.Service.RaceService {

    private RaceService service = null;
    private RaceRepository repository;


    public RaceService getService(){
        if (service == null) service = new RaceService();
        return service;
    }


    @Override
    public Race create(Race race) {
        return this.repository.create(race);
    }

    @Override
    public Race update(Race race) {
        return this.repository.update(race);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Race read(String s) {
        return this.repository.read(s);
    }

    @Override
    public ArrayList<Race> getAllRaces() {
        ArrayList<Race> races = getAll();

        return null;
    }


    @Override
    public ArrayList<Race> getAll() {
        return this.repository.getAll();
    }
}
