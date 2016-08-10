package com.tiy.ssa.ZooTrip;

public class Amphibians extends Animal{

	private boolean hasLungs = false;

	public Amphibians(boolean vertebrate, boolean walksUprightOnLand, boolean endothermic, boolean laysEggs, String sex,
			boolean hasLungs) {
		super(vertebrate, walksUprightOnLand, endothermic, laysEggs, sex);
		this.hasLungs = hasLungs;
	}

	public String isHasLungs() {
		if (hasLungs)
		return " that has lungs";
		else
			return " that does not have lungs";
	}

	public void setHasLungs(boolean hasLungs) {
		this.hasLungs = hasLungs;
	}

	@Override
	public String toString() {
		return " an Amphibian" + isHasLungs() + isLaysEggs() + isEndothermic() + ", sex of " + sex;
	}
	
	
	
}
