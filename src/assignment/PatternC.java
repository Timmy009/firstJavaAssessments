package assignment;

public class PatternC {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 6) {

            int countTwo = 6;
            while (countTwo >= 1) {
                if (countTwo > count) {
                    System.out.print("  ");
                }
                else {
                    System.out.print(" " +  countTwo);
                }
                countTwo--;
            }
            System.out.println();
            count++;

        }
}

}
