package org.exercises.chapter3p5to3p6.task4;

import java.util.Objects;

public class Rectangle1 {
    private Integer width;
    private Integer height;

    public Rectangle1(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle1(Rectangle1 rt) {
        this.width = rt.getWidth();
        this.height = rt.getHeight();
    }

    public Integer getWidth() {
        return width;
    }

    private void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    private void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle1 rectangle = (Rectangle1) o;
        return Objects.equals(width, rectangle.width) &&
                Objects.equals(height, rectangle.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "прямоугольник {" +
                "Ширина: " + width +
                ", Высота: " + height +
                '}';
    }
}
