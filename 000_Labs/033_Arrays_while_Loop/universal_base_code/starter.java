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
		
		int[] nums = new int[1001];
		
		int c = 0;
		while(c < 1001){
			int rand = (int)(Math.random()*100 + 1);
			
			nums[c] = rand;
			 System.out.println("Index: " +  c +  " Value: " + nums[c]);
			 c++;
		}


		
	}
}
