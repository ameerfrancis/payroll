package com.payroll.Service;

import com.payroll.Domain.Demography.Race;

import java.util.ArrayList;

public interface RaceService extends CrudService<Race, String> {

    ArrayList<Race> getAllRaces();
    ArrayList<Race> getAll();
}
