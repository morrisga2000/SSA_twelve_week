package com.tiy.ssa.weektwo.objectDesign;

public class CustomizedPerfectBaby extends Human {

	public boolean diseaseFree = false;
	public boolean herculeanStrength = false;
	public boolean cheetahSpeedSprinter = false;
	public boolean regeneratingLimbs = false;
	public boolean universalBloodType = false;
	public boolean enhancedIntelligence = false;
	public boolean facialSymmetry = false;
	public boolean perfectProportions = false;
	public boolean dauntlessBehavior = false;

	public CustomizedPerfectBaby(String sex, int eyeColor, int skinColor, int hairColor, float height,
			boolean diseaseFree, boolean herculeanStrength, boolean cheetahSpeedSprinter, boolean regeneratingLimbs,
			boolean universalBloodType, boolean enhancedIntelligence, boolean facialSymmetry,
			boolean perfectProportions, boolean dauntlessBehavior) {
		super(sex, eyeColor, skinColor, hairColor, height);
		this.diseaseFree = diseaseFree;
		this.herculeanStrength = herculeanStrength;
		this.cheetahSpeedSprinter = cheetahSpeedSprinter;
		this.regeneratingLimbs = regeneratingLimbs;
		this.universalBloodType = universalBloodType;
		this.enhancedIntelligence = enhancedIntelligence;
		this.facialSymmetry = facialSymmetry;
		this.perfectProportions = perfectProportions;
		this.dauntlessBehavior = dauntlessBehavior;
	}

	public CustomizedPerfectBaby() {
		super();
	}

	public boolean isDiseaseFree() {
		return diseaseFree;
	}

	public void setDiseaseFree(boolean diseaseFree) {
		this.diseaseFree = diseaseFree;
	}

	public boolean isHerculeanStrength() {
		return herculeanStrength;
	}

	public void setHerculeanStrength(boolean herculeanStrength) {
		this.herculeanStrength = herculeanStrength;
	}

	public boolean isCheetahSpeedSprinter() {
		return cheetahSpeedSprinter;
	}

	public void setCheetahSpeedSprinter(boolean cheetahSpeedSprinter) {
		this.cheetahSpeedSprinter = cheetahSpeedSprinter;
	}

	public boolean isRegeneratingLimbs() {
		return regeneratingLimbs;
	}

	public void setRegeneratingLimbs(boolean regeneratingLimbs) {
		this.regeneratingLimbs = regeneratingLimbs;
	}

	public boolean isUniversalBloodType() {
		return universalBloodType;
	}

	public void setUniversalBloodType(boolean universalBloodType) {
		this.universalBloodType = universalBloodType;
	}

	public boolean isEnhancedIntelligence() {
		return enhancedIntelligence;
	}

	public void setEnhancedIntelligence(boolean enhancedIntelligence) {
		this.enhancedIntelligence = enhancedIntelligence;
	}

	public boolean isFacialSymmetry() {
		return facialSymmetry;
	}

	public void setFacialSymmetry(boolean facialSymmetry) {
		this.facialSymmetry = facialSymmetry;
	}

	public boolean isPerfectProportions() {
		return perfectProportions;
	}

	public void setPerfectProportions(boolean perfectProportions) {
		this.perfectProportions = perfectProportions;
	}

	public boolean isDauntlessBehavior() {
		return dauntlessBehavior;
	}

	public void setDauntlessBehavior(boolean dauntlessBehavior) {
		this.dauntlessBehavior = dauntlessBehavior;
	}

	public String printHairColor()
	{
		if (hairColor == 1)
			return ("dark brown");	
			if (hairColor == 2)
			return ("castano brown");	
			if (hairColor == 3)
			return ("light brown");
			if (hairColor == 4)
			return ("blonde");	
			if (hairColor == 5)
			return ("platinum blonde");
			if (hairColor == 6)
			return ("black");
			if (hairColor == 7)
			return ("auburn");
			if (hairColor == 8)
			return ("red-headed");
			if (hairColor == 9)
			return ("silver");
			else
				return "error";
	}
	
	public String printEyeColor()
	{
		if (eyeColor == 1)
			return ("hazel");	
			if (eyeColor == 2)
			return ("brown");	
			if (eyeColor == 3)
			return ("green");
			if (eyeColor == 4)
			return ("light blue");	
			if (eyeColor == 5)
			return ("dark blue");	
			else
				return "error";
	}
	
	
	@Override
	public String toString() {
		return "Here is the wonderful creation you have designed! \n Disease free? " + diseaseFree + "\n" +  " Herculean Strength? " + herculeanStrength
				+ "\n High-Speed Sprinter? " + cheetahSpeedSprinter + "\n Regenerating Limbs? " + regeneratingLimbs
				+ "\n Universal Blood Type? " + universalBloodType + " \n Enhanced Intelligence? " + enhancedIntelligence
				+ "\n Superb facial symmetry? " + facialSymmetry + "\n Perfect Body Proportions? " + perfectProportions
				+ "\n Dauntless Behavior? " + dauntlessBehavior + "\n sex of " + sex + ", eye color of " + printEyeColor()
				+ ", skin color of " + skinColor + ", hair color of " + printHairColor() + ", attainable adult height of " + height + " inches";
	}

	
	
	
} // ends class
