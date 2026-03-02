package org.exercises.task6;

public class Car {
    private String marka;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "Марка автомобиля: " + marka + ", " +
                "Класс автомобиля: " + carClass + ", " +
                "Вес: " + weight + " кг, " +
                "Водитель: " + driver + ", " +
                "Двигатель: " + engine +
                '}';
    }
}
