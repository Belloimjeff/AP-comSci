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
		
		BaseClass first = new BaseClass();
		first.myToString();
		
		System.out.println("What class would you like to be? Wizard, Rouge, or Warrior");
		System.out.print("Enter: ");
		String ans = Jeff.nextLine();
		
		BaseClass second = new BaseClass(ans);
		second.myToString();


		
	}
}
