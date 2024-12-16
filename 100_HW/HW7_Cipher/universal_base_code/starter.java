/*
 *	Author: Jeff khongpurinart
 *  Date: Oct 20 24
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// // Your code goes below here
		Scanner Jeff = new Scanner(System.in);
		
		System.out.println("Please enter a message you want to decipher: ");
		String input = Jeff.nextLine();
		System.out.println("Please enter a key: ");
		int key = Jeff.nextInt();
	 	
	    System.out.println(Cipher.encode(input));
		System.out.println(Cipher.keyedEncode(input,key));

	}
}
