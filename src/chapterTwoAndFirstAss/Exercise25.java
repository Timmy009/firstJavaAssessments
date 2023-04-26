package chapterTwoAndFirstAss;

import java.util.Scanner;

public class Exercise25 {

	public static void main (String [] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println ("Enter an integer");
	
	int intInput = input.nextInt();
	
	int intRem = intInput % 3;
	
	
	
	if (intRem == 0) {
	
	System.out.println ("This number is divisible by 3");
	}
	 else {System.out.println("This number is not divisible by 3");}
	
	}





}
