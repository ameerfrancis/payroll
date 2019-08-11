package com.payroll.Repository;

import com.payroll.Domain.Demography.Gender;

import java.util.ArrayList;

public interface GenderRepository extends CrudRepository<Gender, String> {

    ArrayList<Gender> getAll();
}
