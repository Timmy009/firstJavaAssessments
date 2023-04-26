package chapterTwoAndFirstAss;

import java.util.Scanner;

public class Exercise30 {

	public static void main (String [] args) {
	
	Scanner input = new Scanner (System.in);
	
	System.out.println ("Enter a number");
	
	int num = input.nextInt();
	
	
	int rem1 = num % 10;
	
	int div1 = num / 10;
	
	int rem2 = div1 % 10;
	
	int div2 = div1 / 10;
	
	int rem3 = div2 % 10;
	
	
	
	int div3= div2 / 10;
	
	int rem4 = div3 % 10;
	
	int div4 = div3 / 10;
	
	System.out.printf ("%s  %s  %s  %s  %s %n", div4, rem4, rem3, rem2, rem1);
	
	
	}








}
