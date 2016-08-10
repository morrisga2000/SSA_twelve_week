package com.tiy.ssa.weektwo.objectDesign;

public abstract class Human {

protected String sex = null;
protected int eyeColor = 0;
protected int skinColor = 0;
protected int hairColor = 0;
protected float height = 0.0f;
public Human(String sex, int eyeColor, int skinColor, int hairColor, float height) {
	super();
	this.sex = sex;
	this.eyeColor = eyeColor;
	this.skinColor = skinColor;
	this.hairColor = hairColor;
	this.height = height;
}



public Human() {
	super();
}



public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public int getEyeColor() {
	return eyeColor;
}


public void setEyeColor(int eyeColor) {
	this.eyeColor = eyeColor;
}
public int getSkinColor() {
	return skinColor;
}
public void setSkinColor(int skinColor) {
	this.skinColor = skinColor;
}
public int getHairColor() {
	return hairColor;
}
public void setHairColor(int hairColor) {
	this.hairColor = hairColor;
}
public float getHeight() {
	return height;
}
public void setHeight(float height) {
	this.height = height;
}






}  // end of class
