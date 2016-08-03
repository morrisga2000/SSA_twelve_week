package com.tiy.ssa.weekone.assignment_three;
import static org.junit.Assert.*;

import org.junit.Test;


public class palindromeTests 
{
	@Test
	public void test()
	{
	assertEquals("", "racecar is a palindrome", new Palindrome("racecar") .isPalindrome());
	assertEquals("", "hannah is a palindrome", new Palindrome("hannah") .isPalindrome());
	assertEquals("", "ballad is not a palindrome", new Palindrome("ballad") .isPalindrome());
	assertEquals("", "mom is a palindrome", new Palindrome("Mom") .isPalindrome());
	assertEquals("", "tomorrow is not a palindrome", new Palindrome("tomorrow") .isPalindrome());




	}
}
