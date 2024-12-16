/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner Jeff = new Scanner(System.in);
		
		System.out.println("Please enter a sentence: ");
		String sentence = Jeff.nextLine();
		String finalstring = "";
		while(true){
			if(sentence.indexOf(" ") == -1){
			    finalstring = finalstring + " " + PigLatin(sentence);
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0,space);
			finalstring = finalstring + " " + PigLatin(word);
			
			sentence = sentence.substring(space + 1);
		}
		System.out.println(finalstring);
		
	}
	
	public static String PigLatin(String sentence){
		
		String firstLetter = sentence.substring(0,1);
		String pig = "";
			if(firstLetter == "a" || firstLetter == "e" || firstLetter == "i" || firstLetter == "o" || firstLetter == "u"){
				pig = sentence + "-way";
				
			}
			else{
				pig = pig + sentence.substring(1) + firstLetter + ("-way");
			}
			
		
		return pig;
	}
}
