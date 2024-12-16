/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee Dwight= new Employee(1987, "Dwight", "Schrute", 4416.66);
		Dwight.employeeToString();
		
		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Jim.employeeToString();
		
		Employee Pam = new Employee(2011, "Pam", "Beesly", 2250);
		Pam.employeeToString();
		
		Employee Platt = new Employee(9075, "David", "Platt", 9430);
		Platt.employeeToString();
		
		Dwight.raiseSalary(10);
		Jim.raiseSalary(10);
		Pam.raiseSalary(10);
		Platt.raiseSalary(50);
		
		Dwight.getAnnualSalary();
		System.out.println(Dwight.getFirstName() + " annual salary is " + Dwight.getAnnualSalary());
		
		Jim.getAnnualSalary();
		System.out.println(Jim.getFirstName() + " annual salary is " + Jim.getAnnualSalary());
		
		Pam.getAnnualSalary();
		System.out.println(Pam.getFirstName() + " annual salary is " + Pam.getAnnualSalary());
		
		Platt.getAnnualSalary();
		System.out.println(Platt.getFirstName() + " annual salary is " + Platt.getAnnualSalary());
	}
}
