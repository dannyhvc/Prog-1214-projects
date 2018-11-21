package Operator_And_Arethmatic;

import java.util.Scanner;

/**
 *
 */
public class temperatureConverter
{
	public static void main(String args[]) 
	{
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("enter a tempurature in ferhiet: ");
	double fahrTemp = scanner.nextDouble();
	
	double celTemp = (double)5/9 * (fahrTemp - 32);
	
	System.out.println("\nyour tempurature in celcius is: "+ celTemp);
	
	scanner.close();
	
	}//end main
	
}//end tempCon




