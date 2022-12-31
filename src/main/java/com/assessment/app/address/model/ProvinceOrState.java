
package com.assessment.app.address.model;

import com.google.gson.annotations.Expose;

import java.util.Objects;

public class ProvinceOrState {

    @Expose
    private String code;
    @Expose
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProvinceOrState that)) return false;
        return Objects.equals(getCode(), that.getCode()) && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getName());
    }

    @Override
    public String toString() {
        return "ProvinceOrState{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
