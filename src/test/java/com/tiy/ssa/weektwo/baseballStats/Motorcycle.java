package com.tiy.ssa.weektwo.baseballStats;

import com.tiy.ssa.weektwo.daytwo.Vehicle;

public class Motorcycle extends Vehicle
{
	private boolean sidecar = false;

	public Motorcycle(boolean running, boolean fueledUp, String color, String condition, int numberOfSeats, int wheels,
			boolean sidecar) {
		super(running, fueledUp, color, condition, numberOfSeats, wheels);
		this.sidecar = sidecar;
	}


	
	
	
}
