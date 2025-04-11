import java.util.ArrayList;

public class AlarmClock extends Clock{
    protected Time alarmTime;
    protected boolean isAlarmOn;

    public AlarmClock(Time currentTime) {

        super(currentTime);
        isAlarmOn = true;
    }
    
    public void setAlarm(Time newAlarmTime) {
        alarmTime = newAlarmTime;
    }

    public Time getAlarm() {
        return alarmTime;
    }

    public void turnAlarmOn() {
        isAlarmOn = true;
        System.out.println("Alarm was turned on");
    }

    public void turnAlarmOff() {
        isAlarmOn = false;
        System.out.println("Alarm was turned off");
    }

    public void snooze() {
        System.out.println("Snooze was pressed");
        int newHour;
        int newMinute;
        newMinute = currentTime.getMinute() + 9;
        if (newMinute > 59){
            newHour = currentTime.getHour()+ 1;
            newMinute -= 60;
        }
        else {
            newHour = currentTime.getHour();
        }
        setAlarm((new Time(newHour, newMinute, 0, "AM")));
    }
    public void checkAlarm(){
        if(isAlarmOn && currentTime.getMeridiem().equals(alarmTime.getMeridiem()) && currentTime.getFullTime().equals(alarmTime.getFullTime())){
            System.out.println("Buz Buz Buz");
        }
    }
}
