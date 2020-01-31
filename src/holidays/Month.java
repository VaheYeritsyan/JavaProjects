package holidays;

import java.lang.reflect.Array;
import java.util.*;

public enum Month {
    JANUARY("Jan",31,1,6,28),
    FEBRUARY("Feb",28,1,5,23,24),
    MARCH("Mar",31,1,8,23),
    APRIL("Apr",30,5,7,16,25),
    MAY("May",31,8,9,26,28),
    JUNE("June",30,4,12,29,30),
    JULY("July",31,2,1,18,31),
    AUGUST("Aug",31,19,26,23,31),
    SEPTEMBER("Sep",30,1,21),
    OCTOBER("Oct",31,19,26),
    NOVEMBER("Nov",30,1,30,20),
    DECEMBER("Dec",31,3,5,8,31);



    private String shortname;
    private boolean[] isHoliday=null;
    private int monthLength;
    private int holidayCount;
    private ArrayList<Integer> holidayDays;

    Month(String shortname,int monthLength,Integer... holidays) {
        holidayDays=new ArrayList<>();
        this.shortname = shortname;
        this.monthLength = monthLength;
        for (Integer holiday : holidays) {
            if(checkIfInRange(holiday)){
                holidayDays.add(holiday);
            }
        }
        Collections.sort(holidayDays);


    }

    private boolean checkIfInRange(Integer day) {
        return day>0&&day<=monthLength;
    }


    public boolean isHoliday(int day){
        if(!checkIfInRange(day)){
            return false;
        }
        return holidayDays.contains(day);
    }

    public int getHolidayCount(){
        return holidayDays.size();
    }

    public int getMonthLength(){
        return monthLength;
    }

    public String getShortname() {
        return shortname;
    }

    public ArrayList<Integer> getHolidayDays() {
        return holidayDays;
    }
}


