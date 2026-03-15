package org.exercises.chapter3p3to3p4.task5;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public Integer getScholarship() {
        if (getAverageMark() == 5) {
            return 2000;
        } else if (getAverageMark() < 5 && getAverageMark() > 0) {
            return 1900;
        } else if (getAverageMark() < 0 && getAverageMark() > 5) {
            System.out.println("Некорректная средняя оценка!");
        }
        return -1;
    }

    public void printInfoAboutScolarship(String type) {
        if (getScholarship() != -1) {
            System.out.println(type + " по имени " +
                    getFirstName() + " " +
                    getLastName() + " со средней оценкой " +
                    getAverageMark() + " получает стипендию в размере " +
                    getScholarship() + " рублей!");
        } else {
            System.out.println("Некорректная средняя оценка!");
        }
    }
}
