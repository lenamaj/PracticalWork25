package com.alfa.work3;



import com.alfa.work1.DaysOfWeek;

import java.util.Scanner;

public class Runner {

    public void run(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of trains-->");
        int numTr = in.nextInt();
        TrainSchedule tr = new TrainSchedule(numTr);
        tr.addTrainToSceduale();
        tr.printTrains();
    }

}
