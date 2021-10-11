package com.ceejay;

public enum Level {

    FirstYear(1),
    SecondYear(2),
    ThirdYear(3),
    FourthYear(4);

    Integer i = 0;

    Level(Integer i) {
        this.i = i;
    }
}
