package org.exercises.task5;

public class Aspirant  extends Student{

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
        } else if (getAverageMark() < 0 && getAverageMark() > 5) {
            System.out.println("Некорректная средняя оценка!");
        }
        return -1;
    }
}
