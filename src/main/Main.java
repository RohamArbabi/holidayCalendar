package main;//Holiday calendar
//test
import java.time.LocalDate;
import java.util.Arrays;
import java.util.ArrayList;

import holiday.Holiday;


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
        Holiday christmas = new Holiday(12, 25, "Christmas is an annual festival commemorating the birth of Jesus Christ.");

        //Use a function that stores the Months and days and current date
        System.out.print(birthdayOfMartinLutherKingJr);
    }


    //Make an array or some kind data storage that holds all the national holidays
    //Make a GUI that uses the Months and days function and shows the current date
    //Apply the national holidays
}