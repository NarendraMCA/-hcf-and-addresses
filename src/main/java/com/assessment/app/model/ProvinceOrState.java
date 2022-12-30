package com.assessment.app.model;

public class ProvinceOrState {

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

        public ProvinceOrState.Builder withCode(String code) {
            this.code = code;
            return this;
        }

        public ProvinceOrState.Builder withName(String name) {
            this.name = name;
            return this;
        }

        public ProvinceOrState build() {
            ProvinceOrState provinceOrState = new ProvinceOrState();
            provinceOrState.code = code;
            provinceOrState.name = name;
            return provinceOrState;
        }

    }

}
