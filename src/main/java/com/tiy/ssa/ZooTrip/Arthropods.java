package com.tiy.ssa.ZooTrip;

public class Arthropods extends Invertebrates{

	private boolean isInsect = false;
	private boolean hasWings = false;
	private int pairsOfLegs = 0;
	public Arthropods(boolean vertebrate, boolean walksUprightOnLand, boolean endothermic, boolean laysEggs, String sex,
			boolean hasEyes, boolean hasGills, boolean isBilateral, boolean livesInWater, boolean hasLimbs,
			boolean isInsect, boolean hasWings, int pairsOfLegs) {
		super(vertebrate, walksUprightOnLand, endothermic, laysEggs, sex, hasEyes, hasGills, isBilateral, livesInWater,
				hasLimbs);
		this.isInsect = isInsect;
		this.hasWings = hasWings;
		this.pairsOfLegs = pairsOfLegs;
	}
	public String isInsect() {
		if (isInsect)
		{
		return (", which is an insect");
		}
		else
			return (", which is not an insect");
	}
	public void setInsect(boolean isInsect) {
		this.isInsect = isInsect;
	}
	public String isHasWings() {
		if (hasWings)
		{
		return (", that has wings");
		}
		else
			return (", that does not have wings");
	}
	public void setHasWings(boolean hasWings) {
		this.hasWings = hasWings;
	}
	public int getPairsOfLegs() {
		return pairsOfLegs;
	}
	public void setPairsOfLegs(int pairsOfLegs) {
		this.pairsOfLegs = pairsOfLegs;
	}
	@Override
	public String toString() {
		return (" an animal that is an Arthropod" + isInsect() + isHasWings() + ", that has "  + pairsOfLegs + "  pairs of legs" 
				+ isVertebrate() + isWalksUprightOnLand() + isEndothermic() + isLaysEggs() + ", sex of " + sex + ". Does this fit? What do you think it is?");
	}
	
	
	
	
}
