/*
 *	Author:  Jeff khongpurinart
 *  Date: Nov - 1 - 24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
	
	public static int ages(){
		int randage = (int)(Math.random()*7 + 1);
		return randage;
	}

	public static void main(String args[]) {
		// Your code goes below here
		// PooleDwarf test = new PooleDwarf();
		// test.print();
		
		PooleDwarf first = new PooleDwarf(randName(), ages());
		first.print();
		
		PooleDwarf second = new PooleDwarf(randName(), ages());
		second.print();
		
		PooleDwarf third = new PooleDwarf(randName(), ages());
		third.print();
		
		PooleDwarf fourth = new PooleDwarf(randName(), ages());
		fourth.print();
		
		PooleDwarf fifth = new PooleDwarf(randName(), ages());
		fifth.print();
		
		PooleDwarf sixth = new PooleDwarf(randName(), ages());
		sixth.print();
		
		PooleDwarf seventh = new PooleDwarf(randName(), ages());
		seventh.print();
		
		// cheacking
		// int x = 0
		
		// if (first.getName().equals(second.getName())) {
		// 	x = x+1;
		// }
		// else {
		// 	x = x + 0;
		// }
		
		// if (first.getName().equals(third.getName())) {
		// 	x = x+1;
		// }
		// else {
		// 	x = x + 0;
		// }
		
		// if (first.getName().equals(fourth.getName())) {
		// 	x = x+1;
		// }
		// else {
		// 	x = x + 0;
		// }
		
		// if (first.getName().equals(fifth.getName())) {
		// 	x = x+1;
		// }
		// else {
		// 	x = x + 0;
		// }
		
		// if (first.getName().equals(sixth.getName())) {
		// 	x = x+1;
		// }
		// else {
		// 	x = x + 0;
		// }
		
		// if (first.getName().equals(seventh.getName())) {
		// 	x = x+1;
		// }
		// else {
		// 	x = x + 0;
		// }
		
		// System.out.println(first.getName() +  " was the name with " + x + " matches!");
		
		int x = 0;
		if(first.isSameName(second.getName())) {
			x = x + 1;
			
		}
		if(first.isSameName(third.getName())) {
			x = x + 1;
			
		}
		if(first.isSameName(fourth.getName())) {
			x = x + 1;
			
		}
		if(first.isSameName(fifth.getName())) {
			x = x + 1;
			
		}
		if(first.isSameName(sixth.getName())) {
			x = x + 1;
			
		}
		if(first.isSameName(seventh.getName())) {
			x = x + 1;
			
		}
		
		 System.out.println(first.getName() +  " was the name with " + x + " matches!");
	}
}