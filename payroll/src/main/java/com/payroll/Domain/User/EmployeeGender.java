package com.payroll.Domain.User;

public class EmployeeGender {

    private String firstName;

    private String lastName;

    private String gender;


    private EmployeeGender(){}

    private EmployeeGender(EmployeeGender.Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }



    public static class Builder {

        private String firstName;
        private String lastName;
        private String gender;



        public EmployeeGender.Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public EmployeeGender.Builder lastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }

        public EmployeeGender.Builder gender(String gender)
        {
            this.gender = gender;
            return this;
        }


        public EmployeeGender build() {
            return new EmployeeGender(this);
        }

    }

    @Override
    public String toString() {
        return "EmployeeGender{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
