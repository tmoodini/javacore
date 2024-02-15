package com.tmoodini.javacore;

public enum DaysofWeek {

    MONDAY("Mon"), TUESDAY("Tue"),
    WEDNESDAY("Wed"), THURSDAY("Thur"),
    FRIDAY("Fri"), SATURDAY("Sat"), SUNDAY("Sun");

    public final String label;

    private DaysofWeek(String label){
        this.label = label;
    }
}
