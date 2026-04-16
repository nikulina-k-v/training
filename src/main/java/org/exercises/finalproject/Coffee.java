package org.exercises.finalproject;

import org.exercises.finalproject.enums.*;
import org.exercises.finalproject.enums.Package;

import java.math.BigDecimal;
import java.util.Objects;

public class Coffee extends Drink {
    private CoffeeType coffeeType;
    private Roasting roasting;

    public Coffee(String name, BigDecimal price, Float weight, Manufacturer manufacturer, Country country, Package aPackage, CoffeeType coffeeType, Roasting roasting) {
        super(name, price, weight, manufacturer, country, aPackage);
        this.coffeeType = coffeeType;
        this.roasting = roasting;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public Roasting getRoasting() {
        return roasting;
    }

    public void setRoasting(Roasting roasting) {
        this.roasting = roasting;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "coffeeType=" + coffeeType +
                ", roasting=" + roasting +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return coffeeType == coffee.coffeeType
                && roasting == coffee.roasting;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coffeeType, roasting);
    }
}