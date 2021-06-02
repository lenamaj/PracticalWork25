package com.alfa.work1;

public enum DaysOfWeek {
    SUNDAY,
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
    SATURDAY;

    public DaysOfWeek nextDay() {

      return  this == SATURDAY ? DaysOfWeek.SUNDAY :  DaysOfWeek.values()[this.ordinal()+1];

    }
}
