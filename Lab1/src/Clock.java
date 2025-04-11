
public class Clock {
    protected Time currentTime;

    public Clock(Time currentTime){
        this.currentTime = currentTime;

    }

    public Time getCurrentTime(){
        return this.currentTime;
    }

    public void setTime(Time newTime){
        this.currentTime = newTime;
    }
}
