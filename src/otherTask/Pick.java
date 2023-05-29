package otherTask;

public class Pick {
    public static void main(String[] args) {
        System.out.println(pic(296));

    }
    public static int pic (int number) {
        int add = 0;
        while (number > 0){
            int first = number % 10;
            number = number / 10;

            add += first;


        }
        return add;
    }
}
