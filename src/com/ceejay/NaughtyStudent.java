package com.ceejay;

public class NaughtyStudent extends Student {
    private double newAverageGrade = 0;


    public NaughtyStudent(Level studentLevel) {
        super(studentLevel);
    }

    public void increaseAverageGradeByTenPercent(){
        this.newAverageGrade =
                ((this.getAverageGrade() / (this.getTotalCourses() * 100)) * 10) + this.getAverageGrade();

        this.setAverageGrade(newAverageGrade);
    }
}
