package main;//Holiday calendar
//test
import java.time.LocalDate;
import holiday.Holiday;


public class Main {

    static Holiday newYearsDay = new Holiday(1,1,"Celebrates the beginning of the Gregorian calendar year.");
    static Holiday christmas = new Holiday(12, 25, "Christmas is an annual festival commemorating the birth of Jesus Christ");

    public static void main(String[] args) {
        //Use a function that stores the Months and days and current date
        System.out.println(christmas.d);
    }


    //Make an array or some kind data storage that holds all the national holidays
    //Make a GUI that uses the Months and days function and shows the current date
    //Apply the national holidays
}