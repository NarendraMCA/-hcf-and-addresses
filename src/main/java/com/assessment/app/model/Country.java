package com.assessment.app.model;

public class Country {

    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static class Builder {

        private String code;
        private String name;

        public Country.Builder withCode(String code) {
            this.code = code;
            return this;
        }

        public Country.Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Country build() {
            Country country = new Country();
            country.code = code;
            country.name = name;
            return country;
        }

    }

}
