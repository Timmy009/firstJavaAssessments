package chapterTwoAndFirstAss;

import java.util.Scanner;

public class Exercise28 {

	public static void main(String [] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the radiuos of the circle");
	
	int radious = input.nextInt();
	
	double diameter = 2 * radious;
	
	System.out.println("The diameter is " + diameter);
	
	double circumference = 2 * Math.PI * radious;
	
	System.out.println ("The circumference is " + circumference);
	
	double area = Math.PI * (Math.sqrt(radious));
	
	System.out.println ("The area is " + area);
	
	
	
	
	
	
	
	
	}





}
