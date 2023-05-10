package otherTask;

public class PassByValue {
    public static void main(String[] args) {
        int number = 10;
        modify(number);
        System.out.println(number);


    }
    public static void modify(int number ) {
        number = 40;
        System.out.println(number);
    }
}
