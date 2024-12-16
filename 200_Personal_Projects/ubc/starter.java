/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;
import pkg.Grocery;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner Jeff = new Scanner(System.in);
		
		//intro
		System.out.println("Hi! Welcome to grocery simulator! 🛒 🍎 🍅 🍄");
		Grocery w = new Grocery();
		w.bruhh();
		System.out.println("----------------------------------------------------------");
		System.out.println("First, you have to add your groceries into the grocery list! \nTo do that, type 'add'.");
		System.out.println("You only have 10 spaces available on the list, use it wisely!!");
		System.out.println("Let's try that!");
		String todo = Jeff.nextLine();
		
		//chances
		int chance1 = (int)(Math.random()*100 + 1);
		int chance2 = (int)(Math.random()*100 + 1);
		int chance3 = (int)(Math.random()*100 + 1);
		int chance4 = (int)(Math.random()*100 + 1);
		int chance5 = (int)(Math.random()*100 + 1);
		int car = (int)(Math.random()*100 + 1);
		int bus = (int)(Math.random()*100 + 1);
		int bike = (int)(Math.random()*100 + 1);
		int walk = (int)(Math.random()*100 + 1);
		int prices = (int)(Math.random()*400 + 1);
		int jail = (int)(Math.random()*4 + 1);
		int argue = (int)(Math.random() *1 +1);
		
		//variables
		int c = 0;
		int amount = 11;
		String[] stuff = new String[amount];
		
		//main game
		while(true){
		if(todo.equals("add") || todo.equals("ADD") || todo.equals("Add") || todo.equals("aDd") || todo.equals("adD")){
			System.out.println("Please enter what you want to add into your list: ");
			String add1 = Jeff.nextLine();
			stuff[c] = add1;
			System.out.println("You have " + stuff[c] + " on your list");
			c++;
			System.out.println("Do you want to add anything else to the list? ✅  or  ❌");
			String choose = Jeff.nextLine();
			
			if(c == amount - 2){
				System.out.println("Bruh you can't even do a simple task to keep the limit. You lost.");
				break;
			}
			
			
			if(choose.equals("NO") || choose.equals("no") || choose.equals("No") || choose.equals("nO")){
				System.out.println("ALRIGHT! Let's head to grocery then! 🚗💨");
				System.out.println("How would you like to go to the grocery? Car🚗, bus🚌, bike🚴, or walk🚶.");
				String travel = Jeff.nextLine();
				System.out.println("---------------------------------");
				
				if(travel.equals("car") || travel.equals("CAR") || travel.equals("Car") || travel.equals("cAr") || travel.equals("caR")){
					System.out.println("That's a good choice!! So you can buy more stuffs and put them in your car!");
					System.out.println("You are on the way to the grocery store.⛰️️️🛣️️⛰️️");
					if(car == chance1){
						System.out.println("There is a big accident, a huge track came straight to you and crash into your car.🚗 💥 🚚 ");
						System.out.println("You didn't get injure that bad, but... sadly you can't go to the gracery anymore. Well I hope you will get better soon.. I see you later!");
						break;
					}
					System.out.println("You arrived at the store!!");
					System.out.println("You go and get the groceries you need \nYou go straight to the checkout. The total is.... $" + prices);
					if(prices > 200){
						System.out.println("YOU CONFUSED! \nWHY IS YOUR BILL SO HIGH!?");
						System.out.println("You start yelling and saying 'I NEED TO TAlK TO THE MANAGER'");
						System.out.println("The manager came out and tyring to calm you down. He is trying to explain that the inflation is high right now.");
						System.out.println("What would you do? 1. keep arguing to get a lower price(25% chance of succed) 0r 2. You just pay for it. ");
						int smt = Jeff.nextInt();
						
						if(smt == 1){
							if(argue == jail){
								System.out.println("The manager start agreeing with you and think it is resonable to give you a discount! Good job! Your fisrt day of playing grocery simulator suceeded!");
								System.out.println("CONGRATS!!!");
								break;
							}
							else{
								System.out.println("The manager and people around you got scared becasue you're yelling too loud. They call the police and you got arrested.");
								System.out.println("WOMP WOMP!! You don't even know how to shopping");
								break;
							}
						}
						else if(smt ==2){
							System.out.println("Well that's pretty sad, you had to pay overpriced groceries");
							break;
						}
					}
					
					    System.out.println("1. Are you going to pay for it or 2. you're going to run and might get free groceries?");
					    int pay = Jeff.nextInt();
					    
					    if(pay == 1){
					    	System.out.println("Congrats!! You has succeeded your first grocery simulator");
					    	break;
					    }
					    else{
					    	System.out.println("YOU'VE DECIDED TO RUN!!??");
					    	if(argue == jail){
								System.out.println("YOU HAVE OUTRUNED THE POLICE!! GOOD JOB YOU SUCCEEDED YOUR FIRST GROCERY SIMULATOR!");
								System.out.println("CONGRATS!!!");
								break;
							}
							else{
								System.out.println("The police caught you.. you got arrested.");
								System.out.println("WOMP WOMP!! You don't even know how to shopping");
								break;
							}
					    }
					
				}
				if(travel.equals("bus") || travel.equals("BUS") || travel.equals("Bus") || travel.equals("bUs") || travel.equals("buS")){
					System.out.println("It was a decent choice but it's alright!");
					System.out.println("You're on the way to the grocery store!! YOU'RE ON THE BUS!");
					if(bus == chance1 || bus == chance2 || bus == chance3 || bus == chance4 || bus == chance5){
						System.out.println("OH NO! There are people in the bus who is trying to steal your money!\nYOu couldn't fight them so you lost all your money T_T");
						System.out.println("Welp.. your journey ended here.. I hope I'll see you the other time!");
					}
					
					System.out.println("You arrived at the store!!");
					System.out.println("You go and get the groceries you need \nYou go straight to the checkout. The total is.... $" + prices);
					if(prices > 200){
						System.out.println("YOU CONFUSED! \nWHY IS YOUR BILL SO HIGH!?");
						System.out.println("You start yelling and saying 'I NEED TO TAlK TO THE MANAGER'");
						System.out.println("The manager came out and tyring to calm you down. He is trying to explain that the inflation is high right now.");
						System.out.println("What would you do? 1. keep arguing to get a lower price(25% chance of succed) 0r 2. You just pay for it. ");
						int smt = Jeff.nextInt();
						
						if(smt == 1){
							if(argue == jail){
								System.out.println("The manager start agreeing with you and think it is resonable to give you a discount! Good job! Your fisrt day of playing grocery simulator suceeded!");
								System.out.println("CONGRATS!!!");
								break;
							}
							else{
								System.out.println("The manager and people around you got scared becasue you're yelling too loud. They call the police and you got arrested.");
								System.out.println("WOMP WOMP!! You don't even know how to shopping");
								break;
							}
						}
						else if(smt ==2){
							System.out.println("Well that's pretty sad, you had to pay overpriced groceries");
							break;
						}
					}
					
					    System.out.println("1. Are you going to pay for it or 2. you're going to run and might get free groceries?");
					    int pay = Jeff.nextInt();
					    
					    if(pay == 1){
					    	System.out.println("Congrats!! You has succeeded your first grocery simulator");
					    	break;
					    }
					    else{
					    	System.out.println("YOU'VE DECIDED TO RUN!!??");
					    	if(argue == jail){
								System.out.println("YOU HAVE OUTRUNED THE POLICE!! GOOD JOB YOU SUCCEEDED YOUR FIRST GROCERY SIMULATOR!");
								System.out.println("CONGRATS!!!");
								break;
							}
							else{
								System.out.println("The police caught you.. you got arrested.");
								System.out.println("WOMP WOMP!! You don't even know how to shopping");
								break;
							}
					    }
				}
				if(travel.equals("bike") || travel.equals("BIKE") || travel.equals("Bike") || travel.equals("BIke") || travel.equals("biKE")){
					System.out.println("Hmmm.. I see you want to exercise here!! I would chosse to bike too!");
					System.out.println("You start biking to the grocery. You are in the middle of the road right now!");
					
					if(bike == chance1 || bike == chance2 || bike == chance3){
						System.out.println("Oh nooo.. I'm so sorry, there was a car hit you.");
						System.out.println("You are not injuerd that badly, you are fine but you cannot to shopping anymore..");
						System.out.println("I hope you will come and play this game again!");
					}
					System.out.println("You arrived at the store!!");
					System.out.println("You go and get the groceries you need \nYou go straight to the checkout. The total is.... $" + prices);
					if(prices > 200){
						System.out.println("YOU CONFUSED! \nWHY IS YOUR BILL SO HIGH!?");
						System.out.println("You start yelling and saying 'I NEED TO TAlK TO THE MANAGER'");
						System.out.println("The manager came out and tyring to calm you down. He is trying to explain that the inflation is high right now.");
						System.out.println("What would you do? 1. keep arguing to get a lower price(25% chance of succeed) 0r 2. You just pay for it. ");
						int smt = Jeff.nextInt();
						
						if(smt == 1){
							if(argue == jail){
								System.out.println("The manager start agreeing with you and think it is resonable to give you a discount! Good job! Your fisrt day of playing grocery simulator suceeded!");
								System.out.println("CONGRATS!!!");
								break;
							}
							else{
								System.out.println("The manager and people around you got scared becasue you're yelling too loud. They call the police and you got arrested.");
								System.out.println("WOMP WOMP!! You don't even know how to shopping");
								break;
							}
						}
						else if(smt ==2){
							System.out.println("Well that's pretty sad, you had to pay overpriced groceries");
							break;
						}
					}
					
					    System.out.println("1. Are you going to pay for it or 2. you're going to run and might get free groceries?");
					    int pay = Jeff.nextInt();
					    
					    if(pay == 1){
					    	System.out.println("Congrats!! You has succeeded your first grocery simulator");
					    	break;
					    }
					    else{
					    	System.out.println("YOU'VE DECIDED TO RUN!!??");
					    	if(argue == jail){
								System.out.println("YOU HAVE OUTRUNED THE POLICE!! GOOD JOB YOU SUCCEEDED YOUR FIRST GROCERY SIMULATOR!");
								System.out.println("CONGRATS!!!");
								break;
							}
							else{
								System.out.println("The police caught you.. you got arrested.");
								System.out.println("WOMP WOMP!! You don't even know how to shopping");
								break;
							}
					    }
				}
				if(travel.equals("walk") || travel.equals("WALK") || travel.equals("Walk") || travel.equals("WAlk") || travel.equals("waLK")){
					System.out.println("Wow.. no way you chose to walk.. it's going to be a long way..");
					System.out.println("Well goodluck! now you are on your way to the grocery store!");
					
					if(walk == chance1 || walk == chance2 || walk == chance3 || walk == chance4 || walk == chance5){
						System.out.println("I'm sorry.. you got hit by a car..");
						System.out.println("But its alright! you didn't hurt that bad.. But.. you can't play with us no more.. I guess I will see you later.");
					}
					
					System.out.println("You arrived at the store!!");
					System.out.println("You go and get the groceries you need \nYou go straight to the checkout. The total is.... $" + prices);
					if(prices > 200){
						System.out.println("YOU CONFUSED! \nWHY IS YOUR BILL SO HIGH!?");
						System.out.println("You start yelling and saying 'I NEED TO TAlK TO THE MANAGER'");
						System.out.println("The manager came out and tyring to calm you down. He is trying to explain that the inflation is high right now.");
						System.out.println("What would you do? 1. keep arguing to get a lower price(25% chance of succed) 0r 2. You just pay for it. ");
						int smt = Jeff.nextInt();
						
						if(smt == 1){
							if(argue == jail){
								System.out.println("The manager start agreeing with you and think it is resonable to give you a discount! Good job! Your fisrt day of playing grocery simulator suceeded!");
								System.out.println("CONGRATS!!!");
								break;
							}
							else{
								System.out.println("The manager and people around you got scared becasue you're yelling too loud. They call the police and you got arrested.");
								System.out.println("WOMP WOMP!! You don't even know how to shopping");
								break;
							}
						}
						else if(smt ==2){
							System.out.println("Well that's pretty sad, you had to pay overpriced groceries");
							break;
						}
					}
					
					    System.out.println("1. Are you going to pay for it or 2. you're going to run and might get free groceries?");
					    int pay = Jeff.nextInt();
					    
					    if(pay == 1){
					    	System.out.println("Congrats!! You has succeeded your first grocery simulator");
					    	break;
					    }
					    else{
					    	System.out.println("YOU'VE DECIDED TO RUN!!??");
					    	if(argue == jail){
								System.out.println("YOU HAVE OUTRUNED THE POLICE!! GOOD JOB YOU SUCCEEDED YOUR FIRST GROCERY SIMULATOR!");
								System.out.println("CONGRATS!!!");
								break;
							}
							else{
								System.out.println("The police caught you.. you got arrested.");
								System.out.println("WOMP WOMP!! You don't even know how to shopping");
								break;
							}
					    }
					
				}
				
				else{
					System.out.println("welll.. I don't think you can fly there, you can either go by car, bus, bike or walk. Plese enter again: ");
					travel = Jeff.nextLine();
				}
			}
			
		}
		
		else{
			System.out.println("Please type in 'add'.");
			todo = Jeff.nextLine();
		}
			
		
		}
	}
}
