package chapterFive;

import java.util.Scanner;

    public class Exercise5_17 {
        public static void main(String[] args) {
            int gradeA = 0;
            int gradeB = 0;
            int gradeC = 0;
            int gradeD = 0;
            int gradeE = 0;
            int maxNumber = 5;
            Scanner input = new Scanner(System.in);;
            int count = 1;
            while (count <= maxNumber) {
                System.out.print("Student Name");
                String studentName = input.nextLine();
                System.out.print("Student letter grade");
                String letterGrade = input.nextLine();
                switch (letterGrade) {
                    case "A":
                        gradeA++;
                        break;
                    case "B":
                        gradeB++;
                        break;
                    case "C":
                        gradeC++;
                        break;
                    case "D":
                        gradeD++;
                        break;
                    default:
                        gradeE++;
                        break;

                }
                count++;
            }
            System.out.println("The number of students that got A is " + gradeA);
            System.out.println("The number of students that got B is " + gradeB);
            System.out.println("The number of students that got C is " + gradeC);
            System.out.println("The number of students that got D is " + gradeD);
            System.out.println("The number of students that got E is " + gradeE);


        }



}
