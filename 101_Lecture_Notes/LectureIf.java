/* 
    Lecture note example - If Statements
*/

import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        
        // boolean x = true;
        // boolean y = false;
        
        // boolean z = 5 > 3; // value z stores 5
        // boolean a = 3 < 4; // less than
        // boolean b = 4 == 4; //equal to 
        // boolean c = 4 != 5; // Not equal to
        // boolean d = 3 <= 3; // Less than or equak to
        // boolean e = 5 >= 8; // MOre tahn or equal to
        
        // Variable:
        // int
        // String
        // double 
        // scanner 
        // boolean
        
        // Primitive Data
        // THese are foundational balocks of data (lower case data)
        // int, double, 
        
        // Above we compare just integers.
        // boolean f = 5.5 != 6.5
        // boolean g = true == false;
        
        // we cant compare string.
        
        // for string, new Method:
        
        // .equals()

        // boolean h = ("hello").equals("Hello");	

        
        // IF STATEMENT;
        
        // if(some question)
        // {
            
        // }
        
        // if(5 > 3)
        //     {
        //         System.out.println("This runs!");
        //     }
        
        // if(a)
        // {
        //     System.out.println("This runs too!");
        // }
        
        // if(b)
        // {
        //     System.out.println("Bruh this runs too");
        // }
        
        // if(c)
        // {
        //     System.out.println("Bruh this runs too");
        // }
        
        // if(d)
        // {
        //     System.out.println("Bruh this runs too");
        // }
        
        // if(e)
        // {
        //     System.out.println("Bruh this runs too");
        // }
        
        
        
        
        
        
        
        
        // if(x > 5)
        // {
        //     Whenn x is bigger than 5
        // }
        // else if()
        // {
        //     when x is smaller than 5
        // }
        
        // else()
        // {
        //     when x is equal to 5
        // }
        
        Scanner Jeff = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = Jeff.nextInt();
        
        boolean x = num > 10;
        
        if(num > 10)
        {
            System.out.println(num + " is larger than 10");
        }
        else if(num < 10)
        {
            System.out.println(num + " is smaller than 10");
        }
        
        else
        {
            System.out.println(num + " is equal to 10");
        }
        
        
    }
}