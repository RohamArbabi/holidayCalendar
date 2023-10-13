package date;

import java.time.LocalDate;
import java.util.Calendar;

public class Year {
    static Calendar cal = Calendar.getInstance();



    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }

        return false;
    }

    /**
     * Gets the weekday of a given date
     * @param m
     * @param d
     * @param y
     * @return
     */
    public static int dayFromDate(int m, int d, int y) {
        cal.set(y, m, d);
        return cal.get(Calendar.DAY_OF_WEEK);
    }

    /**
     * Gets a date from a certain number weekday (e.g. the second Monday of January 2024)
     * @param month
     * @param year
     * @param weekday
     * @param num The numbered weekday to look for (1st, 2nd, 3rd, 4th, 5th)
     * @return
     */
    public static Date dateFromWeekdayNumber(int month, int year, int weekday, int num) {
        // for (int i = 0; i <
        int weekdayCounter = 0;
        int dayCounter = 1;
        while (weekdayCounter < num) {
            if (dayFromDate(month, dayCounter, year) == weekday) {
                weekdayCounter ++;


                if (weekdayCounter == num) {
                    return new Date(month, dayCounter, year);
                }
            }

            dayCounter ++;

        }

        return new Date(0, 0, 0);
    }
}
