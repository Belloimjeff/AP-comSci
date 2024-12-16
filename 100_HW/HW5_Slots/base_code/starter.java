/*
 *	Author: Jeff khongpurinart
 *  Date: Oct - 1- 24
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
	Scanner Jeff = new Scanner(System.in);
		
		//intro and rules
		System.out.println("Slot Machine Rules: ");
        System.out.println("1. Each player starts with $100.");
        System.out.println("2. Input a wager less than your total amount of money.");
        System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
        System.out.println("   a. If two numbers match, you double your money.");
        System.out.println("   b. If three numbers match, you triple your money.");
        System.out.println("   c. If none match, you lose your money.");
        System.out.println("-------------------------------------------------");
        System.out.println("                 ");
	    
	    int money = 100; 
	    while(true)
	    {
	             System.out.print("Would you like to play the slots? (Yes/yes/Y/y/No/no/N/n):");
	             String ans = Jeff.nextLine();
	             if(ans.equals("Yes") || ans.equals("yes") || ans.equals("y") || ans.equals("Y"))
	          {
	            //random numbers
	            int ran1 = (int)(Math.random() * 1);
	            int ran2 = (int)(Math.random() * 1);
	            int ran3 = (int)(Math.random() * 1);
	            
	            //asking
	            System.out.println("You have $" + money + ". How much would you like to wager?");
	            System.out.print("Enter: ");
	            int wager = Jeff.nextInt();
	            Jeff.nextLine();
	            System.out.println("             ");
	            if(wager > money || wager < 1)
	            {
	            	System.out.print("You only have $" + money + "! Please enter a lower wager: ");
	            	wager = Jeff.nextInt();
	            }
	            money = money - wager;
	            
	            //random numbers
	            System.out.println("Great! Let's play!!!");
	            System.out.println("Your rolls are: ");
	            
	            System.out.println("_________________________");
	            System.out.println("| " + ran1 + " | "  + ran2 + " | " + ran3 + "|" );
	            System.out.println("_________________________");
	            System.out.println("           ");
	            
	            //prize
	            if(ran1 == ran2 && ran1 == ran3 && ran2 == ran3)
	            {
	                System.out.println("CONGRATULATION!! YOU TRIPLED YOUR WAGER! GAMBEL FOR LIFE!");
	                money = (3*wager) + money;
	                System.out.println("You have $" + money);
	            }
	            
	            else if(ran1 == ran2 || ran1 == ran3 || ran2 == ran3)
	            {
	                System.out.println("CONGRATULATION!! YOU DOUBLED YOUR WAGER!");
	                money = (2*wager) + money;
	                System.out.println("You have $" + money);
	            }
	            
	            else if(ran1 != ran2 || ran1 != ran3 || ran2 != ran3)
	           {
	               System.out.println("You didn't win this time. BETTER LUCK NEXT TIME!");
	               System.out.println("You have $" + money);
	           }
	           
	         }
	           
	          else if(ans.equals("No") || ans.equals("no") || ans.equals("N") || ans.equals("n"))
	          {
	          	System.out.println("Sad to see you go! You still have $20 left. Come again soon! Thanks!");
	          	break;
	          }
	         
	         if(money <= 0)
	         {
	         	System.out.println("You've run out of money! Thanks for coming! Come back soon!");
	         	break;
	         }
	            
	    }
	}
}
