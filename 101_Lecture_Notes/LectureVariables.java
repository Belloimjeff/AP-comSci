/* 
    Lecture note example - Variables (String, int, double)
*/

class LectureVariables{
    public static void main(String args[]) {
        // Your Code Goes here!
        String name = new String ("Jeff");
        int num = 25;
        double money = 34.432;
        double non = num + money;
       
        System.out.println(name + " lives in Tennessee");
        System.out.println(name + " has " + num + " lions");
        System.out.println(name + " has $" + money + " to feed his " + num + " lions");
	}
}