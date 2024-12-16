/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner Jeff = new Scanner(System.in);
		
		System.out.println("What day is tomorrow? Sunday is 1, Monday is 2, Tuseday is 3, Wednesday is 4, Thursday is 5, Friday is 6, and Saturday is 7.");
		System.out.print("Enter: ");
		int day = Jeff.nextInt();
		Jeff.nextLine();
		
		if(day == 1 || day == 7)
		{
			System.out.println("Wake up at 10 tomorrow! YAYY!");
		}
		else if(day == 2 || day == 3 || day == 4 || day == 5 || day == 6)
		{
			System.out.println("Sadly you have to wake up at 7am tomorrow T_T");
		}
		else
		{
			System.out.println("Please enter a valid number");
		}
		
	}
}
