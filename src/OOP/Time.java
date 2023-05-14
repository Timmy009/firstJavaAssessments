package OOP;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time (int hour, int minute, int second) {
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;


    }
    private static void validateHour(int hour){
        if (hour > 24 || hour < 0) throw new IllegalArgumentException();
    }
    private static void validateMinute(int minute){
        if (minute > 59 || minute < 0) throw new IllegalArgumentException();
    }
    private static void validateSecond(int second){
        if (second > 59 || second < 0) throw new IllegalArgumentException();
    }
}
