/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
           
        int[] num = new int[20];
        
        System.out.println("----------------------------------------------------");
        System.out.println("These are the 20 numbers: ");
        int c = 0;
        for( c = 0; c < 20; c++){
        	int ran = (int)(Math.random()*10 + 1);
        	num[c] = ran;
        	System.out.print(num[c] + " ");
        }
        
        int ran2 = (int)(Math.random()*10 + 1);
        System.out.println("");
        System.out.println("----------------------------------------------------");
        System.out.println("The random number to look for is " + ran2);
        
        int total = 0;
        int total2 = 0;
        while(c > 0){
        	c--;
        	if(num[c] == ran2){
        		System.out.println("Duplicate found at index " + c);
        		total = total + 1;
        	}
        	if(c < 19){
        	if(num[c] == num[c+1]){
        		System.out.println("Two in a row found at indexes " + c + " and " + (c+1) + ". The number is " + num[c]);
        		total2 = total2 + 1;
        	}
        	}
        }
        System.out.println("Total number of duplicates for " + ran2 + " is " + total);
        
        
        
        
        
        
	}
}
