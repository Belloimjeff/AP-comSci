/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 
		 int [] num = new int[1001];
		 
		 //int c = 0;
		 //int m = 1;
		 //while(c < num.length){
		 //	 int v = 3 * m;
		 //	num[c] = v;
		 	
		 //	System.out.println("Index: " + c + " Value: " + num[c]);
		 //	c++;
		 //	m++;
		 //}
		 
		 for(int c = 0; c < num.length; c++){
		 	num[c] = (c+1)*3;
		 		System.out.println("Index: " + c + " Value: " + num[c]);
		 }
		 
		 //System.out.println("--------------------------------");
		 
		 
		 //int [] num = new int [1001];
		 
		 //int c = 0;
		 //int v = 1000;
		 //while(c < 1001){
		 //	num[c] = v;
		 	
		 //	System.out.println(num[c]);
		 //	c++;
		 //	v--;
		 //}
	}
}
