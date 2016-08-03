package com.tiy.ssa.weekone.assignmenttwo;

import java.math.BigDecimal;


public class PrecisionBattery
{

	double capacity;  // in kWh, the max capacity of the phone battery
	double chargeAmount;      // is positive, whether draining or adding to battery
	double energy;        // in kWh, amount left-over after use or charge
	public PrecisionBattery() 
	{
		this.capacity = capacity;
		this.energy = capacity;
		// TODO Auto-generated constructor stub
	}
		public double charge(double energy, double changeAmount)
		{
			if ((changeAmount + energy) >= capacity)
				energy = capacity;
			else energy += changeAmount;
			return energy;
		}
		public double discharge(double energy, double changeAmount)
		{
			if (changeAmount >= energy)
				energy = (double) 0.0;
			else energy -= changeAmount;
			return energy;
		}
		public BigDecimal howMuchTime(BigDecimal power)
		{
			BigDecimal timeMinutes;
			timeMinutes = (BigDecimal)this.energy / (BigDecimal)power  * 60;
			if (timeMinutes < 0)
				timeMinutes = 0;
			if (energy <= 0)  // ensures the time remaining is not a negative number
				timeMinutes = 0;
			return timeMinutes; //returns minutes remaining based on burn-rate
		}

		
		public float getMaxCapacity()
		{
			
		}
		public float getRemaining()
		{
			
		}
		



	
	
}   // ends class PrecisionBattery
