package chapterTwoAndFirstAss;

import java.util.Scanner;

public class Exercise32 {

	public static void main (String [] args) {
	
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Enter five numbers below");
		
		int firstNumber = input.nextInt();
		
		int secondNumber = input.nextInt();
		
		int thirdNumber = input.nextInt();
		
		int fourthNumber = input.nextInt();
		
		int fifthNumber = input.nextInt();
		
		if (firstNumber < 0 && secondNumber >= 0 && thirdNumber >= 0 && fourthNumber >= 0 && fifthNumber >= 0)
		{System.out.println("There is only one negative number");}
		
		else if (secondNumber < 0 && firstNumber >= 0 && thirdNumber >= 0 && fourthNumber >= 0 && fifthNumber >= 0)
		{System.out.println("There is only one negative number");}
		
		else if (thirdNumber < 0 && secondNumber >= 0 && firstNumber >= 0 && fourthNumber >= 0 && fifthNumber >= 0)
		{System.out.println("There is only one negative number");}
		
		else if (fourthNumber < 0 && secondNumber >= 0 && thirdNumber >= 0 && firstNumber >= 0 && fifthNumber >= 0)
		{System.out.println("There is only one negative number");}
		
		else if (fifthNumber < 0 && secondNumber >= 0 && thirdNumber >= 0 && fourthNumber >= 0 && firstNumber >= 0)
		{System.out.println("There is only one negative number");}

		else if (firstNumber < 0 && secondNumber < 0 && thirdNumber >= 0 && fourthNumber >= 0 && fifthNumber >= 0 )
		{System.out.println("There are two negative numbers");}
		
		else if (firstNumber < 0 && thirdNumber < 0 && secondNumber >= 0 && fourthNumber >= 0 && fifthNumber >= 0)
		{System.out.println("There are two negative numbers");}
		
		else if (firstNumber < 0 && fourthNumber < 0 && thirdNumber >= 0 && secondNumber >= 0 && fifthNumber >= 0)
		{System.out.println("There are two negative numbers");}
		
		else if (firstNumber < 0 && fifthNumber < 0 && thirdNumber >= 0 && fourthNumber >= 0 && secondNumber >= 0)
		{System.out.println("There are two negative numbers");}
		
		
		else if (secondNumber < 0 && firstNumber < 0 && thirdNumber >= 0 && fourthNumber >= 0 && fifthNumber >= 0)
		{System.out.println("There are two negative numbers");}
		
		else if (secondNumber < 0 && thirdNumber < 0)
		{System.out.println("There are two negative numbers");}
		
		else if (secondNumber < 0 && fourthNumber < 0)
		{System.out.println("There are two negative numbers");}
		
		else if (secondNumber < 0 && fifthNumber < 0)
		{System.out.println("There are two negative numbers");}
		
		
		else if (thirdNumber < 0 && secondNumber < 0)
		{System.out.println("There are two negative numbers");}
		
		else if (thirdNumber < 0 && firstNumber < 0)
		{System.out.println("There are two negative numbers");}
		
		else if (thirdNumber < 0 && fourthNumber < 0)
		{System.out.println("There are two negative numbers");}
		
		else if (thirdNumber < 0 && fifthNumber < 0)
		{System.out.println("There are two negative numbers");}
		
		
	
	
		else if (fourthNumber < 0 && secondNumber < 0)
		{System.out.println("There are two negative numbers");}
		
		else if (fourthNumber < 0 && thirdNumber < 0)
		{System.out.println("There are two negative numbers");}
		
		else if (fourthNumber < 0 && firstNumber < 0)
		{System.out.println("There are two negative numbers");}
		
		else if (fourthNumber < 0 && fifthNumber < 0)
		{System.out.println("There are two negative numbers");}
		
		
		
		
		else if (fifthNumber < 0 && secondNumber < 0)
		{System.out.println("There are two negative numbers");}
		
		else if (fifthNumber < 0 && thirdNumber < 0)
		{System.out.println("There are two negative numbers");}
		
		else if (fifthNumber < 0 && fourthNumber < 0)
		{System.out.println("There are two negative numbers");}
		
		else if (fifthNumber < 0 && firstNumber < 0)
		{System.out.println("There are two negative numbers");}
		
	
	
		else if (firstNumber < 0 && secondNumber < 0 && thirdNumber < 0)
		{System.out.println("There are three negative numbers");}	
		
		else if (firstNumber < 0 && fourthNumber < 0 && fifthNumber < 0)
		{System.out.println("There are three negative numbers");}	
		
		else if (firstNumber < 0 && secondNumber < 0 && fifthNumber < 0)
		{System.out.println("There are three negative numbers");}
		
		else if (firstNumber < 0 && fourthNumber < 0 && thirdNumber < 0)
		{System.out.println("There are three negative numbers");}	
		
		
		
		
		else if (secondNumber < 0 && firstNumber < 0 && thirdNumber < 0)
		{System.out.println("There are three negative numbers");}	
		
		else if (secondNumber < 0 && fourthNumber < 0 && fifthNumber < 0)
		{System.out.println("There are three negative numbers");}	
		
		else if (secondNumber < 0 && firstNumber < 0 && fifthNumber < 0)
		{System.out.println("There are three negative numbers");}
		
		else if (secondNumber < 0 && fourthNumber < 0 && thirdNumber < 0)
		{System.out.println("There are three negative numbers");}	
		
		
		
		else if (thirdNumber < 0 && firstNumber < 0 && secondNumber < 0)
		{System.out.println("There are three negative numbers");}	
		
		else if (thirdNumber < 0 && fourthNumber < 0 && fifthNumber < 0)
		{System.out.println("There are three negative numbers");}	
		
		else if (thirdNumber < 0 && firstNumber < 0 && fifthNumber < 0)
		{System.out.println("There are three negative numbers");}
		
		else if (thirdNumber < 0 && fourthNumber < 0 && secondNumber < 0)
		{System.out.println("There are three negative numbers");}
		
		
		else if (fourthNumber < 0 && firstNumber < 0 && secondNumber < 0)
		{System.out.println("There are three negative numbers");}	
		
		else if (fourthNumber < 0 && thirdNumber < 0 && fifthNumber < 0)
		{System.out.println("There are three negative numbers");}	
		
		else if (fourthNumber < 0 && firstNumber < 0 && fifthNumber < 0)
		{System.out.println("There are three negative numbers");}
		
		else if (fourthNumber < 0 && thirdNumber < 0 && secondNumber < 0)
		{System.out.println("There are three negative numbers");}	
		
		
		
		else if (fifthNumber < 0 && firstNumber < 0 && secondNumber < 0)
		{System.out.println("There are three negative numbers");}	
		
		else if (fifthNumber < 0 && thirdNumber < 0 && fourthNumber < 0)
		{System.out.println("There are three negative numbers");}	
		
		else if (fifthNumber < 0 && firstNumber < 0 && fourthNumber < 0)
		{System.out.println("There are three negative numbers");}
		
		else if (fifthNumber < 0 && thirdNumber < 0 && secondNumber < 0)
		{System.out.println("There are three negative numbers");}	
		
		
		
		else if (firstNumber < 0 && secondNumber < 0 && thirdNumber < 0 && fourthNumber < 0)
		{System.out.println("There are four negative numbers");}	
		
		else if (firstNumber < 0 && secondNumber < 0 && thirdNumber < 0 && fifthNumber < 0)
		{System.out.println("There are four negative numbers");}		
		
		else if (firstNumber < 0 && secondNumber < 0 && fifthNumber < 0 && fourthNumber < 0)
		{System.out.println("There are four negative numbers");}	
		
		else if (firstNumber < 0 && fifthNumber < 0 && thirdNumber < 0 && fourthNumber < 0)
		{System.out.println("There are four negative numbers");}
		
		else if (fifthNumber < 0 && secondNumber < 0 && thirdNumber < 0 && fourthNumber < 0)
		{System.out.println("There are four negative numbers");}	
		
		else {System.out.println("There are five negative numbers");}		
		
	}






}
