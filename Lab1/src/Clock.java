
public class Clock {
    protected Time currentTime;

    public Clock(Time currentTime){
        this.currentTime = currentTime;
    }

    public String getCurrentTime(){
        return currentTime.getHour()+":"+String.format("%02d", currentTime.getMinute())+":"+String.format("%02d", currentTime.getSecond())+" "+currentTime.getMeridiem();
    }

    public void setTime(Time newTime){
        currentTime = newTime;
    }

    public void tick() {
        currentTime.tick();
    }
}
