package com.payroll.Domain.User;

public class Employee {
    private String firstName;

    private String lastName;


    private Employee(){}

    private Employee(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }



    public static class Builder {

        private String firstName;
        private String lastName;


        public Employee.Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Employee.Builder lastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }


        public Employee build() {
            return new Employee(this);
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
