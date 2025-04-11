
public class AlarmClockRadio {
    public static void main(String[] args) {
        int i;
        int seconds;
        Radio myRadio = new Radio("1060 AM", 100);
        AlarmClock myAlarmClock = new AlarmClock(new Time(8, 0, 0, "AM"));

        myAlarmClock.setAlarm(new Time(8, 5, 0, "AM"));

        System.out.println("AlarmClockRadio 5000 is on and is playing "+ myRadio.getCurrentRadioStation());
        System.out.println("Current time: "+myAlarmClock.getCurrentTime());
        for (i = 0; i < 5; i++)
        {
            for (seconds = 0; seconds < 60; seconds++)
            {
                myAlarmClock.tick();
                System.out.println(myAlarmClock.getCurrentTime());
                myAlarmClock.checkAlarm();

            }
        }
        myAlarmClock.snooze();
        for (i = 0; i < 9; i++)
        {
            for (seconds = 0; seconds < 60; seconds++)
            {
                myAlarmClock.tick();
                System.out.println(myAlarmClock.getCurrentTime());
                myAlarmClock.checkAlarm();

            }
        }
        myAlarmClock.turnAlarmOff();
        myRadio.turnRadioOff();
    }
}