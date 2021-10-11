package com.ceejay;

import java.util.List;

public class BagofStudents {
    private List<Student> students;

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public void clearStudents(){
        students.clear();
    }
}
