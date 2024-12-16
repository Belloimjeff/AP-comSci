/*
 *	Author:  Jeff Khongpurinart
 *  Date: Nov - 19 - 24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		// BaseClass test = new BaseClass();
		Scanner Jeff = new Scanner(System.in);
		
		System.out.println("Enter a first name and last name with a space in the middle: ");
		String name = Jeff.nextLine();
		
		int x = name.indexOf(" ");
		
		System.out.print("The last name is: " + name.substring(x+1));
		
		
	}
}
