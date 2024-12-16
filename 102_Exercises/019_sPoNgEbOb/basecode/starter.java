/*
	Author:
	Date:
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
			    finalstring = finalstring + " " + spongeCase(sentence);
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0,space);
			finalstring = finalstring + " " + spongeCase(word);
			
			sentence = sentence.substring(space + 1);
		}
		System.out.println(finalstring);

	}
	
	public static String spongeCase(String sentence){
		String result = "";
		for(int i = 0; i < sentence.length(); i++){
			String letter = sentence.substring(i, i+1);
			
			if(i%2 == 0){
				letter = letter.toLowerCase();
			}
			else{
				letter = letter.toUpperCase();
			}
			result = result + letter;
		}
		return result;
	}
}
