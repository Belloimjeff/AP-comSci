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
		int[] num = new int[150];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int total = 0;
		
		for(int c = 0; c < num.length; c++){
			int ran = (int)(Math.random()*100 + 1);
			num[c] = ran;
			
			if(num[c] < min){
				min = num[c];
			}
			
			if(num[c] > max){
				max = num[c];
			}
			total = total + num[c];
			
		}
		System.out.println("The minimum number of this array is " + min);
		System.out.println("The maximum number of this array is " + max);
			double average = total/num.length;
		System.out.println("The average number of this array is " + average);
		System.out.println("There are " + num.length + " numbers in this array");
		
		
		
		// for(int z = 0; z < num.length; z++){
		// 	int rand = (int)(Math.random()*100 + 1);
		// 	num[z] = rand;
		// 	if(num[z] > max){
		// 		max = num[z];
		// 	}
		// }
        // System.out.println("The maximum number of this array is " + max);

		// int total = 0;
		// for(int d = 0; d < num.length; d++){
		// 	int ran = (int)(Math.random()*100 + 1);
		// 	num[d] = ran;
		// 	total = total + num[d];
		// }
		// double average = total/num.length;
		// System.out.println("The average number of this array is " + average);
		
		// System.out.println("There are " + num.length + " numbers in this array");
		// System.out.print
		
		
	}
	
}
