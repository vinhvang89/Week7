package AutomatedTesting_NextDayCalculator;

public class NextDayCalculator {
    private static int day1;
    private static int month1;
    private static int year1;
    public static void getNextDay(int day,int month,int year) {
        day1 = day + 1;
        year1 = year;
        month1 = month;
        if (day1 > checkMonth(month, isLeapYear(year))) {
            day1 = 1;
            if (month < 12)
                month1 = month + 1;
            else {
                month1 = 1;
                year1 = year + 1;
            }
        }
    }

    public static int getDay1() {
        return day1;
    }

    public static void setDay1(int day1) {
        NextDayCalculator.day1 = day1;
    }

    public static int getMonth1() {
        return month1;
    }

    public static void setMonth1(int month1) {
        NextDayCalculator.month1 = month1;
    }

    public static int getYear1() {
        return year1;
    }

    public static void setYear1(int year1) {
        NextDayCalculator.year1 = year1;
    }

    private static boolean isLeapYear(int year){
        if ( year % 4 == 0 && year%100 != 0)
            return true;
        else return year % 400 == 0;

    }
    private static int checkMonth(int month,boolean isLeapYear){
        switch (month){
            case 2 :
               return (isLeapYear? 28:29);
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;

        }
    }

}
