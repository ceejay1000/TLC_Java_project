package com.ceejay;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    private List<T> entities = new ArrayList<>();

    public void addLectures(T entity){
        entities.add(entity);
    }

    public <T> void removeLectures(T entity){
        entities.remove(entity);
    }

    public void clearLectures(){
        entities.clear();
    }
}
