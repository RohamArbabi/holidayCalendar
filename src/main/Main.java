package main;
import gui.GUI;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.ArrayList;

import holiday.Holiday;
import date.Year;




public class Main {
    public static int curYear = LocalDate.now().getYear();

    public static void main(String[] args) {
//        Holiday newYearsDay = new Holiday(1,1,"Celebrates the beginning of the Gregorian calendar year.");
//        Holiday mlkDay = new Holiday(1, Year.dateFromWeekdayNumber(1, curYear, 2, 3).getDay(), "Honors Dr. Martin Luther King Jr, a civil rights leader who was born on January 15, 1929.");
//        Holiday washingtonsBirthday = new Holiday(2, Year.dateFromWeekdayNumber(2, curYear, 2, 3).getDay(), "Honors George Washington, Founding Father and the first U.S. president, who was born on February 22, 1732.");
//        //Holiday memorialDay = new Holiday(5, new int[]{25,26,27,28,29,30,31}, "Honors U.S. military personnel who have fought and died while serving in the United States Armed Forces.");
//        Holiday juneteenthIndependanceDay = new Holiday(6,19,"Commemorates the emancipation of enslaved African Americans on the anniversary of the 1865 date when emancipation was announced in Galveston, Texas.");
//        Holiday independenceDay = new Holiday(7,4,"Celebrates the 1776 adoption of the Declaration of Independence from British rule.");
        //Holiday laborDay = new Holiday(9, Year.dateFromWeekdayNumber(9, curYear, 2, 1).getDay(), "Honors and recognizes the American labor movement.");
//        Holiday indigenousPeoplesDay = new Holiday(10, Year.dateFromWeekdayNumber(10, curYear, 2, 2).getDay(), "Indigenous Peoples' Day is a holiday that celebrates and honors indigenous American peoples and commemorates their histories and cultures.");
//        Holiday veteransDay = new Holiday(11, 11, "Honors all veterans of the United States armed forces.");

        Holiday thanksgivingDay = new Holiday(11, Year.dateFromWeekdayNumber(11, curYear, 5, 4).getDay(), "Traditionally celebrates the giving of thanks for the autumn harvest, and commonly includes the sharing of a turkey dinner.");
        //Holiday christmasDay = new Holiday(12, 25, "Christmas is an annual festival commemorating the birth of Jesus Christ.");


        //Use a function that stores the months and days and current date

        //new GUI();
        System.out.println(thanksgivingDay);

    }


    //Make an array or some kind data storage that holds all the national holidays
    //Make a GUI that uses the Months and days function and shows the current date
    //Apply the national holidays
}



//bunch of crap is wrong fix it idiot