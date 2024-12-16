/*
 *	Author:  Jeff khongpurinart
 *  Date: Oct-18-24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	
	int strength;
	int dexterity;
	int intelligence;
	int constitution;
	int charisma;
	String role;
	

	public myCharacter() {
		
		role = "No role";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
        constitution = 0;
		charisma = 0;
		
	}
	
	public myCharacter(String name){
		role = name;
		strength = 0;
		dexterity = 0;
		intelligence = 0;
        constitution = 0;
		charisma = 0;
		
	}
	
	
	
	public void first()
	{
		System.out.println("Your role is " + role);
		System.out.println("Your strength trait is " + strength);
        System.out.println("Your dexterity trait is " + dexterity);
        System.out.println("Your intelligence trait is " + intelligence);
        System.out.println("Your constitution trait is " + constitution);
        System.out.println("Your charisma trait is " + charisma);
        System.out.println("------------------------------------------------------");
		
	}
	public void something()
	{
		if(role.equals("Wizard") || role.equals("wizard"))
		{
			System.out.println("You chose to be a " + role);
			System.out.println("Your role is Wizard");
            System.out.println("Your strength trait is " + strength);
            System.out.println("Your dexterity trait is " + dexterity);
            System.out.println("Your intelligence trait is " + intelligence);
            System.out.println("Your constitution trait is " + constitution);
            System.out.println("Your charisma trait is " + charisma);
		}
		else if (role.equals("Warrior") || role.equals("warrior"))
		{
			System.out.println("You chose to be a warrior");
			System.out.println("Your role is warrior");
            System.out.println("Your strength trait is " + strength);
            System.out.println("Your dexterity trait is " + dexterity);
            System.out.println("Your intelligence trait is " + intelligence);
            System.out.println("Your constitution trait is " + constitution);
            System.out.println("Your charisma trait is " + charisma);
		}
		else if (role.equals("Rogue") || role.equals("Rogue"))
		{
			System.out.println("You chose to be a rogue");
			System.out.println("Your role is rouge");
            System.out.println("Your strength trait is " + strength);
            System.out.println("Your dexterity trait is " + dexterity);
            System.out.println("Your intelligence trait is " + intelligence);
            System.out.println("Your constitution trait is " + constitution);
            System.out.println("Your charisma trait is " + charisma);
		}
		else
		{
			System.out.println();
			System.out.println("You've decided not to chose a role. Rerun program.");
			System.out.println("Your role is no role");
		    System.out.println("Your strength trait is " + strength);
            System.out.println("Your dexterity trait is " + dexterity);
            System.out.println("Your intelligence trait is " + intelligence);
            System.out.println("Your constitution trait is " + constitution);
            System.out.println("Your charisma trait is " + charisma);
            System.out.println("------------------------------------------------------");
		}
	}

}

