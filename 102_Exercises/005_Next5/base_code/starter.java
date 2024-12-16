/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
    Scanner jeff = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int num = jeff.nextInt();

    System.out.println("Here are the next 5 numbers of " + num + ":");
    System.out.println(num + 1);
    System.out.println(num + 2);
    System.out.println(num + 3);
    System.out.println(num + 4);
    System.out.println(num + 5);
    
    System.out.println("Here are the next 5 multiples of " + num + ":");
    System.out.println(num * 1);
    System.out.println(num * 2);
    System.out.println(num * 3);
    System.out.println(num * 4);
    System.out.println(num * 5);
    
    System.out.println("Here is " + num + " divided by 100: ");
    System.out.println(num / 100.00);
    
    System.out.println("Here is " + num + " divided by 10: ");
    System.out.println(num / 10.00);
    
    
    
	}
}
