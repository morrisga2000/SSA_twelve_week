package com.tiy.ssa.ZooTrip;

public class Birds extends Reptiles {

	private boolean livesInTrees = false;
	private boolean WingsPresent = false;
	private boolean raisesYoung = false;
	private boolean isCarnivore = false;
	private String nameOfBird = null;
	
	public Birds(boolean vertebrate, boolean walksUprightOnLand, boolean endothermic, boolean laysEggs, String sex,
			boolean hasTeeth, boolean breathesWithLungs, boolean isScaledSkin, String taxonomyName,
			boolean livesInTrees, boolean wingsPresent, boolean raisesYoung, boolean isCarnivore, String nameOfBird) {
		super(vertebrate, walksUprightOnLand, endothermic, laysEggs, sex, hasTeeth, breathesWithLungs, isScaledSkin,
				taxonomyName);
		this.livesInTrees = livesInTrees;
		WingsPresent = wingsPresent;
		this.raisesYoung = raisesYoung;
		this.isCarnivore = isCarnivore;
		this.nameOfBird = nameOfBird;
	}
	public String isLivesInTrees() {
		if (livesInTrees)
		return ", lives among trees";
		else
			return ", does not live in trees";
	}
	public void setLivesInTrees(boolean livesInTrees) {
		this.livesInTrees = livesInTrees;
	}
	public String isWingsPresent() {
		if (WingsPresent)
		return ", has wings present";
		else
			return ", does not have wings";
	}
	public void setWingsPresent(boolean wingsPresent) {
		WingsPresent = wingsPresent;
	}
	public String isRaisesYoung() {
		if (raisesYoung)
		return ". It raises its young.";
		else
			return ". It does not raise its young.";
	}
	public void setRaisesYoung(boolean raisesYoung) {
		this.raisesYoung = raisesYoung;
	}
	public String isCarnivore() {
		if (isCarnivore)
		return " It eats meat";
		else
			return " It is not a carnivore";
	}
	public void setCarnivore(boolean isCarnivore) {
		this.isCarnivore = isCarnivore;
	}
	public String getNameOfBird() {
		return nameOfBird;
	}
	public void setNameOfBird(String nameOfBird) {
		this.nameOfBird = nameOfBird;
	}
	@Override
	public String toString() {
		return(" a bird named " + nameOfBird + isLivesInTrees() + isWingsPresent() + isRaisesYoung()
				+ isCarnivore() + isVertebrate() + isWalksUprightOnLand() + isEndothermic() + isLaysEggs() + ", sex of " + sex);
	} 
	
	
	
	
	
	
}
