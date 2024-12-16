/*
 *	Author:  Jeff khongpurinart
 *  Date: Oct - 1 - 24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner Jeff = new Scanner(System.in);
		
		int count = 0;
		System.out.print("Enter your name: ");
		String name = Jeff.nextLine();
		
		System.out.print("How many times do yo want me to repeat: ");
		int repeat = Jeff.nextInt();
		
		while(count < repeat)
		{
			System.out.print(name);
			
			count++;
		}
		



		
	}
}
