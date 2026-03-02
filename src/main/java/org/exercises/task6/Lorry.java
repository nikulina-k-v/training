package org.exercises.task6;

public class Lorry extends Car{
    private int carrying;

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "Грузоподъемность: " + carrying + " кг, " +
                "Марка автомобиля: " + super.getMarka() + ", " +
                "Класс автомобиля: " + super.getCarClass() + ", " +
                "Водитель: " + super.getDriver() + ", " +
                "Вес: " + super.getWeight() + " кг, " +
                "Двигатель: " + super.getEngine() +
                '}';
    }
}
