package Selection_Structures_Chp3; /**
 *Program Name: Selection_Structures_Chp3.DH_CarWash.java
 *Purpose:
 *
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Sep 27, 2018 | 2:48:26 PM
 *
 *
 *PSEUDO-CODE:
 *1) Import scanner library
 *2) Scanner section
 *3) Define variables
 *	a) Declare constants
 *4) Ask the user for enter number of liters of gas type they yould like
 *5) Ask the user to enter price of the car wash
 *6) Ask the user to enter Their car model
 *6.1) House keeping
 *7) processing
 *
 *
 */

//1) Import scanner library
import java.util.Scanner;

public class DH_CarWash
{

	public static void main(String[] args)
	{
		//2) Scanner section
		Scanner in = new Scanner(System.in);
		
		//3) Define variables
		int regularGas;
		int premiumGas;
		float carWashPrice;
		int carWashesEarned;
		String carModel;
		double total_credit;
		double extra_credit;
		
		//3.a) Declare constants
		final float CREDIT_FOR_REGULAR = 0.05f;//are float so they use less memory
		final float CREDIT_FOR_PREMIUM = 0.06f;
		
		//4) Ask the user for enter number of liters of gas type they yould like
		System.out.print("Enter the number of regular gas you would like: ");
		regularGas = in.nextInt();
		System.out.print("Enter the number of premium gas you would like: ");
		premiumGas = in.nextInt();
		
		//5) Ask the user to enter price of the car wash
		System.out.print("Enter the price of  the car wash: $");
		carWashPrice = in.nextFloat();
		in.nextLine();//buffer flush
		
		//6) Ask the user to enter Their car model
		System.out.print("Enter the model of your vehicle: ");
		carModel = in.nextLine();
		
		in.close(); //6.1) House keeping
		
		//7) processing
		
		//operation for total_credit
		total_credit = regularGas*CREDIT_FOR_REGULAR + premiumGas*CREDIT_FOR_PREMIUM;
		
		//truncation of total_credit
		total_credit *= 100;
		int temp = (int)total_credit;
		total_credit = (double)temp/100;
		
		//ouput for total credit
		System.out.println("\nour total credit earned is " + total_credit);
		
		//operation for car washes
		carWashesEarned = (int)total_credit/ (int)carWashPrice;
		//outpput for car washes earned
		System.out.println("You've earned " + carWashesEarned + " car wash(es) for your " + carModel);
		
		//operation for extra credit
		extra_credit = total_credit - carWashesEarned*carWashPrice;
		//truncating the deciaml places
		extra_credit *= 100;
		temp = (int)extra_credit;
		extra_credit = (double)temp/100;
		
		//output for extra credit
		System.out.println("The extra credit earned is " + extra_credit);
		

	}//end main
	
	
}//end class
