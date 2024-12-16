/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner Jeff = new Scanner(System.in);
		
		myCharacter start = new myCharacter();
		start.first();
		
		System.out.println("What would you want to be? Wizard, Warrior, or Rogue");
		System.out.print("Enter: ");
		String role = Jeff.nextLine();
		
		myCharacter Joe = new myCharacter(role);
		Joe.something();
		
        

		
	}
}
