package org.exercises.chapter3p3to3p4.task2;

public class Rectangle {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double rectangleArea() {
        return width * height;
    }

    public double rectanglePerimeter() {
        return (2 * (width + height));
    }
}
