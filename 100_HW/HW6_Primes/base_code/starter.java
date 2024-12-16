/*
 *	Author: Jeff khongpurinart
 *  Date: Oct-13-24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner Jeff = new Scanner(System.in);
		
		System.out.print("Input a number and we'll print out every prime until that number:");
		int n = Jeff.nextInt();
		printPrimes(n);
		
	}
	
	
	
	
	
	public static boolean checkPrime(int input)
	{
		int count = 0;
		int num2 = 1;
		boolean prime;
		
		while(num2 <= input)
		{
			if(input%num2 == 0)
			{
				count++;
			}
			num2++;
		}
		if (count == 2)
		{
			prime = true;
		}
		else
		{
			prime = false;
		}
		
		return prime;
	}
	
	public static void printPrimes(int bruh)
	{
		int num = 1;
		while(num < bruh)
		{
			if(checkPrime(num))
			{
				System.out.println(num);
				
			}
			num++;
		}
	}
	
	
}
