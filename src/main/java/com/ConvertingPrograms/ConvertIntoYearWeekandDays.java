package com.ConvertingPrograms;

public class ConvertIntoYearWeekandDays {


    public static void main(String[] args) {

        int totalDays=9094;
        int year=0;
        int week=0;
        int days=0;

        year=totalDays/365;
        week=(totalDays%365)/7;
        days=(totalDays/365)%7;
        System.out.println(year);
        System.out.println(week);
        System.out.println(days);

    }
}

