/*
 *	Author:  Jeff Khongpurinart
 *  Date: Dec-6-24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner Jeff = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String sentence = Jeff.nextLine();
		
		String finalsen = "";
		
		for(int i = 0; i < sentence.length(); i++){
			int space = sentence.indexOf(" ");
		    String word = sentence.substring(0, space);
		    
		    sentence = sentence.substring(space+1);
		    finalsen = " " + word + finalsen;
		    
		    if(sentence.indexOf(" ") == -1){
			    finalsen = sentence + finalsen;
				break;
				
		    }
		   

		}
				   System.out.println(finalsen);

	}
}
