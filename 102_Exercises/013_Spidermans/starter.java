/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
    
    Spiderman Jeff = new Spiderman("Jeff", 15, "Diego");
    Jeff.fight();
    
	Spiderman Tobey = new Spiderman("Tobey Maguire", 48, "Green Goblin");
	Tobey.fight();
	
	Spiderman Andrew = new Spiderman("Andrew Garfield", 40, "Electro");
	Andrew.fight();
	
	Spiderman Tom = new Spiderman("Tom Holland", 27, "The Vulture");
	Tom.fight();
	Tom.printArt();
	}
}
