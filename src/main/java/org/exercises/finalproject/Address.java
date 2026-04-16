package org.exercises.finalproject;

import org.exercises.finalproject.enums.Country;

import java.util.Objects;

public class Address {
    private Country country;
    private String city;
    private String region;
    private String street;
    private String house;
    private String apartment;
    private String index;

    public Address(Country country, String city, String region, String street, String house, String index) {
        this.country = country;
        this.city = city;
        this.region = region;
        this.street = street;
        this.house = house;
        this.index = index;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country=" + country +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", apartment='" + apartment + '\'' +
                ", index='" + index + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return country == address.country
                && Objects.equals(city, address.city)
                && Objects.equals(region, address.region)
                && Objects.equals(street, address.street)
                && Objects.equals(house, address.house)
                && Objects.equals(apartment, address.apartment)
                && Objects.equals(index, address.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city, region, street, house, apartment, index);
    }
}