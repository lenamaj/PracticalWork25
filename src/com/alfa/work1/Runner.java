package com.alfa.work1;

import com.alfa.work2.Rank;
import com.alfa.work2.Suit;

import java.util.Scanner;

public class Runner {
    public void run(){
//1

        for (DaysOfWeek day: DaysOfWeek.values()) {

            System.out.println(day.name());

        }

        //2

        for (DaysOfWeek day: DaysOfWeek.values()) {

            switch (day){
                case MONDAY: case WEDNESDAY: case FRIDAY:
                    System.out.println(day + " Working day");
            }


        }


        //3
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        String day = sc.next();
        System.out.println("Next day: "+DaysOfWeek.valueOf(day.toUpperCase()).nextDay());


        //4
    /*    Card[] cards = new Card[52];
        int i =0;
        for (Suit suit: Suit.values()) {
            for (Rank rank: Rank.values()) {
                cards[i]=new Card(suit, rank);
                i++;
            }

        }

        for (Card cc:cards) {
            System.out.println(cc);
        }*/
    }
}
