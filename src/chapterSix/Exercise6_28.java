package chapterSix;

public class Exercise6_28 {

    public static String temperatureCheck(String celsius) {
        if (celsius.contentEquals("20-30 C")) {
            return "Its reasonable weather for sports today";
        } else if (celsius.contentEquals("10-40 C")) {
            return "Please exercise with care today, watch out for the weather!";
        }
        else return "Input valid weather";
    }
}
