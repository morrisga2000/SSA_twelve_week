package com.tiy.ssa.weekone.assignment_three;
import static org.junit.Assert.*;

import org.junit.Test;



public class pig_latin_tests
{
	@Test
	public void test()
	{
	assertEquals("", "no idea", new PigLatin("screaming schools spell the phosphorus die with me too") .translateWord());
	}
}
