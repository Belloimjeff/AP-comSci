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
		// BaseClass test = new BaseClass();
        Scanner Jeff = new Scanner(System.in);
    
        System.out.println("Enter a word: ");
        String word = Jeff.nextLine();
        
        System.out.println("Letter by letter: ");
        
        int c = 0;
        while(c < word.length()){
        	System.out.println(c + "\t" + word.substring(c, c+1));
        	c++;
        }
        

		
	}
}
