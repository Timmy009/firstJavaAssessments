package chapterFour;

import java.util.Scanner;

    public class Chapter4_19 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            double item1 = 239.99;
            double item2 = 129.75;
            double item3 = 99.95;
            double item4 = 350.89;
            double totalPay = 0;
            int numberSold;
            int count = 1;
            while (count <= 4) {
                System.out.println("Enter the number of item " + count + " sold");
                numberSold = input.nextInt();
                switch (count) {
                    case 1:
                      totalPay = totalPay + (item1 * numberSold);
                      break;
                    case 2:
                        totalPay = totalPay + (item2 * numberSold);
                        break;
                    case 3:
                        totalPay = totalPay + (item3 * numberSold);
                        break;
                    case 4:
                        totalPay = totalPay + (item4 * numberSold);
                        break;
                }
                count++;
            }
            double earnings = 200 + (totalPay * 0.09);
            System.out.println("The total earning for the employee is " + earnings);
        }
    }



