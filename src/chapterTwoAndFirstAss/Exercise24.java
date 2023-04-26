package chapterTwoAndFirstAss;

import java.util.Scanner;

public class Exercise24 {

	public static void main (String [] args) {
	
	Scanner input = new Scanner (System.in);
	
	System.out.println ("Enter five numbers below: ");
	
	int firstNum = 	input.nextInt();
	
	int secondNum = input.nextInt();
	
	int thirdNum = 	input.nextInt();
	
	int fourthNum = input.nextInt();
	
	int fifthNum = 	input.nextInt();
	
	if (firstNum > secondNum && firstNum > thirdNum && firstNum > fourthNum && firstNum > fifthNum)
	{System.out.println("The largest number is " + firstNum);}
	
	else if (secondNum > firstNum && secondNum > thirdNum && secondNum > fourthNum && secondNum > fifthNum)
	{System.out.println("The largest number is " + secondNum);}
	
	else if (thirdNum > secondNum && thirdNum > firstNum && thirdNum > fourthNum && thirdNum > fifthNum)
	{System.out.println("The largest number is " + thirdNum);}
	
	else if (fourthNum > secondNum && fourthNum > thirdNum && fourthNum > firstNum && fourthNum > fifthNum)
	{System.out.println("The largest number is " + fourthNum);}
	
	else if (fifthNum > secondNum && fifthNum > thirdNum && fifthNum > fourthNum && fifthNum > firstNum)
	{System.out.println("The largest number is " + fifthNum);}
	
	else {System.out.println("Some numbers are equal");}
	
	
	
	
	if (firstNum < secondNum && firstNum < thirdNum && firstNum < fourthNum && firstNum < fifthNum)
	{System.out.println("The smallest number is " + firstNum);}
	
	else if (secondNum < firstNum && secondNum < thirdNum && secondNum < fourthNum && secondNum < fifthNum)
	{System.out.println("The smallest number is " + secondNum);}
	
	else if (thirdNum < secondNum && thirdNum < firstNum && thirdNum < fourthNum && thirdNum < fifthNum)
	{System.out.println("The smallest number is " + thirdNum);}
	
	else if (fourthNum < secondNum && fourthNum < thirdNum && fourthNum < firstNum && fourthNum < fifthNum)
	{System.out.println("The smallest number is " + fourthNum);}
	
	else if (fifthNum < secondNum && fifthNum < thirdNum && fifthNum < fourthNum && fifthNum < firstNum)
	{System.out.println("The smallest number is " + fifthNum);}
	
	else {System.out.println("Some numbers are equal");}
	}




}
