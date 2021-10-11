package com.ceejay;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Register {

    private List<? extends Student> students;
    private String studentReport = "";
    private List<Student> studentsByLevel;
    private Map<Level, List<Student>> studentsInfo;

    public Register(List<? extends Student> students) {
        this.students = students;
    }

    public Map<Level, List<Student>> getRegister(){
        //return students.stream().map(student -> student.getName()).collect(Collectors.toList());
        students.stream().forEach(student -> {
            if(studentsInfo.get(student.getLevel()) == (null)) {
                studentsByLevel = new ArrayList<>();
                studentsByLevel.add(student);
                studentsInfo.put(student.getLevel(), studentsByLevel);
            } else {
                studentsInfo.get(student.getLevel()).add(student);
            }
        });

        return studentsInfo;
    }

    public List<Student> getRegisterByLevel(Level studentLevel){
        return students.stream().filter(student -> student.getLevel() == studentLevel).collect(Collectors.toList());
    }

    public String printReport(){
        students.stream().forEach(student -> {
            studentReport += ("Name: " + student.getName()
                    + "\n" + "Level: " + student.getLevel());
        });
        return studentReport;
    }
}
