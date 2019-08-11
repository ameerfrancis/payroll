package com.payroll.Service.impl;

import com.payroll.Domain.User.Employee;
import com.payroll.Repository.impl.EmployeeRepository;

import java.util.ArrayList;

public class EmployeeService implements com.payroll.Service.EmployeeService {

    private EmployeeService service = null;
    private EmployeeRepository repository;


    public EmployeeService getService(){
        if (service == null) service = new EmployeeService();
        return service;
    }


    @Override
    public Employee create(Employee employee) {
        return this.repository.create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return this.repository.update(employee);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Employee read(String s) {
        return this.repository.read(s);
    }

    @Override
    public ArrayList<Employee> getAllEmployees() {
        ArrayList<Employee> employees = getAll();

        return null;
    }


    @Override
    public ArrayList<Employee> getAll() {
        return this.repository.getAll();
    }
}
