package logic1;

public class AlarmClock {
    public String alarmClock(int day, boolean vacation) {
        if ((vacation && (day > 0 && day < 6)) || (!vacation && (day == 0 || day == 6))) {
            return "10:00";
        } else if (!vacation) {
            return "7:00";
        } else {
            return "off";
        }
    }
}
