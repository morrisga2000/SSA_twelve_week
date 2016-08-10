package com.tiy.ssa.weektwo.daytwo;

public class Vehicle 
{
	protected boolean running = false;
	protected boolean fueledUp = false;
	protected String color = null;
	protected String condition = null;
	protected int numberOfSeats = 0;
	protected int wheels = 0;
	
/*	protected void turnOn()
	{
		
	} */

	public Vehicle(boolean running, boolean fueledUp, String color, String condition, int numberOfSeats, int wheels)
{
		this.running = running;
		this.fueledUp = fueledUp;
		this.color = color;
		this.condition = condition;
		this.numberOfSeats = numberOfSeats;
		this.wheels = wheels;
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	public boolean isFueledUp() {
		return fueledUp;
	}

	public void setFueledUp(boolean fueledUp) {
		this.fueledUp = fueledUp;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

}
