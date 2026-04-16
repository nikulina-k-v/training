package org.exercises.chapter3p5to3p6.task3;

public class Car {
    private final String model;
    private final Integer year;

    public Car(String model, Integer year) {
        if (model == null) model = "Лада";
        if (year == null) year = 2010;
        this.model = model;
        this.year = year;
    }

    public Car(String model) {
        this(model, 0); // вызов основного конструктора
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "автомобиль: {" +
                "Модель: " + model +
                ", Год выпуска: " + year +
                '}';
    }
}
