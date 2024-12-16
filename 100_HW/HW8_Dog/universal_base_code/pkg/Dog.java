package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	String breed;
	int age;
	boolean sleep;
	
	public Dog() {
    	name = "Clifford";
    	age = 3;
	}
	
	public Dog(String n) {
		name = n;
		breed = "dog dog";
		age = 1;
	}
	
	public Dog(String n, String b) {
		name = n;
		breed = b;
		age = 1;
	}
	
	public Dog(String n, int a) {
		name = n;
		breed = "dog dog";
		age = a;
	}
	
	
	//methods
	public void setName(String n) {
		name = n;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public void setBreed(String b) {
		breed = b;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getBreed() {
		return breed;
	}
	
	
	public boolean isSleeping() {
		int rans = (int)(Math.random() * 2);
		if(rans == 0) {
			sleep = false;
		}
		else if(rans == 1) {
			sleep = true;
		}
		
		return sleep;
	}
	
	
	public void bark() {
		System.out.println(name + " barks woof woof");
	}
} 
