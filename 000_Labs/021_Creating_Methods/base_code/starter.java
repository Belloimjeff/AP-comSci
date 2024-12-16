/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
       Scanner Jeff = new Scanner(System.in);
       
       System.out.println("Write a sentence!");
       String sentence  = Jeff.nextLine();
       
       sentence(sentence);
       
       System.out.println("Write a sentence!");
       String combine  = Jeff.nextLine();
	   
	   toStringCombined(sentence,combine);
	   
	}
	
	public static void sentence(String sentence)
	{
		System.out.print(sentence);
	}
	
	public static void toStringCombined(String sentence, String combine)
	{
		System.out.print(sentence + combine);
	}
	
}
