/*
 *	Author:  Jeff Kho
 *  Date: Sep-11-24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner Jeff = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		String text = Jeff.nextLine();
		
		System.out.println("Enter your age: ");
		int num = Jeff.nextInt();
		Jeff.nextLine();
		
		System.out.println("Enter your birthday: ");
		String text2 = Jeff.nextLine();
		
		System.out.println("How much is a buck fifty");
		double num2 = Jeff.nextDouble();
		Jeff.nextLine();
	}
}
