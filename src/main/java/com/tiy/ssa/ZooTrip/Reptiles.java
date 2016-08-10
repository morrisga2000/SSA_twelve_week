package com.tiy.ssa.ZooTrip;

public class Reptiles extends Animal {

	private boolean hasTeeth = false;
	private boolean breathesWithLungs = true;
	private boolean isScaledSkin = true;
	
	private String taxonomyName = null;

	public Reptiles(boolean vertebrate, boolean walksUprightOnLand, boolean endothermic, boolean laysEggs, String sex,
			boolean hasTeeth, boolean breathesWithLungs, boolean isScaledSkin, String taxonomyName) {
		super(vertebrate, walksUprightOnLand, endothermic, laysEggs, sex);
		this.hasTeeth = hasTeeth;
		this.breathesWithLungs = breathesWithLungs;
		this.isScaledSkin = isScaledSkin;
		this.taxonomyName = taxonomyName;
	}

	public String isHasTeeth() {
		if (hasTeeth)
		return ", has teeth";
		else
			return ", does not have teeth";
	}

	public void setHasTeeth(boolean hasTeeth) {
		this.hasTeeth = hasTeeth;
	}

	public String isBreathesWithLungs() {
		if (breathesWithLungs)
		return ", breathes with lungs";
		else
			return ", does not breathe with lungs";
	}

	public void setBreathesWithLungs(boolean breathesWithLungs) {
		this.breathesWithLungs = breathesWithLungs;
	}

	public String isScaledSkin() {
		if (isScaledSkin)
		return ", has a scaly epidermis";
		else
			return ", does not have a scaly exterior";
	}

	public void setScaledSkin(boolean isScaledSkin) {
		this.isScaledSkin = isScaledSkin;
	}

	public String getTaxonomyName() {
		return taxonomyName;
	}

	public void setTaxonomyName(String taxonomyName) {
		this.taxonomyName = taxonomyName;
	}

	@Override
	public String toString() {
		return ("a reptile with the name of " + taxonomyName + isHasTeeth() + isBreathesWithLungs() + isScaledSkin() + ", sex of " + sex);
	}
	
	
	
}
