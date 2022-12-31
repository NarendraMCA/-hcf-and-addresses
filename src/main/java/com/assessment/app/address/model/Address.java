
package com.assessment.app.address.model;

import com.google.gson.annotations.Expose;

import java.util.Objects;

public class Address {

    @Expose
    private AddressLineDetail addressLineDetail;
    @Expose
    private String cityOrTown;
    @Expose
    private Country country;
    @Expose
    private String id;
    @Expose
    private String lastUpdated;
    @Expose
    private String postalCode;
    @Expose
    private ProvinceOrState provinceOrState;
    @Expose
    private Type type;

    public AddressLineDetail getAddressLineDetail() {
        return addressLineDetail;
    }

    public void setAddressLineDetail(AddressLineDetail addressLineDetail) {
        this.addressLineDetail = addressLineDetail;
    }

    public String getCityOrTown() {
        return cityOrTown;
    }

    public void setCityOrTown(String cityOrTown) {
        this.cityOrTown = cityOrTown;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public ProvinceOrState getProvinceOrState() {
        return provinceOrState;
    }

    public void setProvinceOrState(ProvinceOrState provinceOrState) {
        this.provinceOrState = provinceOrState;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        return Objects.equals(getAddressLineDetail(), address.getAddressLineDetail()) && Objects.equals(getCityOrTown(), address.getCityOrTown())
                && Objects.equals(getCountry(), address.getCountry()) && Objects.equals(getId(), address.getId())
                && Objects.equals(getLastUpdated(), address.getLastUpdated()) && Objects.equals(getPostalCode(), address.getPostalCode())
                && Objects.equals(getProvinceOrState(), address.getProvinceOrState()) && Objects.equals(getType(), address.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAddressLineDetail(), getCityOrTown(), getCountry(), getId(), getLastUpdated(),
                getPostalCode(), getProvinceOrState(), getType());
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressLineDetail=" + addressLineDetail +
                ", cityOrTown='" + cityOrTown + '\'' +
                ", country=" + country +
                ", id='" + id + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", provinceOrState=" + provinceOrState +
                ", type=" + type +
                '}';
    }

}
