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
		
		int[] nums = new int[1000];
		for(int c = 0; c < 1000; c++){
			int ran = (int)(Math.random()*1000 + 1);
			nums[c] = ran;
			
			System.out.println(nums[c]);
		}
		


		
	}
}
