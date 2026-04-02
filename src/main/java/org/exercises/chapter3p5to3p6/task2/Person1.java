package org.exercises.chapter3p5to3p6.task2;

public class Person1 {
    private String fullName;
    private Integer age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person1() {
        this("Дефолтнов Дефолт Дефолтович", 18);
    }

    public Person1(String fullName, Integer age) {
        if(fullName == null) fullName = "Максимова Кристина Владимировна";
        if (age == null) age = 29;
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(getFullName() + " движется");
    }

    public void talk() {
        System.out.println(getFullName() + ", возраст " + getAge() + " говорит");
    }
}
