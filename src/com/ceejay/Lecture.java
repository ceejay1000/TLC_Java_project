package com.ceejay;

import java.util.Comparator;
import java.util.List;

public class Lecture {

    private List<Student> students;
    private double highestAverageGrade;

    public void enter(Student student){
        students.add(student);
    }

    public void getHighestAverageGrade(){
         var grade = students.stream()
                .map(student -> student.getAverageGrade())
                .max(Comparator.comparingDouble(Double::doubleValue));

         grade.ifPresent(highest -> highestAverageGrade = highest);
    }
}
