package com.assessment.app.model;

public class Address {

    private AddressLineDetail addressLineDetail;
    private String cityOrTown;
    private Country country;
    private String id;
    private String lastUpdated;
    private String postalCode;
    private ProvinceOrState provinceOrState;
    private Type type;

    public AddressLineDetail getAddressLineDetail() {
        return addressLineDetail;
    }

    public String getCityOrTown() {
        return cityOrTown;
    }

    public Country getCountry() {
        return country;
    }

    public String getId() {
        return id;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public ProvinceOrState getProvinceOrState() {
        return provinceOrState;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        PHYSICAL(1),
        POSTAL(2),
        BUSINESS(5);

        public final int code;

        Type(int code) {
            this.code = code;
        }
    }

    public static class Builder {

        private AddressLineDetail addressLineDetail;
        private String cityOrTown;
        private Country country;
        private String id;
        private String lastUpdated;
        private String postalCode;
        private ProvinceOrState provinceOrState;
        private Type type;

        public Address.Builder withAddressLineDetail(AddressLineDetail addressLineDetail) {
            this.addressLineDetail = addressLineDetail;
            return this;
        }

        public Address.Builder withCityOrTown(String cityOrTown) {
            this.cityOrTown = cityOrTown;
            return this;
        }

        public Address.Builder withCountry(Country country) {
            this.country = country;
            return this;
        }

        public Address.Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Address.Builder withLastUpdated(String lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }

        public Address.Builder withPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Address.Builder withProvinceOrState(ProvinceOrState provinceOrState) {
            this.provinceOrState = provinceOrState;
            return this;
        }

        public Address.Builder withType(Type type) {
            this.type = type;
            return this;
        }

        public Address build() {
            Address address = new Address();
            address.addressLineDetail = addressLineDetail;
            address.cityOrTown = cityOrTown;
            address.country = country;
            address.id = id;
            address.lastUpdated = lastUpdated;
            address.postalCode = postalCode;
            address.provinceOrState = provinceOrState;
            address.type = type;
            return address;
        }

    }

}
