package com.tiy.ssa.weektwo.daythree;

import java.util.Scanner;

import org.omg.PortableInterceptor.USER_EXCEPTION;

public class CarDealership {
	
	
	public static void main(String[] args)
	{
		String userInputB = null;
		Scanner sc = new Scanner(System.in);
		boolean userFailed = false;
		int carPartA = 0;
		int carPartB = 0;
		
		Car outSweetCar = new Car();
		
		
		outSweetCar.setDoors(carPartA);
		
		
	
			System.out.println("Welcome to the car dealership!");
			System.out.println("What kind of car are you looking for?");
			String userInputA = sc.nextLine();
		do {
			System.out.println("How many doors would you like?");
			 userInputB = sc.nextLine();
			
			userFailed = numberIsValid(userInputB);
			
		} while (userFailed);

		 carPartA = Integer.parseInt(userInputB);
		
		do {
			
			userFailed = false;
			System.out.println("How many windows would you like?");
		     String userIntputB = sc.nextLine();
			
			userFailed = numberIsValid(userIntputB);
			
		} while (userFailed);
		
		 carPartB = Integer.parseInt(userInputB);
		 
		 outSweetCar.setWindows(carPartB);
		
		 do {
				
				userFailed = false;
				System.out.println("How many seats would you like?");
			     String userIntputB = sc.nextLine();
				
				userFailed = numberIsValid(userIntputB);
				
			} while (userFailed);
			
			 carPartB = Integer.parseInt(userInputB);
			 
			 outSweetCar.setSeats(carPartB);
		 
			 do {
					
					userFailed = false;
					System.out.println("How many wheels would you like?");
				     String userIntputB = sc.nextLine();
					
					userFailed = numberIsValid(userIntputB);
					
				} while (userFailed);
				
				 carPartB = Integer.parseInt(userInputB);
				 
				 outSweetCar.setWheels(carPartB);
		 
				 System.out.println(outSweetCar.toString());
				 
	//	System.out.println(userInputB);
	} // closes main
	

	public static boolean numberIsValid(String someStringToMakeANumber)
	{
		try {
			int aNumber = Integer.parseInt(someStringToMakeANumber);
			return false;
		} catch (NumberFormatException e) {
			// TODO: handle exception
		}
		return true;
	}
}  // closes class
