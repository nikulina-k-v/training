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
import org.exercises.chapter3p5to3p6.task1.Phone;
import org.exercises.chapter3p5to3p6.task2.Person1;
import org.exercises.chapter3p5to3p6.task3.Car;
import org.exercises.chapter3p5to3p6.task4.Rectangle1;
import org.exercises.chapter3p5to3p6.task5.Singleton;
import org.exercises.finalproject.*;
import org.exercises.finalproject.enums.*;
import org.exercises.finalproject.enums.Package;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println(">> Test One");
        tastOneTest();
        System.out.println("\n******************************************\n");

        System.out.println(">> Test Two");
        taskTwoTest();
        System.out.println("\n******************************************\n");

        System.out.println(">> Test Three");
        taskThreeTest();
        System.out.println("\n******************************************\n");

        System.out.println(">> Test Four");
        taskFourTest();
        System.out.println("\n******************************************\n");

        System.out.println(">> Test Five");
        taskFiveTest();
        System.out.println("\n******************************************\n");

        System.out.println(">> Test Six");
        taskSixTest();
        System.out.println("\n******************************************\n");

        System.out.println(">> Класс Object, Конструкторы. Задача 1");
        testPhone();
        System.out.println("\n******************************************\n");

        System.out.println(">> Класс Object, Конструкторы. Задача 2");
        testPerson();
        System.out.println("\n******************************************\n");

        System.out.println(">> Класс Object, Конструкторы. Задача 3");
        testCar();
        System.out.println("\n******************************************\n");

        System.out.println(">> Класс Object, Конструкторы. Задача 4");
        testRectangle();
        System.out.println("\n******************************************\n");

        System.out.println(">> Класс Object, Конструкторы. Задача 5");
        testSingleton();
        System.out.println("\n******************************************\n");

        System.out.println(">> Итоговый проект");
        testFinalProject();
        System.out.println("\n******************************************\n");
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

        System.out.println(studentOne);
        System.out.println(studentTwo);
        System.out.println(aspirantOne);
        System.out.println(aspirantTwo);
    }

    static void taskSixTest() {
        Driver driverOne = new Driver();
        driverOne.setFullName("Никулин Андрей Алексеевич");
        driverOne.setAge(30);
        driverOne.setExperience(10);

        Driver driverTwo = new Driver();
        driverTwo.setFullName("Перов Петр Николаевич");
        driverTwo.setAge(25);
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

        System.out.println("\n" + sportCar);
        lorry.start();
        lorry.turnRight();
        lorry.stop();
    }

    public static void testPhone() {

        Phone phoneOne = new Phone(
                "Siemens A35",
                "+7 911-326-45-32",
                0.15
        );

        Phone phoneTwo = new Phone(
                "Motorola C105",
                "+7 951-851-20-45",
                0.165
        );

        phoneOne.receiveCall(phoneTwo);

        phoneTwo.receiveCall(phoneTwo);

        System.out.println("Первый " + phoneOne);
        System.out.println("Второй " + phoneTwo);
    }

    public static void testPerson() {
        Person1 personOne = new Person1();

        Person1 personTwo = new Person1(
                "Никулина Кристина Владимировна",
                30
        );

        System.out.println("Person №1:");
        personOne.move();
        personOne.talk();

        System.out.println("\nPerson №2:");
        personTwo.move();
        personTwo.talk();
    }

    public static void testCar() {
        Car carOne = new Car(
                "Жигули",
                1998
        );

        Car carTwo = new Car(
                null,
                null
        );

        System.out.println("Первый " + carOne);
        System.out.println("Второй " + carTwo);
    }

    public static void testRectangle() {
        Rectangle1 rectangleOne = new Rectangle1(
                10,
                5
        );

        Rectangle1 rectangleTwo = new Rectangle1(rectangleOne);

        System.out.println("Первый " + rectangleOne);
        System.out.println("Второй " + rectangleTwo + " (копия)");

        if (rectangleOne.hashCode() != rectangleTwo.hashCode() || !(rectangleOne.equals(rectangleTwo))) {
            System.out.println("Склонированные объекты не совпадают!");
        } else {
            System.out.println("Объекты корректно склонированы.");
        }
    }

    public static void testSingleton() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if (s1 == s2) {
            System.out.println("Обе ссылки указывают на один объект в куче");
        }
    }

    public static void testFinalProject() {

        User user = new User(
                "Kristina",
                "Nikulina",
                "k.v.nikulina.vrn@gmail.com",
                "8 800 999 65 54",
                "18kristi",
                "0000",
                Role.CUSTOMER
        );

        Address address = new Address(
                Country.RUSSIA,
                "Voronezh",
                "Voronezh-region",
                "Pushkina",
                "15",
                "999777"
        );

        CartItem[] cartItemArray = null;
        try {
            cartItemArray = new CartItem[]{
                    new CartItem(
                            new Coffee(
                                    "Coffee",
                                    BigDecimal.valueOf(890),
                                    0.4F,
                                    Manufacturer.BRAZILIAN_COFFEE,
                                    Country.BRASILIA,
                                    Package.PAPER,
                                    CoffeeType.GROUND,
                                    Roasting.MEDIUM
                            ),
                            (short) -1
                    ),
                    new CartItem(
                            new Tea(
                                    "TheBestTea",
                                    BigDecimal.valueOf(1030),
                                    0.9F,
                                    Manufacturer.LIPTON,
                                    Country.INDIA,
                                    Package.STILL,
                                    TeaType.BLACK,
                                    Aroma.FRUIT
                            ),
                            (short) -1
                    )
            };

            Order order1 = new Order(
                    LocalDateTime.now(),
                    user,
                    address,
                    Status.NEW,
                    cartItemArray
            );

            System.out.println("Сформирован заказ:\n" + order1);

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка выполнения программы\n" + e.getMessage());
        }
    }
}