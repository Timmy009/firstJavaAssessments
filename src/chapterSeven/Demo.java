package chapterSeven;

public class Demo {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        for (int count = 0; count < array.length; count++) {
            System.out.print(count * 10 + "      " + count + 9);
            for (int countTwo = 0; countTwo < array[count]; countTwo++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
