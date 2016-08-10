package com.tiy.ssa.weekone.assignment_three;
import java.util.*;

public class PigLatin 
{
	String originalLine;
	String[] words;
	String piglatin;
   // char vowel[]={'a','e','u','o','i'};
  //  String vowel[]={"a","e","u","o","i"};

	private Scanner in;
	
	public PigLatin(String originalLine)
	{
		this.originalLine = originalLine.toLowerCase();
		in = new Scanner (originalLine);
		
	}
    public String translateWord() 
    {
    	int pos = 0;
    	String piglatin = "";
    	
    //	for (int i = 0; i < words.length(); i++)
    	words = originalLine.split(" ");
        for (String word : words) 
        {
           if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u"))
           // if (word.startsWith(vowel))   
        	   piglatin += word + "way ";

           else if (word.startsWith("thr") || word.startsWith("sch") || word.startsWith("str") || word.startsWith("scr") || word.startsWith("spr") || word.startsWith("spl") || word.startsWith("shr"))
               piglatin += (word.substring(3)+word.substring(0,3)+"ay ");

            else
                piglatin += (word.substring(1)+word.substring(0,1)+"ay ");
              

        }
        
        String pigLatin2 = "";
    	words = piglatin.split(" ");
        for (String word : words) 
        {
        if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u"))
             	   pigLatin2 += word + " ";
             	   else if (! word.startsWith("a") && ! word.startsWith("e") && ! word.startsWith("i") && ! word.startsWith("o") && ! word.startsWith("u"))  
             	   {
             		   int placement = word.length() - 2;
             		  pigLatin2 += word.substring(1, placement) + (word.substring(0,1)+"ay ");
             		 //  pigLatin2 += word.substring(1).replace("ay", "") + (word.substring(0,1)+"ay ");
             	   }
             	  else
                      pigLatin2 += word + " ";
        }
     
        
    //	}  // end of outer for loop
		return pigLatin2;
    }
}
