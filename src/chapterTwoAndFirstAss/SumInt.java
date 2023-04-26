package chapterTwoAndFirstAss;

import java.util.Scanner;
public class SumInt {

	public static void main (String [] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a number between 0 and 1000: ");
	
	int intNow = input.nextInt();
	
	int divInt = intNow /10; 
	
	int divRem = intNow % 10;
	
	int divRem2 = divInt % 10;
	
	int divInt2 = divInt /10;
	
	int sum = divRem + divRem2 + divInt2;
	
	System.out.println("The sum of the digits is " + sum); 
	
	
		
	
	
	}







}
