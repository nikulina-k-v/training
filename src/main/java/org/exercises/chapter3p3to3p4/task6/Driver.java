package org.exercises.chapter3p3to3p4.task6;

public class Driver extends Person{
    private int experience;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "ФИО водителя: " + super.getFullName() + ", " +
                "Стаж вождения: " + experience + " лет" +
                '}';
    }
}
