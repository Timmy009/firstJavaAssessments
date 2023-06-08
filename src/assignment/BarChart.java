package assignment;

import java.util.Scanner;

public class BarChart {


            public static void main(String[] args) {
                String me = "jkdj";
                System.out.println(me.getClass());



                Scanner input = new Scanner(System.in);
                int number = 0;
                int maxNumber = 5;
                int num1 = 0;
                int num2 = 0;
                int num3 = 0;
                int num4 = 0;
                int num5 = 0;
                int count = 1;
                while (count <= maxNumber) {

                    System.out.println("Enter a number between 1 and 30");
                    number = input.nextInt();
                    if (number >= 1 && number <= 30) {
                        if (count == 1) {
                            num1 = number;
                        } else if (count == 2) {
                            num2 = number;
                        } else if (count == 3) {
                            num3 = number;
                        } else if (count == 4) {
                            num4 = number;
                        } else if (count == 5) {
                            num5 = number;
                        }
                        count++; }
                    else {System.out.println("Enter a valid number between 1 and 30");
                    }
                    }
                barChartCalculator(num1);
                barChartCalculator(num2);
                barChartCalculator(num3);
                barChartCalculator(num4);
                barChartCalculator(num5);

            }

            public static void barChartCalculator (int num) {
                int countTwo = 1;
                while (countTwo <= num) {
                    System.out.print("*");
                    countTwo++;
                }
                System.out.println();
            }
        }
