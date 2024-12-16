/*
 *	Author:  Jeff khon.
 *  Date: Sep - 24 - 24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner Jeff = new Scanner(System.in);
		
		//your name
		System.out.println("What is your name?");
		System.out.print("Enter: ");
		String name = Jeff.nextLine();
		
		// your title
		System.out.println("What is your  title? Ex: Slayer of Dragons");
		System.out.print("Enter: ");
		String title = Jeff.nextLine();
		
		//your role
		System.out.println("What would you want to be? Wizard, Warrior, or Rogue");
		System.out.print("Enter: ");
		
		String ans = Jeff.nextLine();
		
		if(ans.equals("Wizard") || ans.equals("wizard"))
		{
			System.out.println("You chose to be a wizard!");
		}
		else if (ans.equals("Warrior") || ans.equals("warrior"))
		{
			System.out.println("You chose to be a warrior!");
		}
		else if (ans.equals("Rogue") || ans.equals("Rogue"))
		{
			System.out.println("You chose to be a rogue!");
		}
		else
		{
			System.out.println("Please chooes the three from the top");
		}
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("UPGRADE TIME!");
		//skills
		int num = 20;
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		
		//strength
		    System.out.println("Strength (1-10)");
		    System.out.print("Enter: ");
		    int s = Jeff.nextInt();
		 if(num > s && num <= 10)
		{
		    num = num - s;
		
		    System.out.println("You have " + num + " more points");
		}
		else if(num <= 0 || num < s || num > 10)
		{
			System.out.println("You only have " + num + " points, you need to choose lower number");
			System.out.print("Enter: ");
			int s2 = Jeff.nextInt();
			num = num - s2;
			System.out.println("You have " + num + " more points");
			
		}
		else
		{
			System.out.println("Please enter a valid answer");
			System.out.print("Enter: ");
			int s3 = Jeff.nextInt();
			num = num - s3;
			System.out.println("You have " + num + " more points");
		}
		
		
		//dexterity
		System.out.println("Dexterity (1-10)");
		System.out.print("Enter: ");
		int d = Jeff.nextInt();
		
		if(num > d && num <= 10)
		{
		num = num - d;
		
		System.out.println("You have " + num + " more points");
		}
		else if(num <= 0 || num < d || num > 10)
		{
			System.out.println("You only have " + num + " points, you need to choose lower number");
			System.out.print("Enter: ");
			int d2 = Jeff.nextInt();
			num = num - d2;
			System.out.println("You have " + num + " more points");
		}
		else
		{
			System.out.println("Enter a valid answer");
			System.out.print("Enter: ");
			int d3 = Jeff.nextInt();
			num = num - d3;
			System.out.println("You have " + num + " more points");
		}
		
		//Intelligence
		System.out.println("Intelligence (1-10)");
		System.out.print("Enter: ");
		int i = Jeff.nextInt();
		if(num > i && num <= 10)
		{
		
		num = num - i;
		
		System.out.println("You have " + num + " more points");
		}
		else if(num <= 0 || num < i || num > 10)
		{
			System.out.println("You only have " + num + " points, you need to choose lower number");
			System.out.print("Enter: ");
			int i2 = Jeff.nextInt();
			num = num - i2;
			System.out.println("You have " + num + " more points");
		}
		else
		{
			System.out.println("Enter a valid answer");
			System.out.print("Enter: ");
			int i3 = Jeff.nextInt();
			num = num - i3;
			System.out.println("You have " + num + " more points");
		}
		
		//Charisma (1-10)
		System.out.println("Charisma (1-10)");
		System.out.print("Enter: ");
		int c = Jeff.nextInt();
		if(num > c || num <= 10)
		{
		
		num = num - c;
		
		System.out.println("You have " + num + " more points");
		}
		else if(num <= 0 || num < c || num > 10)
		{
			System.out.println("You only have " + num + " points, you need to choose lower number");
			System.out.print("Enter: ");
			int c2 = Jeff.nextInt();
			num = num - c2;
			System.out.println("You have " + num + " more points");
		}
		else
		{
			System.out.println("Enter a valid answer");
			System.out.print("Enter: ");
			int c3 = Jeff.nextInt();
			num = num - c3;
			System.out.println("You have " + num + " more points");
		}
		
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("You are " + name + ",the " + title + " of CVHS. ");
		System.out.println("You're a " + ans + " with the following stats!");
		System.out.println("Strenth - " + s);
		System.out.println("Dexterity - " + d);
		System.out.println("Intelligence - " + i);
		System.out.println("Charisma - " + c);
	}
}
