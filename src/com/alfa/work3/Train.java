package com.alfa.work3;


import com.alfa.work1.DaysOfWeek;

import java.util.Arrays;

public class Train {

    private int number;
    private String stationDispatch;
    private String stationArrival;
    private String timeDispatch;
    private String timeArrival;
    private DaysOfWeek[] daysOfWeek;

    public Train(int number) {
        this.number = number;
    }

    public Train() {

    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getStationDispatch() {
        return stationDispatch;
    }
    public void setStationDispatch(String stationDispatch) {
        this.stationDispatch = stationDispatch;
    }
    public String getStationArrival() {
        return stationArrival;
    }
    public void setStationArrival(String stationArrival) {
        this.stationArrival = stationArrival;
    }
    public String getTimeDispatch() {
        return timeDispatch;
    }
    public void setTimeDispatch(String timeDispatch) {
        this.timeDispatch = timeDispatch;
    }
    public String getTimeArrival() {
        return timeArrival;
    }
    public void setTimeArrival(String timeArrival) {
        this.timeArrival = timeArrival;
    }
    public DaysOfWeek[] getDaysOfWeek() {
        return daysOfWeek;
    }
    public void setDaysOfWeek(DaysOfWeek[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }



    @Override
    public String toString() {
        return "class="+ this.getClass().getSimpleName() +
                " number=" + number +
                ", stationDispatch='" + stationDispatch + '\'' +
                ", stationArrival='" + stationArrival + '\'' +
                ", timeDispatch='" + timeDispatch + '\'' +
                ", timeArrival='" + timeArrival + '\'' +
                ", daysOfWeek=" + Arrays.toString(daysOfWeek) +
                '}';
    }
}
