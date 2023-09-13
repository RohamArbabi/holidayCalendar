package main;//Holiday calendar
//test
import java.time.LocalDate;
import java.util.Arrays;

import holiday.Holiday;


public class Main {
    static Holiday newYearsDay = new Holiday(1,1,"Celebrates the beginning of the Gregorian calendar year.");
    static Holiday birthdayOfMartinLutherKingJr = new Holiday(1, new int[]{15, 16, 17, 18, 19, 20, 21}, "Honors Dr. Martin Luther King Jr, a civil rights leader who was born on January 15, 1929.");
    static Holiday washingtonsBirthday = new Holiday(2, new int[]{15,16,17,18,19,20,21}, "Honors George Washington, Founding Father and the first U.S. president, who was born on February 22, 1732.");
    static Holiday memorialDay = new Holiday(5, new int[]{25,26,27,28,29,30,31}, "Honors U.S. military personnel who have fought and died while serving in the United States Armed Forces.");
    static Holiday juneteenthIndependanceDay = new Holiday(6,19,"Commemorates the emancipation of enslaved African Americans on the anniversary of the 1865 date when emancipation was announced in Galveston, Texas.");
    static Holiday independanceDay = new Holiday(7,4,"Celebrates the 1776 adoption of the Declaration of Independence from British rule.");
    static Holiday christmas = new Holiday(12, 25, "Christmas is an annual festival commemorating the birth of Jesus Christ.");

    public static void main(String[] args) {
        //Use a function that stores the Months and days and current date
        System.out.println(christmas);
    }


    //Make an array or some kind data storage that holds all the national holidays
    //Make a GUI that uses the Months and days function and shows the current date
    //Apply the national holidays
}