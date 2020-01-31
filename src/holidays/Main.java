package holidays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Month january=Month.JANUARY;
        System.out.println("Is January 5 a holiday: "+january.isHoliday(5));
        System.out.println("Is January 6 a holiday: "+january.isHoliday(6));
        System.out.printf("January has %d days\n", january.getMonthLength());
        System.out.printf("January has %d holidays\n", january.getHolidayCount());
    }
}
