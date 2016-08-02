package com.tiy.ssa.weekone.assignmenttwo;
import static org.junit.Assert.*;

import org.junit.Test;

public class BatteryTests
{


		@Test
		public void test()
		{
		assertEquals("", 68F, new assignmenttwo(150F) .reduction(88F, 20F), .01);
		assertEquals("", 110F, new assignmenttwo(150F) .addingCharge(50F, 60F), .01);
		assertEquals("", 0F, new assignmenttwo(90F) .reduction(88F, 90F), .01);
		assertEquals("", 90F, new assignmenttwo(99F) .addingCharge(80F, 10F), .01);
		assertEquals("", 150F, new assignmenttwo(150F) .addingCharge(100F, 60F), .01);

		assertEquals("", 600F, new assignmenttwo(150F) .powerTimeMinutes(100F, 10F), .01);
		assertEquals("", 24F, new assignmenttwo(50F) .powerTimeMinutes(4F, 10F), .01);
		assertEquals("", 0F, new assignmenttwo(100F) .powerTimeMinutes(0F, 50F), .01);


		
		System.err.println(new assignmenttwo(125.5F));
			
		}
}
