package org.exercises.task1;

public class Main {
    public static void main(String[] args) {
        Person personOne = new Person();
        personOne.name = "Alice";
        personOne.age = 25;

        Person personTwo = new Person();
        personTwo.name = "Blair";
        personTwo.age = 30;

        System.out.println("Первого человека зовут: " + personOne.name + ". Возраст составляет: " + personOne.age + " лет!");
        System.out.println("Второго человека зовут: " + personTwo.name + ". Возраст составляет: " + personTwo.age + " лет!");
    }
}
