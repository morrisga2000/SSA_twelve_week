package com.tiy.ssa.ZooTrip;

public class Animal {

	protected boolean vertebrate = false;
	protected boolean walksUprightOnLand = false;
	protected boolean endothermic = false;
	protected boolean laysEggs = false;
	protected String sex = null;
	public Animal(boolean vertebrate, boolean walksUprightOnLand, boolean endothermic, boolean laysEggs, String sex) {
		super();
		this.vertebrate = vertebrate;
		this.walksUprightOnLand = walksUprightOnLand;
		this.endothermic = endothermic;
		this.laysEggs = laysEggs;
		this.sex = sex;
	}
	public String isVertebrate() {
		if (vertebrate)
		return ", which is a vertebrate";
		else
			return ", which is not a vertebrate";
	}
	public void setVertebrate(boolean vertebrate) {
		this.vertebrate = vertebrate;
	}
	public String isWalksUprightOnLand() {
		if (walksUprightOnLand)
		return ", walks upright on land";
		else
			return ", does not walk upright on land";
	}
	public void setWalksUprightOnLand(boolean walksUprightOnLand) {
		this.walksUprightOnLand = walksUprightOnLand;
	}
	public String isEndothermic() {
		if (endothermic)
		return ", is warm-blooded";
		else
			return ", is ectothermic";
	}
	public void setEndothermic(boolean endothermic) {
		this.endothermic = endothermic;
	}
	public String isLaysEggs() {
		if (laysEggs)
		return ", lays eggs";
		else 
			return
					" does not lay eggs";
	}
	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	
	
	
}
