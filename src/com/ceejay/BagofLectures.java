package com.ceejay;

import java.util.List;

public class BagofLectures {
    private List<Lecture> lectures;

    public void addLectures(Lecture lecture){
        lectures.add(lecture);
    }

    public void removeLectures(Lecture lecture){
        lectures.remove(lecture);
    }

    public void clearLectures(){
        lectures.clear();
    }
}
