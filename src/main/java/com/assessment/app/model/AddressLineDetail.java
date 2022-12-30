package com.assessment.app.model;

public class AddressLineDetail {

    private String line1;
    private String line2;

    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public static class Builder {

        private String line1;
        private String line2;

        public AddressLineDetail.Builder withLine1(String line1) {
            this.line1 = line1;
            return this;
        }

        public AddressLineDetail.Builder withLine2(String line2) {
            this.line2 = line2;
            return this;
        }

        public AddressLineDetail build() {
            AddressLineDetail addressLineDetail = new AddressLineDetail();
            addressLineDetail.line1 = line1;
            addressLineDetail.line2 = line2;
            return addressLineDetail;
        }

    }

}
