package org.exercises.chapter3p3to3p4.task6;

public class Person {
    private int age;
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Person{" +
//                "Возраст: " + age + " " +
                "ФИО: " + fullName +
                '}';
    }
}
