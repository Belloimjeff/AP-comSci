import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int c = 0;
		
		while(c < passwords.length){
		    boolean s1Flag = false;
		    boolean s2Flag = false;
		    if(passwords[c].length() >= 8){
		        s1 = s1 + 1;
		        s1Flag = true;
		    }
		    if(passwords[c].contains("!") || passwords[c].contains("@") || passwords[c].contains("#") || passwords[c].contains("$") || passwords[c].contains("%") || passwords[c].contains("^") || passwords[c].contains("&") || passwords[c].contains("*")){
		        s2 = s2 + 1;
		        s2Flag = true;
		    }
		    if(passwords[c].length() >= 8 && (passwords[c].contains("!") || passwords[c].contains("@") || passwords[c].contains("#") || passwords[c].contains("$") || passwords[c].contains("%") || passwords[c].contains("^") || passwords[c].contains("&") || passwords[c].contains("*"))){
		        s3 = s3 + 1;
		        s1 = s1 - 1;
		        s2 = s2 - 1;
		    }
		    c++;
		}

		System.out.println("There are " + s1 + " of level one");
		System.out.println("There are " + s2 + " of level two");
		System.out.println("There are " + s3 + " of level three");
	}
}
