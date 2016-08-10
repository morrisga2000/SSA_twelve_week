package com.tiy.ssa.people;

public class GraduateStudent extends Student{

	private boolean hasGraduated = false;
	private boolean hasJob = false;
	public GraduateStudent(String name, int age, String gender, float height, String studentID, boolean coffeed,
			boolean inClassroom, boolean payingAttention, boolean pokemonGo, boolean hasGraduated, boolean hasJob) {
		super(name, age, gender, height, studentID, coffeed, inClassroom, payingAttention, pokemonGo);
		this.hasGraduated = hasGraduated;
		this.hasJob = hasJob;
	}
	
	
	}
	


