package org.exercises.finalproject;

import org.exercises.finalproject.enums.*;
import org.exercises.finalproject.enums.Package;

import java.math.BigDecimal;
import java.util.Objects;

public class Tea extends Drink {
    private TeaType teaType;
    private Aroma aroma;

    public Tea(String name, BigDecimal price, Float weight, Manufacturer manufacturer, Country country, Package aPackage, TeaType teaType, Aroma aroma) {
        super(name, price, weight, manufacturer, country, aPackage);
        this.teaType = teaType;
        this.aroma = aroma;
    }

    public TeaType getTeaType() {
        return teaType;
    }

    public void setTeaType(TeaType teaType) {
        this.teaType = teaType;
    }

    public Aroma getAroma() {
        return aroma;
    }

    public void setAroma(Aroma aroma) {
        this.aroma = aroma;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "teaType=" + teaType +
                ", aroma=" + aroma +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tea tea = (Tea) o;
        return teaType == tea.teaType
                && aroma == tea.aroma;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), teaType, aroma);
    }
}