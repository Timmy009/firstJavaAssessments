package otherTask;

public class ClassWork {

        public static void main(String[] args) {
            int count = 1;
            while (count <= 100) {
                if (count % 3 == 0 && count % 5 == 0) {System.out.println("FizzBuzz");}
                else if (count % 5 == 0) {System.out.println("Buzz");}
                else if (count % 3 == 0) {
                    System.out.println("Fizz");
                }
                else {System.out.println(count);}
                count++;
            }
        }
    }


