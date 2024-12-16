/*
 *	Author:  Jeff Khongpurinart
 *  Date: Oct - 1 - 24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner Jeff = new Scanner(System.in);
		
		int secret = (int)(Math.random() * 1000) + 1;
		while(true)
		{
			System.out.print("Guess the number: ");
			int guess = Jeff.nextInt();
			
			if(guess > secret)
			{
				System.out.println("You're a little too high!");
			}
			
			else if(guess < secret)
			{
				System.out.println("You're a little too low!");
			}
			
			else if(guess == secret)
			{
				System.out.println("YOU GUESSED IT RIGHT");
				break;
			}
		}



		
	}
}
