package chapterTwoAndFirstAss;

import java.util.Scanner;

public class Exercise26 {

	public static void main (String [] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter two integers below");
	
	int firstNum = input.nextInt();
	
	int secondNum = input.nextInt();
	
	int firstTripled = firstNum * 3;
	
	int secondDoubled = secondNum * 2;
	
	
	if (firstTripled % secondDoubled == 0) {
	System.out.println ("The first number trippled which is " + firstTripled + " is a multiple of the second number doubled " + secondDoubled);
	} 
	
	else {
	
	System.out.println ("The first number trippled which is " + firstTripled + " is not a multiple of the second number doubled " + secondDoubled);
	}
	
	
	
	}




}
