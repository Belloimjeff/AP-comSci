/*
 *	Author:  Jeff
 *  Date: Sep-11-24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
    
    int x = 13 - 6 * 11;
    int y =  30 % 7 * (-2);
    int max1 = Math.max(x,y);
    System.out.println(max1);
    
    int s = 3 * 8 + 31 % 7;
    double sqrt = Math.sqrt(s);
    System.out.println(sqrt);
    
    double p1 = 37 / 3;
    double p2 = 35 % 21;
    double pp = Math.pow(p1,p2);
    System.out.println(pp);
    
    int p =  2;
    double p3 = 14%3;
    double ppr = Math.pow(p,p3);
    double sq = 2*6;
    
    double max = Math.max(ppr,sq);
    System.out.println(max);
	}
}
