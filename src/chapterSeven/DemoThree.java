package chapterSeven;

public class DemoThree {
    public static void main(String[] args) {
        int[] responses =  {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int fourteen = 0;

        for (int count = 0; count < responses.length; count++) {
            if (responses[count] == 1){
                    one++;
            }
            if (responses[count] == 2){
                two++;
            }
            if (responses[count] == 3){
                three++;
            }
            if (responses[count] == 4){
                four++;
            }
            if (responses[count] == 5){
                five++;
            }
            if (responses[count] == 14){
                fourteen++;
            }
        }

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(fourteen);
    }
}
