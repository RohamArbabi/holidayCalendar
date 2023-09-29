package date;

public class Year {


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

    public Date dateFromWeekdayNumber(int day,int month ,int num, int year) {


        return new Date(4, 4, 4); // changeme

    }



}
