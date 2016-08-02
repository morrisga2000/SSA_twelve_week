package com.tiy.ssa.weekone.assignmentone;
import java.util.*;

public class Thermometer
{
	float temperature;
	boolean isfarhenheit;
	// String tempScale = ""; 

	
	/*public Thermometer(float temperature, boolean isfarhenheit)
	{
		this.temperature = temperature;
		this.isfarhenheit = isfarhenheit;
	
	}
	public float display(boolean userwantsFahrenheit)
	{
		
		System.out.print("Enter the current outside temperature: "); 
		float temps = in.nextFloat();
		if (userwantsFahrenheit == this.isfarhenheit)
		{
			tempScale = "Fahrenheit";
			return this.temperature;
		}
		else
		{
			tempScale = "Celsius"; 
			return Math.round((this.temperature - 32) * (5/9F)); 	
		}
		
		// System.out.println("The temperature is "  + " degrees " + tempScale);
	
	}
		float fahrenheitToCelcius()
		{
			return -1;
		}
		float celciusToFahenheit()
		{
			return -1;
		}
	
	*/
	public static void main(String args[]) 
	{ 
		Scanner in = new Scanner(System.in);
	 // Converting Fahrenheit to Celsius 
	System.out.println("Enter temperature in Fahrenheit :"); 
	float temperature = in.nextFloat(); 
	float celsius = toCelsius(temperature); 
	System.out.printf("%.02f degree fahrenheit temperature is equal to %.02f degree celsius %n", temperature, celsius); // Converting Celsius to Fahrenheit 
	System.out.println("Enter temperature in degree celsius :"); 
	temperature = in.nextFloat(); 
	float fahrenheit = toFahrenheit(temperature); 
	System.out.printf("%.02f degree celsius is equal to %.02f degree fahrenheit %n", temperature, fahrenheit); } /** * Method to convert temperature from celsius to fahrenheit * * @param celsius * @return */ 
	public static float toFahrenheit(float celsius) 
	{ 
		float fahrenheit = 9 * (celsius / 5) + 32; 
		return fahrenheit; 
	} /** * Converts fahrenheit temperature to celsius * * @param fahrenheit * @return */ 
	public static float toCelsius(float fahrenheit) 
	{ 
		float celsius = (fahrenheit - 32) * 5 / 9; 
	return celsius;
	}

}

