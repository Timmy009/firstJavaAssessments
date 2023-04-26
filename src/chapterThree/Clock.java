package chapterThree;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        if (hour > 23 || hour < 0) {this.hour = 0;}
        else {this.hour = hour;}
        if (minute > 59 || minute < 0) {this.minute = 0;}
       else {this.minute = minute;}
      if (second > 59 || second < 0) {this.second = 0;}
      else {
        this.second = second;}
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour <= 23 && hour >= 0) {
            this.hour = hour;
        } else {this.hour = 0;}
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute <= 59 && minute >= 0) {
        this.minute = minute;}
        else {this.minute = 0;}
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second <= 59 && second >= 0) {
        this.second = second;}
        else {this.second = 0;}
    }
    public String displayTime () {
       return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
