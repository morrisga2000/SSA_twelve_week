package com.tiy.ssa.weekone.assignmenttwo;

public class assignmenttwo 
{

	
	float capacity;  // in kWh, the max capacity of the phone battery
	float chargeAmount;      // is positive, whether draining or adding to battery
	float leftOver;        // in kWh, amount left-over after use or charge
	
	public assignmenttwo(float capacity)
	{
		this.capacity = capacity;
	
		this.leftOver = capacity;

	}
	
	public float reduction(float leftOver, float changeAmount)
	{
		if (changeAmount >= leftOver)
			leftOver = (float) 0.0;
		else leftOver = (leftOver - changeAmount);
		return leftOver;
	}
	public float addingCharge (float leftOver, float changeAmount)
	{
		if ((changeAmount + leftOver) >= capacity)
			leftOver = capacity;
		else leftOver = (leftOver + changeAmount);
		return leftOver;
	}
	public float powerTimeMinutes (float leftOver, float kilowattPerHour)  // could have later used this.leftOver instead of calling the parameter
	{
		float timeMinutes;
		timeMinutes = Math.round(leftOver / kilowattPerHour  * 60);
		if (timeMinutes < 0)
			timeMinutes = 0;
		if (leftOver <= 0)  // ensures the time remaining is not a negative number
			timeMinutes = 0;
		return timeMinutes; //returns minutes remaining based on burn-rate
	}
	
}
