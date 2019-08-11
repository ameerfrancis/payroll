package com.payroll.Repository;

import com.payroll.Domain.User.Employee;

import java.util.ArrayList;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

    ArrayList<Employee> getAll();
}
