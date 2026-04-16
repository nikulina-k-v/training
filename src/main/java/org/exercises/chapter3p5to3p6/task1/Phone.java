package org.exercises.chapter3p5to3p6.task1;

import java.util.Objects;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(String model, String number, double weight) {
        this.weight = weight;
        this.model = model;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(Phone ph) {
        if (ph.getNumber() == null || this.getNumber() == null) {
            System.out.println("Ошибка! Один из номеров null!");
            return;
        }
        if (ph.getNumber().equals(this.getNumber())) {
            System.out.println("Ошибка! Звонок самому себе!");
        } else {
            System.out.println("Звонит " + getNumber());
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Phone phone = (Phone) obj;
        return Double.compare(weight, phone.weight) == 0 &&
                Objects.equals(number, phone.number) &&
                Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, model, weight);
    }

    @Override
    public String toString() {
        return "телефон{" +
                "Номер телефона ='" + number + '\'' +
                ", Модель телефона ='" + model + '\'' +
                ", Вес телефона =" + weight +
                '}';
    }
}
