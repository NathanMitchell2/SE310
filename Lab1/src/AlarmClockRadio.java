
public class AlarmClockRadio {
    public static void main(String[] args) {
        int i;
        int seconds;
        Radio myRadio = new Radio("1060 AM", 100);
        AlarmClock myAlarmClock = new AlarmClock(new Time(8, 0, 0, "AM"));

        myAlarmClock.setAlarm(new Time(8, 5, 0, "AM"));

        System.out.println("AlarmClockRadio 5000 is on and is playing "+ myRadio.getCurrentRadioStation());
        System.out.println("Current time: "+myAlarmClock.getCurrentTime());

        while(!myAlarmClock.isAlarmTime()) {
                myAlarmClock.tick();
                System.out.println(myAlarmClock.getCurrentTime());
        }

        System.out.println("The radio is playing "+myRadio.getCurrentRadioStation());
        myAlarmClock.snooze();

        while(!myAlarmClock.isAlarmTime()) {
                myAlarmClock.tick();
                System.out.println(myAlarmClock.getCurrentTime());
        }

        System.out.println("The radio is playing "+myRadio.getCurrentRadioStation());
        myAlarmClock.turnAlarmOff();
        myRadio.turnRadioOff();
    }
}