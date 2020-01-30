package holidays;

import java.util.*;

public enum Months {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
    JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
    private Map<Integer, Boolean> holidays;
    private int monthLength;
    private int holidayCount;
    private static List<Integer> monthDays;
    static {
        monthDays=new ArrayList<>();
        for (int i = 0; i < 32; i++) {
            monthDays.add(i);
        }

    }

    Months() {
        monthLength=0;
        holidayCount=0;
        holidays=new HashMap<>();
    }

    public void initMonth() {
        switch (this) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                monthLength = 31;
                break;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                monthLength = 30;
                break;
            case FEBRUARY:
                monthLength = 28;
                break;
        }
        addRandomHolidays();

    }
    private boolean checkInRange(int day){
        return !(day<0||day> monthLength);

    }
    private void addRandomHolidays(){
        for (int i = 0; i < monthLength; i++) {
            holidays.put(i,false);

        }
        Collections.shuffle(monthDays);
        for (int i = 0; i < 8; i++) {
            if(checkInRange(monthDays.get(i))){
                holidayCount++;
                holidays.put(monthDays.get(i),true);
            }
        }
    }

    public int getMonthLength() {
        return monthLength;
    }

    public int getHolidayCount() {
        return holidayCount;
    }
    public void printHolidays(){
        for (Map.Entry<Integer, Boolean> entry : holidays.entrySet()) {
            if(entry.getValue().equals(true)){
                System.out.println(this.toString()+" "+entry.getKey()+" : Holiday");
            }

        }
    }

    @Override
    public String toString() {
        return this.name();
    }
}


