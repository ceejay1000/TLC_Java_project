package com.ceejay;

import java.util.List;

public class Student implements Nameable, HasLevel {

    private String studentName;
    private List<Double> grades;
    private int totalCourses = 0;
    private Level studentLevel;

    private double averageGrade;

    public Student(Level studentLevel) {
        this.studentLevel = studentLevel;
    }

    public Double getAverageGrade(){
        averageGrade = grades.stream().reduce(0.0, (Double subtotal, Double grade) -> subtotal + grade);
        return averageGrade;
    }

    public int getTotalCourses(){
        grades.stream().forEach(grade -> totalCourses++);
        return totalCourses;
    }

    public void setAverageGrade(double grade){
        this.averageGrade = grade;
    }

    @Override
    public String getName() {
        return studentName;
    }

    @Override
    public Level getLevel() {
        return this.studentLevel;
    }
}
