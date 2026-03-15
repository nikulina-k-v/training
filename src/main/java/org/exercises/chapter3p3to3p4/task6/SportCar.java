package org.exercises.chapter3p3to3p4.task6;

public class SportCar extends Car{
    private double speed;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "Скорость: " + speed + " км/ч, " +
                "Марка автомобиля: " + super.getMarka() + ", " +
                "Класс автомобиля: " + super.getCarClass() + ", " +
                "Водитель: " + super.getDriver() + ", " +
                "Вес: " + super.getWeight() + " кг, " +
                "Двигатель: " + super.getEngine() +
                '}';
    }
}
