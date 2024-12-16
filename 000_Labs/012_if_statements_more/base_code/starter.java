/*
 *	Author:  Jeff kho.
 *  Date: Sep-17-24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner Jeff = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = Jeff.nextInt();
		Jeff.nextLine();
		
		System.out.print("Enter a number: ");
		int num2 = Jeff.nextInt();
		Jeff.nextLine();
		
		if(num > num2)
		{
			System.out.println(num + " is larger than " + num2);
		}
		else if(num < num2)
		{
			System.out.println(num + " is smaller than " + num2);
		}
		else
		{
			System.out.println(num + " is equal to " + num2);
		}
	}
}
