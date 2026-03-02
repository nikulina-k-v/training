package org.exercises;

import org.exercises.task1.Person;
import org.exercises.task2.Rectangle;
import org.exercises.task3.BankAccount;
import org.exercises.task3.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test One");
        mainOne();

        System.out.println("Test Two");
        mainTwo();

        System.out.println("Test Three");
        mainThree();
    }
    static void mainOne() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        bankAccount.actualBalance();
        bankAccount.withdraw(900);
        bankAccount.actualBalance();

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(-100);
        savingsAccount.actualBalance();
        savingsAccount.withdraw(900);
        savingsAccount.actualBalance();
    }
    static void mainTwo() {
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
    static void mainThree() {
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