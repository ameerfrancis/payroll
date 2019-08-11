package com.payroll.Domain.Demography;

public class Race {

    private String raceType;


    private Race(){}

    private Race(Builder builder) {
        this.raceType = builder.raceType;
    }

    public String getRaceType() {
        return raceType;
    }



    public static class Builder {

        private String raceType;


        public Race.Builder raceType(String raceType) {
            this.raceType = raceType;
            return this;
        }


        public Race build() {
            return new Race(this);
        }

    }

    @Override
    public String toString() {
        return "Race{" +
                "raceType='" + raceType + '}';
    }
}
