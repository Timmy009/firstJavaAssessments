package chapterThree;

public class ClockDriver {
    public static void main(String[] args) {
        Clock clock = new Clock(2, 39, 42);
        System.out.println(clock.displayTime());
    }
}
