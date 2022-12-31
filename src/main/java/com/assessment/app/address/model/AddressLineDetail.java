
package com.assessment.app.address.model;

import com.google.gson.annotations.Expose;

import java.util.Objects;

public class AddressLineDetail {

    @Expose
    private String line1;
    @Expose
    private String line2;

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddressLineDetail that)) return false;
        return Objects.equals(getLine1(), that.getLine1()) && Objects.equals(getLine2(), that.getLine2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLine1(), getLine2());
    }

    @Override
    public String toString() {
        return "AddressLineDetail{" +
                "line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                '}';
    }

}
