package otherTask;

import java.util.Scanner;

    public class SwitchStatement {
        public static void main(String[] args) {
            int gradeA = 0;
            int gradeB = 0;
            int gradeC = 0;
            int gradeD = 0;
            int gradeE = 0;
            int gradeF = 0;
            int total = 0;
            int grade = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the Number of the students");
            int numberOfStuents = input.nextInt();
            System.out.println("Enter the integer grades in the range 0 - 100");
            int count = 1;
            while (count <= numberOfStuents) {

                System.out.println("Enter the " + count + " student grade");
                grade = input.nextInt();
                System.out.println("The " + count + " Student mark is " + grade);
                total = total + grade;

                switch (grade / 10){
                    case 9:
                    case 10:
                        gradeA++;
                        break;
                    case 8:
                        gradeB++;
                        break;
                    case 7:
                        gradeC++;
                        break;
                    case 6:
                        gradeD++;
                        break;
                    case 5:
                        gradeE++;
                        break;
                    default:
                        gradeF++;
                        break;
                }
                count++;
            }
            System.out.println("Grade Report");
            System.out.println();
            System.out.println("Total of the " + numberOfStuents + " grades entered are " + total);
            System.out.println();
            System.out.println("Class average is " + total/numberOfStuents);
            System.out.println();
            System.out.println("Number of students who recieved each grade");
            System.out.println();
            System.out.println("Student that got A " + gradeA);
            System.out.println("Student that got B " + gradeB);
            System.out.println("Student that got C " + gradeC);
            System.out.println("Student that got D " + gradeD);
            System.out.println("Student that got E " + gradeE);
            System.out.println("Student that got F " + gradeF);

        }
    }

