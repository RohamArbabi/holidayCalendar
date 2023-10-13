package main;//Holiday calendar
//test
import gui.GUI;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.ArrayList;

import holiday.Holiday;
import date.Year;




public class Main {
    public static void main(String[] args) {
        Holiday newYearsDay = new Holiday(1,1,"Celebrates the beginning of the Gregorian calendar year.");
        Holiday birthdayOfMartinLutherKingJr = new Holiday(1, new int[]{15, 16, 17, 18, 19, 20, 21}, "Honors Dr. Martin Luther King Jr, a civil rights leader who was born on January 15, 1929.");
        Holiday washingtonsBirthday = new Holiday(2, new int[]{15,16,17,18,19,20,21}, "Honors George Washington, Founding Father and the first U.S. president, who was born on February 22, 1732.");
        Holiday memorialDay = new Holiday(5, new int[]{25,26,27,28,29,30,31}, "Honors U.S. military personnel who have fought and died while serving in the United States Armed Forces.");
        Holiday juneteenthIndependanceDay = new Holiday(6,19,"Commemorates the emancipation of enslaved African Americans on the anniversary of the 1865 date when emancipation was announced in Galveston, Texas.");
        Holiday independanceDay = new Holiday(7,4,"Celebrates the 1776 adoption of the Declaration of Independence from British rule.");
        Holiday laborDay = new Holiday(9, new int[]{1,2,3,4,5,6,7}, "Honors and recognizes the American labor movement.");
        Holiday indigenousPeoplesDay = new Holiday(10, new int[]{8,9,10,11,12,13,14}, "Indigenous Peoples' Day is a holiday that celebrates and honors indigenous American peoples and commemorates their histories and cultures.");
        Holiday veteransDay = new Holiday(11,11,"Honors all veterans of the United States armed forces.");
        Holiday thanksgivingDay = new Holiday(11, new int[]{22,23,24,25,26,27,28}, "Traditionally celebrates the giving of thanks for the autumn harvest, and commonly includes the sharing of a turkey dinner.");
        Holiday christmasDay = new Holiday(12, 25, "Christmas is an annual festival commemorating the birth of Jesus Christ.");


        //Use a function that stores the months and days and current date

        new GUI();
        System.out.println(Year.dayFromDate(10, 14, 2009));
        System.out.println(Year.dateFromWeekdayNumber(1, 2023, 2, 3).toString());
    }


    //Make an array or some kind data storage that holds all the national holidays
    //Make a GUI that uses the Months and days function and shows the current date
    //Apply the national holidays
}