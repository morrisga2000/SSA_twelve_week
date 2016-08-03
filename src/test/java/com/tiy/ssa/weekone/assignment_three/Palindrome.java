package com.tiy.ssa.weekone.assignment_three;
import java.util.*;
public class Palindrome
{
    String original, reverse = "";
    boolean checkPalindrome;
    
    public Palindrome(String original)
	{
		this.original = original.toLowerCase();
		
	}
    public String isPalindrome()
    {
	      int length = original.length();
	      
	      for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + original.charAt(i);
	      if (original.equals(reverse))
	    	  {
	    	  checkPalindrome = true;  // optional, maybe need later
	    	  return (this.original + " is a palindrome");
	    	  }
 	       else
	      return (this.original + " is not a palindrome");

    }
			// = toCharArray()
			
			// for (int i = 0; i < chars.length; i++)
	
}
