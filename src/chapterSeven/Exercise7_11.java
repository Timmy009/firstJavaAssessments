package chapterSeven;

public class Exercise7_11 {
    public static void main(String[] args) {
        int [] scores = new int[20];

        for (int count = 0; count <scores.length; count++) {
            if (count ==0) {
            scores[count] = 0;}
            scores[count] *=  2;
        }
        for (int count = 0; count <= 10; count++) {
            System.out.println(scores[count]);
        }
    }
}
