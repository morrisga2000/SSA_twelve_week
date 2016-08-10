package com.tiy.ssa.weektwo.objectDesign;

import java.util.Scanner;

import org.omg.PortableInterceptor.USER_EXCEPTION;

public class Nursery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean userFailed = false;
		String userInputA = null;
		int userInputB = 0;
		int userInputC = 0;
		int userInputD = 0;
		int userInputE = 0;

		float userInputHt = 0.0f;
		String userInput = null;

		CustomizedPerfectBaby titanBaby = new CustomizedPerfectBaby();

		System.out.println("Welcome to the Doll House Nursery, your one-stop shop for the ideal baby!");
		System.out.println("Which sex would you like for your child?");
		userInputA = sc.nextLine();
		titanBaby.setSex(userInputA);
		do {
			System.out.println(
					"Which eye color do you desire for your baby? Enter 1 for hazel, 2 for brown, 3 for green, 4 for light blue, 5 for dark blue");
			userInputB = sc.nextInt();

		} while (userInputB < 1 || userInputB > 5);
		titanBaby.setEyeColor(userInputB);

		do {
			System.out.println(
					"Which skin tone do you desire for your baby? On an integer scale of 1 to 5, Enter 1 for lightest, up to 5 for darkest");
			userInputC = sc.nextInt();

		} while (userInputC < 1 || userInputC > 5);
		titanBaby.setSkinColor(userInputC);

		do {
			System.out.println(
					"Which hair color do you desire for your baby? Enter 1 for dark brown, 2 for castano brown, 3 for light brown, 4 for blonde, 5 for platinum blonde, 6 for black, 7 for auburn, 8 for red-headed, 9 for silver");
			userInputD = sc.nextInt();

		} while (userInputD < 1 || userInputD > 9);
		titanBaby.setHairColor(userInputD);

		System.out.println("Which adult height, in inches, do you desire?");
		userInputHt = sc.nextFloat();
		titanBaby.setHeight(userInputHt);
		
		
		do {
			System.out.println("Would you like your child to be disease-free? Enter 1 for yes / 2 for no");
			userInputE = sc.nextInt();

		} while (userInputE < 1 || userInputE > 2);

		if (userInputE == 1) 
			titanBaby.setDiseaseFree(true);
			else
			titanBaby.setDiseaseFree(false);
		


		do {
			System.out.println("Would you like your child to have herculean strength? Enter 1 for yes / 2 for no");
			userInputE = sc.nextInt();

		} while (userInputE < 1 || userInputE > 2);

		if (userInputE == 1) 
			titanBaby.setHerculeanStrength(true);
			else
			titanBaby.setHerculeanStrength(false);
		

		do {
			System.out.println("Would you like your child to be a champion sprinter? Enter 1 for yes / 2 for no");
			userInputE = sc.nextInt();

		} while (userInputE < 1 || userInputE > 2);

		if (userInputE == 1) 
			titanBaby.setCheetahSpeedSprinter(true);
		else
			titanBaby.setCheetahSpeedSprinter(false);


		do {
			System.out.println("Would you like your child to be capable of limb regeneration? Enter 1 for yes / 2 for no");
			userInputE = sc.nextInt();

		} while (userInputE < 1 || userInputE > 2);

		if (userInputE == 1) 
			titanBaby.setRegeneratingLimbs(true);
		else
			titanBaby.setRegeneratingLimbs(false);


		do {
			System.out.println("Would you like your child to possess a universal blood type? Enter 1 for yes / 2 for no");
			userInputE = sc.nextInt();

		} while (userInputE < 1 || userInputE > 2);

		if (userInputE == 1) 
			titanBaby.setUniversalBloodType(true);
		else
			titanBaby.setUniversalBloodType(false);

		do {
			System.out.println("Would you like your child to have enhanced intelligence? Enter 1 for yes / 2 for no");
			userInputE = sc.nextInt();

		} while (userInputE < 1 || userInputE > 2);

		if (userInputE == 1) 
			titanBaby.setEnhancedIntelligence(true);
		else
			titanBaby.setEnhancedIntelligence(false);
	
		
		do {
			System.out.println("Pefectly ideal facial symmetry? Enter 1 for yes / 2 for no");
			userInputE = sc.nextInt();

		} while (userInputE < 1 || userInputE > 2);

		if (userInputE == 1) 
			titanBaby.setFacialSymmetry(true);
		else
			titanBaby.setFacialSymmetry(false);
		

		do {
			System.out.println("Would you like your child to have golden stardard body proportion? Enter 1 for yes / 2 for no");
			userInputE = sc.nextInt();

		} while (userInputE < 1 || userInputE > 2);

		if (userInputE == 1) 
			titanBaby.setPerfectProportions(true);
		else
			titanBaby.setPerfectProportions(false);

		do {
			System.out.println("Would you like your child to have dauntless behavior? Enter 1 for yes / 2 for no ?");
			userInputE = sc.nextInt();

		} while (userInputE < 1 || userInputE > 2);

		if (userInputE == 1) 
			titanBaby.setDauntlessBehavior(true);
		else
			titanBaby.setDauntlessBehavior(false);

		System.out.println(titanBaby.toString());
		
	} // closes end of main

}
