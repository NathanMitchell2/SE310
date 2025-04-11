public class Time {
    protected int hour;
    protected int tensMinute;
    protected int onesMinute;
    protected String meridiem;

    public Time(int hour, int tensMinute, int onesMinute, String meridiem){
        this.hour = hour;
        this.tensMinute = tensMinute;
        this.onesMinute = onesMinute;
        this.meridiem = meridiem;
    }
}
