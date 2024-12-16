/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner Jeff = new Scanner(System.in);
		
		int ran = (int)(Math.random()*1000)+1;
		
		System.out.println("Guess a number from 1-1000");
		System.out.print("Enter: ");
		int num = Jeff.nextInt();
		Jeff.nextLine();
		
		if(ran < num)
		{
			System.out.println("Guess lower numder");
		}
		else if(ran > num)
		{
			System.out.println("Guess higher number");
		}
		else
		{
			System.out.println("COGRATS YOU GOT IT RIGHTTT!");
		}
		
		System.out.println("The answer is " + ran);
	}
}
