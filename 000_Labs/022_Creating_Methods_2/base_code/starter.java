/*
 *	Author:  Jeff khongpurinart
 *  Date: Oct-1
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
    Scanner Jeff = new Scanner(System.in);
    
    System.out.println("What is your base number?");
    System.out.print("Enter: ");
    int base = Jeff.nextInt();
    
    System.out.println("What is your exponent number?");
    System.out.print("Enter: ");
    int exponent = Jeff.nextInt();
    
    int num = pow(base,exponent);
    System.out.println("Your answer is: " + num);
    
	}
	
	
	public static int pow(int base, int exponent)
	{
	  int count = 0;
	  int num = 1;
	  {
		while(count < exponent)
		{
		    num = num * base;
		    
		    count = count + 1;
		}
	  }
        return num;
   	}
}
