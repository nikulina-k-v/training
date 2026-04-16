package org.exercises.finalproject;

import org.exercises.finalproject.enums.Country;
import org.exercises.finalproject.enums.Manufacturer;
import org.exercises.finalproject.enums.Package;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Drink {
    private String name;
    private BigDecimal price;
    private Float weight;
    private Manufacturer manufacturer;
    private Country country;
    private Package aPackage;

    public Drink(String name, BigDecimal price, Float weight, Manufacturer manufacturer, Country country, Package aPackage) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.country = country;
        this.aPackage = aPackage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", manufacturer=" + manufacturer +
                ", country=" + country +
                ", aPackage=" + aPackage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return Objects.equals(name, drink.name)
                && Objects.equals(price, drink.price)
                && Objects.equals(weight, drink.weight)
                && manufacturer == drink.manufacturer
                && country == drink.country
                && aPackage == drink.aPackage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, weight, manufacturer, country, aPackage);
    }
}