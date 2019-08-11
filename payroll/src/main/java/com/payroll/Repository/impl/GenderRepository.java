package com.payroll.Repository.impl;

import com.payroll.Domain.Demography.Gender;

import java.util.ArrayList;

public class GenderRepository {

    private static GenderRepository repository = null;
    private ArrayList<Gender> genders;

    private GenderRepository(){

        this.genders = new ArrayList<Gender>();
    }

    public static GenderRepository getRepository(){
        if (repository == null) repository = new GenderRepository();
        return repository;
    }


    public Gender create(Gender gender){
        this.genders.add(gender);
        return gender;
    }

    public Gender read(String genderType){
        Gender gen = null;

        for(int i = 0; i < genders.size(); i++)
        {
            if(genders.get(i).getGenderType().equalsIgnoreCase(genderType))
            {
                gen = genders.get(i);
            }
        }

        // find the course that matches the id and return it if exist
        return gen;
    }

    public Gender update(Gender gender){
        Gender gen  = null;

        for(int i = 0; i < genders.size();i++)
        {
            if(genders.get(i).getGenderType().equalsIgnoreCase(gender.getGenderType()))
            {
                genders.set(i,gender);
                gen = genders.get(i);
            }
        }
        // find the course, update it and delete it if it exists
        return gen;
    }

    public void delete(String genderType) {
        // find the course, delete it if it exist
        for(int i = 0; i < genders.size(); i++)
        {
            if(genders.get(i).getGenderType().equalsIgnoreCase(genderType))
            {
                genders.remove(i);
            }
        }
    }


    public ArrayList<Gender> getAll() {
        return genders;
    }

    /*public Set<Author> getAll(Author author){
        return this.author;
    }*/
}
