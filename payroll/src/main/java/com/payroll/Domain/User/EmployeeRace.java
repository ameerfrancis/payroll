package com.payroll.Domain.User;

public class EmployeeRace {

    private String firstName;

    private String lastName;

    private String race;



    private EmployeeRace(){}

    private EmployeeRace(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.race = builder.race;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRace() {
        return race;
    }




    public static class Builder {

        private String firstName;
        private String lastName;
        private String race;



        public EmployeeRace.Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public EmployeeRace.Builder lastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }

        public EmployeeRace.Builder race(String race) {
            this.race = race;
            return this;
        }


        public EmployeeRace build() {
            return new EmployeeRace(this);
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
