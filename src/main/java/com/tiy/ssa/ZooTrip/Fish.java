package com.tiy.ssa.ZooTrip;

public class Fish extends Animal{

	private boolean hasScales = true;
	private boolean hasJaw = false;
	private boolean isBony = false;
	private boolean saltWater = false;
	public Fish(boolean vertebrate, boolean walksUprightOnLand, boolean endothermic, boolean laysEggs, String sex,
			boolean hasScales, boolean hasJaw, boolean isBony, boolean saltWater) {
		super(vertebrate, walksUprightOnLand, endothermic, laysEggs, sex);
		this.hasScales = hasScales;
		this.hasJaw = hasJaw;
		this.isBony = isBony;
		this.saltWater = saltWater;
	}
	public String isHasScales() {
		if (hasScales)
		return " that has scales";
		else
			return " that does not have scales";
	}
	public void setHasScales(boolean hasScales) {
		this.hasScales = hasScales;
	}
	public boolean isHasJaw() {
		return hasJaw;
	}
	public void setHasJaw(boolean hasJaw) {
		this.hasJaw = hasJaw;
	}
	public boolean isBony() {
		return isBony;
	}
	public void setBony(boolean isBony) {
		this.isBony = isBony;
	}
	public boolean isSaltWater() {
		return saltWater;
	}
	public void setSaltWater(boolean saltWater) {
		this.saltWater = saltWater;
	}
	@Override
	public String toString() {
		return " a Fish" + isHasScales() + ", hasJaw=" + hasJaw + ", isBony=" + isBony + ", saltWater=" + saltWater
				+ ", vertebrate=" + vertebrate + ", walksUprightOnLand=" + walksUprightOnLand + ", endothermic="
				+ endothermic + ", laysEggs=" + laysEggs + ", sex of " + sex + "]";
	}
	
	

}
