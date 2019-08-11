package com.payroll.Service;

import com.payroll.Domain.User.Employee;

import java.util.ArrayList;

public interface EmployeeService extends CrudService<Employee, String> {

    ArrayList<Employee> getAllEmployees();
    ArrayList<Employee> getAll();
}

