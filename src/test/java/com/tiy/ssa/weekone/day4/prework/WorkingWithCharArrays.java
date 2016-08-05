package com.tiy.ssa.weekone.day4.prework;
import java.util.Scanner;

public class WorkingWithCharArrays
{
	public static void main(String[] args)
	{
		/*
		 StringBuilder stuffNThings = new StringBuilder("Hi Jason");
		char[] sayHiClass = {'H', 'i', ' ', 'c', 'l', 'a', 's', 's'};
		
		 String sayingHiClass = new String(sayHiClass);
		 System.out.println(sayingHiClass);
		 
		String stuff = "Hi all";
		System.out.println(stuff);
		
		System.out.println(stuff.toLowerCase());
		System.out.println(stuffNThings.deleteCharAt(0));

		Scanner given = new Scanner(System.in);
		
		System.out.println("How is your day?");
		String theDayIs = given.nextLine();
		
		
		for (int day=1; day < 8; day++)
		{
		switch (key) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			
			break;
		default:
			break;
		}
		
		
		}  // end of for loop
			*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String userInput = sc.nextLine();
		
		System.out.println(userInput);
		StringBuilder modUserInput = new StringBuilder(userInput);
		char firstLetter = modUserInput.charAt(0);
		System.out.println(firstLetter);

		modUserInput.insert(0, 'x');
		System.out.println(modUserInput);
		
		char[] hi = {'h', 'i', ' '};
		modUserInput.insert(0, hi);
		System.out.println(modUserInput);


	}   // end of void main
	
		
	

}
