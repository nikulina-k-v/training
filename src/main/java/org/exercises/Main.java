package org.exercises;

import org.exercises.chapter3p3to3p4.task1.Person;
import org.exercises.chapter3p3to3p4.task2.Rectangle;
import org.exercises.chapter3p3to3p4.task3.BankAccount;
import org.exercises.chapter3p3to3p4.task3.SavingsAccount;

import org.exercises.chapter3p3to3p4.task4.Calculator;
import org.exercises.chapter3p3to3p4.task5.Aspirant;
import org.exercises.chapter3p3to3p4.task5.Student;
import org.exercises.chapter3p3to3p4.task6.Driver;
import org.exercises.chapter3p3to3p4.task6.Engine;
import org.exercises.chapter3p3to3p4.task6.Lorry;
import org.exercises.chapter3p3to3p4.task6.SportCar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test One");
        tastOneTest();

        System.out.println("Test Two");
        taskTwoTest();

        System.out.println("Test Three");
        taskThreeTest();

        System.out.println("Test Four");
        taskFourTest();

        System.out.println("Test Five");
        taskFiveTest();

        System.out.println("Test Six");
        taskSixTest();
    }

    static void tastOneTest() {
        Person personOne = new Person();
        personOne.name = "Alice";
        personOne.age = 25;

        Person personTwo = new Person();
        personTwo.name = "Blair";
        personTwo.age = 30;

        System.out.println("Первого человека зовут: " +
                personOne.name + ". Возраст составляет: " +
                personOne.age + " лет!");

        System.out.println("Второго человека зовут: " +
                personTwo.name + ". Возраст составляет: " +
                personTwo.age + " лет!");
    }

    static void taskTwoTest() {
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

    static void taskThreeTest() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        bankAccount.actualBalance();
        bankAccount.withdraw(900);
        bankAccount.actualBalance();

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(1000);
        savingsAccount.actualBalance();
        savingsAccount.withdraw(900);
        savingsAccount.actualBalance();
    }

    static void taskFourTest() {
        Calculator calculator = new Calculator();

        System.out.println("Произведение двух целых чисел: " +
                calculator.multiply(2, 3));
        System.out.println("Произведение числа с плавающей точкой и целого числа: " +
                calculator.multiply(2.5, 3));
        System.out.println("Произведение двух чисел с плавающей точкой: " +
                calculator.multiply(2.5, 3.5));
    }

    static void taskFiveTest() {
        Student studentOne = new Student();
        studentOne.setFirstName("Кристина");
        studentOne.setLastName("Никулина");
        studentOne.setAverageMark(4.9);

        Student studentTwo = new Student();
        studentTwo.setFirstName("Екатерина");
        studentTwo.setLastName("Фирсова");
        studentTwo.setAverageMark(-3.5);

        Aspirant aspirantOne = new Aspirant();
        aspirantOne.setFirstName("Татьяна");
        aspirantOne.setLastName("Перова");
        aspirantOne.setAverageMark(5.0);

        Aspirant aspirantTwo = new Aspirant();
        aspirantTwo.setFirstName("Кэтрин");
        aspirantTwo.setLastName("Асманова");
        aspirantTwo.setAverageMark(5.1);

        studentOne.printInfoAboutScolarship("Студент");
        studentTwo.printInfoAboutScolarship("Студент");
        aspirantOne.printInfoAboutScolarship("Аспирант");
        aspirantTwo.printInfoAboutScolarship("Аспирант");
    }

    static void taskSixTest() {
        Driver driverOne = new Driver();
        driverOne.setFullName("Никулин Андрей Алексеевич");
        driverOne.setExperience(10);

        Driver driverTwo = new Driver();
        driverTwo.setFullName("Перов Петр Николаевич");
        driverTwo.setExperience(18);

        Engine engineOne = new Engine();
        engineOne.setPower(106);
        engineOne.setCompany("ЗМЗ");

        Engine engineTwo = new Engine();
        engineTwo.setPower(461);
        engineTwo.setCompany("Rolls-Royce Motor Cars");

        Lorry lorry = new Lorry();
        lorry.setDriver(driverOne);
        lorry.setCarrying(1500);
        lorry.setCarClass("ГАЗель");
        lorry.setEngine(engineOne);
        lorry.setMarka("ГАЗ");
        lorry.setWeight(2000);

        SportCar sportCar = new SportCar();
        sportCar.setDriver(driverTwo);
        sportCar.setSpeed(200.0);
        sportCar.setCarClass("Cabriolet");
        sportCar.setEngine(engineTwo);
        sportCar.setMarka("Cabri");
        sportCar.setWeight(1200);

        System.out.println(lorry);
        sportCar.start();
        sportCar.turnLeft();
        sportCar.stop();

        System.out.println();
        System.out.println(sportCar);
        lorry.start();
        lorry.turnRight();
        lorry.stop();
    }
}