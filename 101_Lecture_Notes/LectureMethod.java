/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        //Your Code Goes here!
        
        greeting("Shayan");
        
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        
        double pay = raiseSalary(1000.42, 14);
        System.out.println(pay);
	}
	
	
	
	
	
	
	
	
	
	public static void greeting(String name)
	{
	    System.out.println("Howdy " + name);
	}
	
	public static double raiseSalary(double salary, int percent)
	{
	    double raiseSalary = salary + (salary * (percent/100.0));
	    return raiseSalary;
	}
	
	public static void printAnimal()
	{
	    System.out.println("          __,__");
        System.out.println(" .--.  .-\"     \"-.  .--.");
        System.out.println("/ .. \\/  .-. .-.  \\/ .. \\");
        System.out.println("| |  '|  /   Y   \\  |'  | |");
        System.out.println("| \\   \\  \\ 0 | 0 /  /   / |");
        System.out.println("\\ '- ,\\.-\"`` ``\"-./, -' /");
        System.out.println("`'-' /_   ^ ^   _\\ '-'`");
        System.out.println("|  \\._   _./  |");
        System.out.println("\\   \\ `~` /   /");
        System.out.println("'._ '-=-' _.'");
        System.out.println("   '~---~'");
        System.out.println("");
	}
}