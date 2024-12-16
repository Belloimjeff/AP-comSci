/*
 *	Author: Jeff khongpurinart
 *  Date: Sep - 26 - 24
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner Jeff = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int num1 = Jeff.nextInt();
		System.out.print("Please enter another number: ");
		int num2 = Jeff.nextInt();
		
		//num1
		int x1 = num1 % 2;
		int x2 = num1 % 3;
		
		//num2 
		int y1 = num2 % 2;
		int y2 = num2 % 3;
		
		// num1
		if(x1 == 0)
		{
			System.out.println(num1 + " is divisible by 2");
			System.out.println(num1 + " is not divisible by 3, 4, or 5!");
		}
		else if(x1 != 0)
		{
			System.out.println(num1 + " is not divisible by 2");
			System.out.println(num1 + " is divisible by " + num1);
		}
		
		//num2
		if(y1 == 0)
		{
			System.out.println(num2 + " is divisible by 2");
			System.out.println(num2 + " is not divisible by 3, 4, or 5!");
		}
		else if(y2 != 0)
		{
			System.out.println(num2 + " is not divisible by 2");
			System.out.println(num2 + " is divisible by " + num2);
		}
	
	
	}
}
