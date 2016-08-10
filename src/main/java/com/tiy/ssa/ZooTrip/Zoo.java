package com.tiy.ssa.ZooTrip;

import java.util.ArrayList;


public class Zoo {

	
	
	
	
	
	
	
	public static void main (String[] args)
	{
		
ArrayList<Animal> zooCollection = new ArrayList<Animal>();
		
		Invertebrates invertebrateA = new Invertebrates(false, false, false, true, "hermaphrodite", false, true, false, true, false);
		Arthropods ladybug = new Arthropods(false, true, false, true, "female", true, false, true, false, true, true, true, 3);
		Amphibians frog = new Amphibians(true, true, true, true, "male", true);
		Amphibians marineJapaneseSalamander = new Amphibians(true, false, true, true, "female", false);
		Fish tigerShark = new Fish(true, false, true, false, "female", true, true, false, true);
		Fish flounder = new Fish(true, false, true, true, "male", true, true, true, true);
		Reptiles coralSnake = new Reptiles(true, false, false, true, "male", true, true, true, "coral snake");
		Reptiles chameleon = new Reptiles(true, true, false, true, "female", true, true, true, "chameleon");
		Birds bluejay = new Birds(true, true, true, true, "male", false, true, false, "blue-jay", true, true, true, true, "blue-jay");
		Birds pinguin = new Birds(true, true, true, true, "female", false, true, false, "pinguin", false, true, true, true, "pinguin");
		Mammals chimpanzee = new Mammals(true, true, true, false, "male", true, true, true, true, true, true, false, true, false, "chimpanzee");
		Mammals dolphin = new Mammals(true, false, true, false, "female", true, true, true, true, true, false, true, false, false, "dolphin");
		Mammals fruitBat = new Mammals(true, true, true, false, "male", true, true, true, true, true, true, true, false, true, "fruit-bat");
		Mammals kangaroo = new Mammals(true, true, true, false, "female", true, true, false, true, true, true, true, false, false, "kangaroo");
		
		
		zooCollection.add(invertebrateA);
		zooCollection.add(ladybug);
		zooCollection.add(frog);
		zooCollection.add(marineJapaneseSalamander);
		zooCollection.add(tigerShark);
		zooCollection.add(flounder);
		zooCollection.add(coralSnake);
		zooCollection.add(chameleon);
		zooCollection.add(bluejay);
		zooCollection.add(pinguin);
		zooCollection.add(chimpanzee);
		zooCollection.add(dolphin);
		zooCollection.add(fruitBat);
		zooCollection.add(kangaroo);



		for (int i =0; i < zooCollection.size(); i++)
		{
		System.out.println("Today at the zoo I saw " + zooCollection.get(i).toString());
		}
		
		
	}

	
	
	
}
