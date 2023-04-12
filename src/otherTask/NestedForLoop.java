package otherTask;

public class NestedForLoop {
        public static void main(String[] args) {


            for (int count = 1; count <= 5; count++) {
                for (int countTwo = 0; countTwo < count; countTwo++) {
                    System.out.print("*");

                }
                System.out.println();
            }
        }
    }


