import java.util.ArrayList;

public class Time {
    private int hour;
    private int minute;
    private int second;
    private String meridiem;

    public Time(int hour, int minute, int second, String meridiem){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.meridiem = meridiem;
    }

    public void tick() {
        second++;
        if (second > 59) {
            second = 0;
            minute++;
        }
        if (minute > 59) {
            minute = 0;
            hour++;
        }
        if (hour > 11) {
            hour = 1;
            if (meridiem.equals("AM")) {
                meridiem = "PM";
            }
            else {
                meridiem = "AM";
            }
        }
    }

    public int getHour(){return hour;}

    public int getMinute() {return minute;}

    public int getSecond(){return second;}

    public String getMeridiem() {return meridiem;}

    public ArrayList<Integer> getFullTime() {
        ArrayList<Integer> fullTime = new ArrayList<Integer>();
        fullTime.add(hour);
        fullTime.add(minute);
        fullTime.add(second);
        return fullTime;
    }
}
