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
		BaseClass test = new BaseClass();
        Scanner Jeff = new Scanner(System.in);
        
        System.out.println("Enter your pet peeve: ");
        String petPeeve = Jeff.nextLine();
        
        String a = "Did you just say '";
        String b = "' is your per peeve? \n";
        String c = "\t \tWow how dare you. \\\\ Get out of here!";
		
		System.out.print(a + petPeeve + b + c);
	}
}
