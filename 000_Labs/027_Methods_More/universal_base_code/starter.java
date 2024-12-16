/*
 *	Author:  Jeff khongpurinart
 *  Date: Oct - 25 - 24
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
		
		BaseClass test = new BaseClass();
		System.out.println("What class would you like to be? Wizard, warrior, or rogue");
		System.out.print("Enter: ");
		String ans = Jeff.nextLine();
		test.setRole(ans);
		
		System.out.println("Enter the strength trait");
		System.out.print("Enter: ");
		int st = Jeff.nextInt();
		
		System.out.println("Enter the dexterity trait");
		System.out.print("Enter: ");
		int de = Jeff.nextInt();
		
		System.out.println("Enter the intelligence trait");
		System.out.print("Enter: ");
		int in = Jeff.nextInt();
		
		System.out.println("Enter the charisma trait");
		System.out.print("Enter: ");
		int ch = Jeff.nextInt();
		
		BaseClass start = new BaseClass(ans, st, de, in, ch );
		start.check(st, de, in, ch);
		
		start.myToString();

		
	}
}
