package date;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

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

    public Date dateFromWeekdayNumber(int day, int month, int num, int year) {
        return new Date(4, 4, 4); // changeme
    }

    public static int dayFromDate(int m, int d, int y) {
        cal.set(y - 1900, m, d);
        return cal.get(Calendar.DAY_OF_WEEK);
    }

}
