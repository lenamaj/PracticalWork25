package com.alfa.work3;

import com.alfa.work1.DaysOfWeek;
import java.util.Scanner;

public class TrainSchedule {

    private int numberOfTrains;
    private Train [] trains;

    public TrainSchedule(int numberOfTrains) {
        this.numberOfTrains = numberOfTrains;
        trains = new Train[numberOfTrains];
    }

    public Train creteTrain(String stationDispatch, String timeDispatch, String timeArrival,
                            String stationArrival, DaysOfWeek[] daysOfWeek)
    {
            Train train = new Train();
            train.setTimeDispatch(timeDispatch);
            train.setStationArrival(stationArrival);
            train.setTimeArrival(timeArrival);
            train.setStationDispatch(stationDispatch);
            train.setDaysOfWeek(daysOfWeek);
        return train;
    }

   public Train[] addTrains () {

       for (int i = 0; i < trains.length; i++) {
           trains[i] = new Train(i+1);
       }
       return trains;
   }


    public void printTrains(){
        for (Train tr:trains) {

            System.out.println(tr.toString());

        }

    }

  public void addTrainToSceduale() {

        for (int i = 0; i < trains.length; i++) {

            Scanner in1 = new Scanner(System.in);
            System.out.println("Enter stationDispatch-->");
            String dis = in1.nextLine();
            Scanner in2 = new Scanner(System.in);
            System.out.println("Enter timeDispatch-->");
            String disTime = in2.nextLine();
            Scanner in3 = new Scanner(System.in);
            System.out.println("Enter timeArrival-->");
            String arrTime = in3.nextLine();
            Scanner in4 = new Scanner(System.in);
            System.out.println("Enter stationArrival-->");
            String arr = in4.nextLine();
            Scanner in5 = new Scanner(System.in);
            System.out.println("Enter DaysOfWeek-->");
            String days = in5.nextLine();
            String[] day = days.split(",");
            DaysOfWeek[] daysOfWeek = new DaysOfWeek[day.length];
            for (int j = 0; j < day.length; j++) {
                daysOfWeek[j] = DaysOfWeek.valueOf(day[j].toUpperCase());
            }
            trains[i] =  creteTrain(dis, disTime, arrTime, arr, daysOfWeek);
        }

    }

}
