package com.payroll.Service;

import com.payroll.Domain.Demography.Gender;

import java.util.ArrayList;

public interface GenderService extends CrudService<Gender, String> {

    ArrayList<Gender> getAllGenders();
    ArrayList<Gender> getAll();
}
