/*
 *	Author: 
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner Jeff = new Scanner(System.in);
		
		System.out.println("What is your dog's name?");
		System.out.print("Enter: ");
		String name = Jeff.nextLine();
		
		System.out.println("How old is " + name + "?");
		System.out.print("Enter: ");
		int age = Jeff.nextInt();
		Jeff.nextLine();
		
		Dog random = new Dog(name, age);
		
		
		Dog robo = new Dog("Robo", "Chihuahua");
		
		if(random.isSleeping()) {
			System.out.println(name + " is sleeping");
			
			if(robo.isSleeping()) {
			    System.out.println(robo.getName() + " is sleeping");
	      	}
	      	
		    else {
			   System.out.println(robo.getName() + " is awake");
		     }
		}
		
		else {
			System.out.println(name + " is awake");
			random.bark();
			
			if(robo.isSleeping()) {
			    System.out.println(robo.getName() + " hears " + random.getName());
			    robo.bark();
	      	}
	      	
		    else {
			   System.out.println(robo.getName() + " is awake");
			   robo.bark();
		     }
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// if(robo.isSleeping()) {
		// 	System.out.println(robo.getName() + " is sleeping");
		// }
		// else {
		// 	System.out.println(robo.getName() + " is awake");
		// 	robo.bark();
		// }

      
        

	}
}
