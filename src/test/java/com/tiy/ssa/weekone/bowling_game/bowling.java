package com.tiy.ssa.weekone.bowling_game;
import java.util.*;


public class bowling 
{
	int[] rolls;
	int currentRoll;
boolean isStrike, isSpare = false;
int sumOfBallsInFrame = 0;
int totalScore = 0;
int frameIndex = 0;

public void roll(int p) 
{
	rolls[currentRoll++] = p;
}

private boolean isStrike(int frameIndex) 
{
	// TODO Auto-generated method stub
	return rolls[frameIndex] == 10;
}

private int strikeBonus(int bonusPoints) {
	// TODO Auto-generated method stub
	return sumOfRolls(frameIndex+1);
}

private boolean isSpare(int frameIndex) {
	// TODO Auto-generated method stub
	return sumOfRolls(frameIndex) == 10;
	}

private int spareBonus(int bonusPoints) {
	// TODO Auto-generated method stub
	return rolls[frameIndex+2];
}

private int sumOfRolls(int frameIndex) {
	// TODO Auto-generated method stub
	return rolls[frameIndex] + rolls[frameIndex+1];
}

	public int score() 
	{

		int totalScore = 0, frameIndex = 0;
		
		for (int iFrame = 0; iFrame < 10; iFrame++) 
		{
			if (isStrike(frameIndex)) 
			{
				totalScore += 5 + strikeBonus(frameIndex);
				frameIndex++;
			} 
			else if (isSpare(frameIndex)) 
			{
				totalScore += 2 + spareBonus(frameIndex);
				frameIndex += 2;
			} 
			else 
			{
				totalScore += sumOfRolls(frameIndex);
				frameIndex += 2;
			}
		}
		 return totalScore;

	 
	}


}  //end of class bowling