package com.tiy.ssa.ZooTrip;

public class Invertebrates extends Animal{

	private boolean hasEyes = false;
	private boolean hasGills = false;
	private boolean isBilateral = false;
	private boolean livesInWater = false;
	private boolean hasLimbs = false;
	public Invertebrates(boolean vertebrate, boolean walksUprightOnLand, boolean endothermic, boolean laysEggs,
			String sex, boolean hasEyes, boolean hasGills, boolean isBilateral, boolean livesInWater,
			boolean hasLimbs) {
		super(vertebrate, walksUprightOnLand, endothermic, laysEggs, sex);
		this.hasEyes = hasEyes;
		this.hasGills = hasGills;
		this.isBilateral = isBilateral;
		this.livesInWater = livesInWater;
		this.hasLimbs = hasLimbs;
	}
	public String isHasEyes() {
		if (hasEyes)
		return ", has eyes";
		else
			return ", it does not have eyes";
	}
	public void setHasEyes(boolean hasEyes) {
		this.hasEyes = hasEyes;
	}
	public String isHasGills() {
		if (hasGills)
		return ", has gills";
		else
			return
					"does not have gills";
	}
	public void setHasGills(boolean hasGills) {
		this.hasGills = hasGills;
	}
	public String isBilateral() {
		if (isBilateral)
		return ", is bilateral";
		else
			return ", is not bilateral";
	}
	public void setBilateral(boolean isBilateral) {
		this.isBilateral = isBilateral;
	}
	public String isLivesInWater() {
		if (livesInWater)
		return ", lives in water";
		else
			return ", does not live in water";
	}
	public void setLivesInWater(boolean livesInWater) {
		this.livesInWater = livesInWater;
	}
	public String isHasLimbs() {
		if (hasLimbs)
		return ", has limbs";
		else
			return ", does not have limbs";
	}
	public void setHasLimbs(boolean hasLimbs) {
		this.hasLimbs = hasLimbs;
	}
	@Override
	public String toString() {
		return (" an animal that is an invertebrate" + isHasEyes() + isHasGills() + isBilateral()
				+ isLivesInWater() + isHasLimbs() + isVertebrate() + isWalksUprightOnLand() + isEndothermic() + isLaysEggs() + ", sex of " + sex + ". Does this fit? What do you think it is?");
	}
	
	
	
}
