package com.payroll.Repository.impl;

import com.payroll.Domain.Demography.Race;

import java.util.ArrayList;

public class RaceRepository {

    private static RaceRepository repository = null;
    private ArrayList<Race> races;

    private RaceRepository(){

        this.races = new ArrayList<Race>();
    }

    public static RaceRepository getRepository(){
        if (repository == null) repository = new RaceRepository();
        return repository;
    }


    public Race create(Race race){
        this.races.add(race);
        return race;
    }

    public Race read(String raceType){
        Race r = null;

        for(int i = 0; i < races.size(); i++)
        {
            if(races.get(i).getRaceType().equalsIgnoreCase(raceType))
            {
                r = races.get(i);
            }
        }

        // find the course that matches the id and return it if exist
        return r;
    }

    public Race update(Race race){
        Race r  = null;

        for(int i = 0; i < races.size();i++)
        {
            if(races.get(i).getRaceType().equalsIgnoreCase(race.getRaceType()))
            {
                races.set(i,race);
                r = races.get(i);
            }
        }
        // find the course, update it and delete it if it exists
        return r;
    }

    public void delete(String raceType) {
        // find the course, delete it if it exist
        for(int i = 0; i < races.size(); i++)
        {
            if(races.get(i).getRaceType().equalsIgnoreCase(raceType))
            {
                races.remove(i);
            }
        }
    }


    public ArrayList<Race> getAll() {
        return races;
    }

    /*public Set<Author> getAll(Author author){
        return this.author;
    }*/
}
