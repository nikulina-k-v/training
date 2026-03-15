package org.exercises.chapter3p3to3p4.task5;

public class Aspirant extends Student {

    private String science;

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        this.science = science;
    }

    @Override
    public Integer getScholarship() {
        if (getAverageMark() == 5) {
            return 2500;
        } else if (getAverageMark() < 5 && getAverageMark() > 0) {
            return 2200;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        if (getScholarship() != -1) {
            return "Аспирант по имени " +
                    getFirstName() + " " +
                    getLastName() + " со средней оценкой " +
                    getAverageMark() + " получает стипендию в размере " +
                    getScholarship() + " рублей!";
        } else {
            return String.format("Аспирант %s %s: некорректная средняя оценка!", getFirstName(), getLastName());
        }
    }
}
