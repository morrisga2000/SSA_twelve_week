package com.tiy.ssa.people;

public class Student extends Person {
	
	private String studentID = null;
	private boolean coffeed = false;
	private boolean inClassroom = false;
	private boolean payingAttention = false;
	private boolean pokemonGo = false;
	public Student(String name, int age, String gender, float height, String studentID, boolean coffeed,
			boolean inClassroom, boolean payingAttention, boolean pokemonGo) {
		super(name, age, gender, height);
		this.studentID = studentID;
		this.coffeed = coffeed;
		this.inClassroom = inClassroom;
		this.payingAttention = payingAttention;
		this.pokemonGo = pokemonGo;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public boolean isCoffeed() {
		return coffeed;
	}
	public void setCoffeed(boolean coffeed) {
		this.coffeed = coffeed;
	}
	public boolean isInClassroom() {
		return inClassroom;
	}
	public void setInClassroom(boolean inClassroom) {
		this.inClassroom = inClassroom;
	}
	public boolean isPayingAttention() {
		return payingAttention;
	}
	public void setPayingAttention(boolean payingAttention) {
		this.payingAttention = payingAttention;
	}
	public boolean isPokemonGo() {
		return pokemonGo;
	}
	public void setPokemonGo(boolean pokemonGo) {
		this.pokemonGo = pokemonGo;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", coffeed=" + coffeed + ", inClassroom=" + inClassroom
				+ ", payingAttention=" + payingAttention + ", pokemonGo=" + pokemonGo + ", name=" + name + ", age="
				+ age + ", gender=" + gender + ", height=" + height + "]";
	}
	
	

}
