/*
 *	Author:  Jeff Khongpurinart
 *  Date: Nov - 15 - 24
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Warrior[] warriors = new Warrior[100];
		Wizard[] wizards = new Wizard[100];
		int count = 0;
		int c = 0;
		while(c < 100){
		    warriors[c] = new Warrior("Gimli");
		    wizards[c] = new Wizard("Gandolf");
		    c++;
		}
		
		int last = 100;
		int s = 0;
		int m = 0;
		while(warriors[s].isDead() == false && (wizards[m].isDead() == false) && s<99 && m<99){
			if(m<wizards.length){
				wizards[m].attack(warriors[s]);
				
				if(warriors[s].isDead()){
					s++;
				}
			}
			if(s<warriors.length){
				warriors[s].attack(wizards[m]);
				
				if(wizards[m].isDead()){
					m++;
				}
			}
			
		}
		if(m == last){
				System.out.println("Warriors win!");
				System.out.println("Remaining warriors: " + (last-s));
			}
			else{
				System.out.println("Wizards win!");
				System.out.println("Remaining wizards: " + (last-m));
			}
		
	}
}


