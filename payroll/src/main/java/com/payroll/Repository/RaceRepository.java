package com.payroll.Repository;

import com.payroll.Domain.Demography.Race;

import java.util.ArrayList;

public interface RaceRepository extends CrudRepository<Race, String> {

    ArrayList<Race> getAll();
}
