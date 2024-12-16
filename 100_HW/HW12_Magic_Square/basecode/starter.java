import pkg.*;
import java.util.Scanner;//I got scared cause my scanner didnt work, until i check my notebook and found out i forgot thisT_T

class starter {
	public static void main(String args[]) {
		
		Scanner Jeff = new Scanner(System.in);
		
		System.out.println("Please enter how many magic squares you want to see: ");
		int ans = Jeff.nextInt();
		
		CVMath.specialSquare(ans);
		// System.out.println(CVMath.findMid(2,3,1));
		
	}
}
