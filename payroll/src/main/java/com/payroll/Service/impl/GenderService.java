package com.payroll.Service.impl;

import com.payroll.Domain.Demography.Gender;
import com.payroll.Domain.User.Employee;
import com.payroll.Repository.GenderRepository;
import com.payroll.Repository.impl.EmployeeRepository;

import java.util.ArrayList;

public class GenderService implements com.payroll.Service.GenderService {

    private GenderService service = null;
    private GenderRepository repository;


    public GenderService getService(){
        if (service == null) service = new GenderService();
        return service;
    }


    @Override
    public Gender create(Gender gender) {
        return this.repository.create(gender);
    }

    @Override
    public Gender update(Gender gender) {
        return this.repository.update(gender);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Gender read(String s) {
        return this.repository.read(s);
    }

    @Override
    public ArrayList<Gender> getAllGenders() {
        ArrayList<Gender> genders = getAll();

        return null;
    }


    @Override
    public ArrayList<Gender> getAll() {
        return this.repository.getAll();
    }
}
