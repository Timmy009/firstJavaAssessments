package assignment;

public class MultiplicationReverse {
    public static void main(String[] args) {
        int number = 12;
        int max = 1;
      int  numberMultiplied = 10;
      System.out.println("10 MULTIPLICATION TABLE IN REVERSE ORDER");
        while (number >= max)  {
            System.out.println(number + " * " + numberMultiplied + " = " + numberMultiplied * number);
            number--;
        }
    }
}
