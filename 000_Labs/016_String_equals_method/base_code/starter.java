/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner Jeff = new Scanner(System.in);
		
		System.out.println("What would you want to be? Wizard, Warrior, or Rogue");
		System.out.print("Enter: ");
		String ans = "No role";
		
		 ans = Jeff.nextLine();
		
		if(ans.equals("Wizard") || ans.equals("wizard"))
		{
			System.out.println("You chose to be a wizard");
		}
		else if (ans.equals("Warrior") || ans.equals("warrior"))
		{
			System.out.println("You chose to be a warrior");
		}
		else if (ans.equals("Rogue") || ans.equals("Rogue"))
		{
			System.out.println("You chose to be a rogue");
		}
		else
		{
			System.out.println("Please chooes the three from the top");
		}
	}
}
