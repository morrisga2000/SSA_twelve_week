package com.tiy.ssa.weekone.bowling_game;
import static org.junit.Assert.*;

import org.junit.Test;

import com.tiy.ssa.weekone.assignment_three.PigLatin;

public class bowling_tests 
{
	@Test
	public void test()
	{
	//	assertEquals("", "no idea", new PigLatin("played sprayed spayed hay die with me too") .translateWord());
	//	assertEquals("", "no idea", new PigLatin("screaming schools spell the phosphorus die with me too") .translateWord());
		
		game.roll(0);
	    game.roll(10);

	    int score  = game.score();
	    Assert.assertEquals(10, score);


	    game.roll(5);
	    game.roll(4);

	    score  = game.score();
	    Assert.assertEquals(28, score);

	}
}  // end of class bowling_tests
