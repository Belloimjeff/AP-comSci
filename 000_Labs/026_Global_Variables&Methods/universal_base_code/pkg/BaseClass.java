/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;

	public BaseClass() {
		role = new String ("No role");
		strength = 0;
		dexterity = 0;
	    intelligence = 0;
	    charisma = 0;
	}
	
	public BaseClass(String r)
	{
		role = r;
		// strength = s;
		// dexterity = d;
		// intelligence = i;
		
		// int = c;
		
	}
    
    public void myToString()
    {
    	System.out.println("------------------------------");
		System.out.println("Your role is " + role);
		System.out.println("Your strength trait is " + strength);
		System.out.println("Your dexterity trait is " + dexterity);
		System.out.println("Your intelligence trait is " + intelligence);
		System.out.println("Your charisma trait is " + charisma);
		System.out.println("------------------------------");
		System.out.println("");
    }

}

