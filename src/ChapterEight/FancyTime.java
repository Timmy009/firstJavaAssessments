package ChapterEight;

import java.util.Objects;

public class FancyTime {
    private float hour;
    private float minute;
    private float second;

    private String meridem;

    public FancyTime(float hour, float minute, float second, String meridem) {
        validateTime(hour, minute, second, meridem);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.meridem = meridem;
    }

    public FancyTime(float hour, float minute, float second) {
      this(hour, minute, second, "");
    }

    public FancyTime(float hour, float minute) {
       this(hour, minute, 0);
    }


    private static void validateTime (float hour, float minute, float second, String meridem) {
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);



    }
    private static void validateHour(float hour) {
        if (hour < 0 || hour > 48)  throw new IllegalArgumentException();
    }

    private static void validateMinute(float minute) {
        if (minute < 0 || minute > 59)  throw new IllegalArgumentException();
    }

    private static void validateSecond(float second) {
        if (second < 0 || second > 59)  throw new IllegalArgumentException();
    }
//    private static void validateMeridem(String meridem) {
//        if (!Objects.equals(meridem, "a.m") || !meridem.equals("p.m"))  throw new IllegalArgumentException();
//    }

    private String displayTimeThreeFlag (int flag) {
        return  String.format("%.0f:%.0f:%.0f %s",hour, minute, second, meridem);}

    private String displayTimeTwoFlag (int flag) {
        return  String.format("%.0f:%.0f:%.0f", hour, minute, second);}

    private String displayTimeOneFlag (int flag) {
        return  String.format("%.0f:%.0f",hour, minute );}

    public String displayTIME (int flag) {
//       validateDisplay(flag);
        if (flag == 1) {return displayTimeThreeFlag(flag);}
        if (flag == 2) {return  displayTimeTwoFlag(flag);}
        else {return displayTimeOneFlag(flag);}

    }
    private void validateDisplay (int flag) {
        if (flag != 1 || flag != 2 || flag != 3) {
            throw  new IllegalArgumentException();
        }
    }

}
