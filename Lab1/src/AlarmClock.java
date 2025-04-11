public class AlarmClock extends Clock{
    protected Time alarmTime;
    protected boolean isAlarmOn;

    public AlarmClock(Time currentTime) {
        super(currentTime);
    }
    
    public void setAlarm(Time newAlarmTime) {
        this.alarmTime = newAlarmTime;
    }

    public Time getAlarm() {
        return this.alarmTime;
    }

    public void turnAlarmOn() {
        this.isAlarmOn = true;
    }

    public void turnAlarmOff() {
        this.isAlarmOn = false;
    }

    public void snooze() {

    }
}
