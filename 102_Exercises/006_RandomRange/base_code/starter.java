/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner Jeff = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num1 = Jeff.nextInt();
		
		System.out.print("Enter a second number (bigger than the first number): ");
		int num2 = Jeff.nextInt();
		
		int x = num2 - num1;
		int r = (int)(Math.random() * x) + num1;
		System.out.print("Random number between " + num1 + " and " + num2 + " is:" + r);
	}
}
