package com.tiy.ssa.people;

import java.util.ArrayList;

public class Building {
	
	
	public static void main (String[] args)
	{
		ArrayList<Person> ourBuilding = new ArrayList<Person>(3);
		
		Student studentA = new Student("Brendan", 29, "male", 6.4f, "123456", true, true, true, false);
		Student studentB = new Student("Mary", 35, "female", 5.5f, "556677", true, true, true, false);
		Janitor janitorA = new Janitor("Kavita", 30, "female", 5.0f, true, "truck driver");
		
		
		
		ourBuilding.add(studentA);
		ourBuilding.add(studentB);
		ourBuilding.add(janitorA);
		
		System.out.println(ourBuilding.get(0));
		System.out.println(ourBuilding.get(0).name);
	}

}
