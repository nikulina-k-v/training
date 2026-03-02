package org.exercises.task2;


import org.exercises.Person;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle();
        rectangleOne.setWidth(2.5);
        rectangleOne.setHeight(3);

        Person p = new Person();


        Rectangle rectangleTwo = new Rectangle();
        rectangleTwo.setWidth(2.8);
        rectangleTwo.setHeight(1.2);

        System.out.println("Площадь первого прямоугольника: " + rectangleOne.rectangleArea());
        System.out.println("Площадь второго прямоугольника: " + rectangleTwo.rectangleArea());
        System.out.println("Перимерт первого прямоугольника: " + rectangleOne.rectanglePerimeter());
        System.out.println("Периметр второго прямоугольника: " + rectangleTwo.rectanglePerimeter());

    }
}