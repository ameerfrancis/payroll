package com.payroll.Domain.Demography;

public class Gender {

    private String genderType;



    private Gender(){}

    private Gender(Builder builder) {
        this.genderType = builder.genderType;
    }

    public String getGenderType() {
        return genderType;
    }



    public static class Builder {

        private String genderType;


        public Gender.Builder genderType(String genderType) {
            this.genderType = genderType;
            return this;
        }


        public Gender build() {
            return new Gender(this);
        }

    }

    @Override
    public String toString() {
        return "Gender{" +
                "genderType='" + genderType + '}';
    }
}
