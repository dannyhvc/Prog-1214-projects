/**
 *Program Name: Name_lab02Q2.java 
 *Purpose:
 *Coder: 
 *Date: Oct 6, 2018 | 4:44:46 PM
 */

package MyProjects.shitterCode;

import java.util.Scanner;

public class Name_lab02Q2 {

	public static void main(String[] args) {
		
		//variable declairation
		int numInput;
		int topSum = 0;
		double mean;
		int max = 0;
		int min = 0;
		int evenCount = 0;
		int oddCount = 0;
		
		//PLACE STUDENT NAME, LAB, DATE, QUESTION (HERE)<-----
		//delete this comment when you're done
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		//explination section
		Scanner in = new Scanner(System.in); //creates a scanner obj
		System.out.print("Enter an integer number for the number of loop iterations: ");
		int iterations = in.nextInt();		
		
		//loop section
		for(int i=1; i<=iterations; i++) {
			//input section**
			System.out.print("\nEnter integer " + i +": ");
			numInput = in.nextInt();
			
			
			//mean processing**
			/**
			 * using a storage variable (topSum) to sum the top of each consectuitve
			 * input and set the baisis of the mean function.
			 */
			topSum += numInput;
			mean = (double)topSum / i; //casting topSum to double to avoid integer division.
			System.out.println("The mean of " + i + " input(s) is: " + mean);
			
			
			//maximun and minimun processing.**
			/**
			 * ignores position of max or min only check weather it is
			 * greater or less than the current one.
			 */
			if(i == 1) { //sets the first iteration of max & min to numInput at spot i=1.
				max = numInput;
				min = numInput;
				
			} else if(numInput > max) {
				max = numInput;
				
			} else {
				min = numInput;
			}
			//prints the result of both fence posts on seprate lines
			System.out.println("Max value: " + max);
			System.out.println("Min value: " + min);
			
			
			//odd and even count processing**
			/**
			 * using modulus operator to check if the number is even or not.
			 * if either one is true it adds one to the repective count.
			 */
			if(numInput % 2 == 0) {
				++evenCount;
				
			} else {
				++oddCount;
			}
			System.out.println("Even count: " + evenCount);
			System.out.println("Odd count: " + oddCount);	
			
			
			//checks the end of the loop and end program with a print.
			if(i == iterations) {
				System.out.println("\nGoodbye!");
			}
			
		}
		in.close();//good house keeping
		
		
	}//end main

}//end class
