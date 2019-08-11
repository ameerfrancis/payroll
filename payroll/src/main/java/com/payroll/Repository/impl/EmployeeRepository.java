package com.payroll.Repository.impl;

import com.payroll.Domain.User.Employee;

import java.util.ArrayList;

public class EmployeeRepository {

    private static EmployeeRepository repository = null;
    private ArrayList<Employee> employees;

    private EmployeeRepository(){

        this.employees = new ArrayList<Employee>();
    }

    public static EmployeeRepository getRepository(){
        if (repository == null) repository = new EmployeeRepository();
        return repository;
    }


    public Employee create(Employee employee){
        this.employees.add(employee);
        return employee;
    }

    public Employee read(String empFirstName){
        Employee emp = null;

        for(int i = 0; i < employees.size(); i++)
        {
            if(employees.get(i).getFirstName().equalsIgnoreCase(empFirstName))
            {
                emp = employees.get(i);
            }
        }

        // find the course that matches the id and return it if exist
        return emp;
    }

    public Employee update(Employee employee){
        Employee emp  = null;

        for(int i = 0; i < employees.size();i++)
        {
            if(employees.get(i).getFirstName().equalsIgnoreCase(employee.getFirstName()))
            {
                employees.set(i,employee);
                emp = employees.get(i);
            }
        }
        // find the course, update it and delete it if it exists
        return emp;
    }

    public void delete(String empFirstName) {
        // find the course, delete it if it exist
        for(int i = 0; i < employees.size(); i++)
        {
            if(employees.get(i).getFirstName().equalsIgnoreCase(empFirstName))
            {
                employees.remove(i);
            }
        }
    }


    public ArrayList<Employee> getAll() {
        return employees;
    }

    /*public Set<Author> getAll(Author author){
        return this.author;
    }*/
}
