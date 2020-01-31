package holidays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Month april=Month.APRIL;
        printMonthHolidays(april);
        Month march=Month.MARCH;
        System.out.printf("%s has %d days\n",
                march.getShortname(),march.getMonthLength());
        printMontNames();
        isHoliday(march,8);
        isHoliday(march,21);

    }

    private static void printMontNames() {
        System.out.println("Printing month names");
        for (Month month : Month.values()) {
            System.out.printf("%s ",month.getShortname());
        }
        System.out.println();
    }

    private static void printMonthHolidays(Month month){
        System.out.format("Printing %s holidays\n",month.getShortname());
        for (Integer holidayDay : month.getHolidayDays()) {
            System.out.printf("%s %d\t",month.getShortname(),holidayDay);
        }
        System.out.println();
    }

    private static void isHoliday(Month month, int day){
        System.out.printf("%s %d is %s\n", month.getShortname(),day,
                (month.isHoliday(day)?"holiday":"not holiday"));
    }

}
