package otherTask;

public class ArrayTwo {
        public static void main(String[] args) {
            final int arrayLenght = 10;
            int [] array = new int[arrayLenght];
            int count = 0;
            while (count < array.length) {
                array[count] = 2 + 2 * count;
                System.out.println(count + " " + array[count]);
                count++;
            }
        }
    }


