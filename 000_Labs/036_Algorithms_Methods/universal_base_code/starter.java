/*
 *	Author:  Jeff Khongpurinart
 *  Date: Nov - 15 - 24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		int[] nums = new int[100];
		for(int c = 0; c < nums.length; c++){
			int ran = (int)(Math.random() * 100 + 1);
			nums[c] = ran;
		}
		toStringArray(nums);
		System.out.println("The arverage value is: " + getArrayAverage(nums));
		System.out.println("The minimun value is: " + getArrayMin(nums));
        System.out.println("The maxumum value is: " + getArrayMax(nums));
		
	}
	
	
	
	
	
	
	public static void toStringArray(int[] x){
		System.out.print("The values are: ");
		for(int c = 0; c < x.length; c++){
			System.out.print(x[c] + " ");
		}
		System.out.println(" ");
	}
	public static int getArrayAverage(int[] arv){
		int arverage = 0; 
		for(int d = 0; d < arv.length; d++){
			//System.out.print(arv[d]);
			arverage = arverage + arv[d];
		}
		arverage = arverage/arv.length;
		return arverage;
	}
	public static int getArrayMin(int[] least){
		int min = Integer.MAX_VALUE;
		for(int m = 0; m < least.length; m++){
			if(least[m] < min){
				min = least[m];
			}
		}
		return min;
	}
	public static int getArrayMax(int[] most){
		int max = Integer.MIN_VALUE;
		for(int m = 0; m < most.length; m++){
			if(most[m] > max){
				max = most[m];
			}
		}
		return max;
	}
	
	
	
	
	
	
}
