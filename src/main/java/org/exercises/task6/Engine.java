package org.exercises.task6;

public class Engine {
    private int power;
    private String company;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "Мощность: " + power + " л.с., " +
                "Производитель: " + company +
                '}';
    }
}
