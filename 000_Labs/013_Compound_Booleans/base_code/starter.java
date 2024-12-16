/*
 *	Author:  Jeff khongpurinart
 *  Date: Sep - 17- 24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner Jeff = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num1 = Jeff.nextInt();
		
		System.out.print("Enter another number: ");
		int num2 = Jeff.nextInt();
		
		System.out.print("Enter another number: ");
		int num3 = Jeff.nextInt();
		
		if(num1 > num2 && num1 > num3)
		{
			System.out.println(num1 + " is the biggest number");
		}
		if(num2 > num1 && num2 > num3)
		{
			System.out.println(num2 + " is the biggest number");
		}
		if(num3 > num1 && num3 > num2)
		{
			System.out.println(num3 + " is the biggest number");
		}
		
		
		
		if(num1 < num2 && num1 < num3)
		{
			System.out.println(num1 + " is the smaller number");
		}
		if(num2 < num1 && num2 < num3)
		{
			System.out.println(num2 + " is the smaller number");
		}
		if(num3 < num1 && num3 < num2)
		{
			System.out.println(num3 + " is the smaller number");
		}
	}
}
