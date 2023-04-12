package otherTask;

public class loop {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 4) {

            int countTwo = 1;
            while (countTwo <= 4) {

                if (countTwo == 1 && count == 1) {
                    System.out.print(" ");
                } else if  (countTwo == 4 && count == 1)  {
                    System.out.print("  ");
                }
              else {
                System.out.print(" *");}
                countTwo++;
            }


            System.out.println();
            count++;
        }
    }
}
