/**
 *Program Name: Pythag_Triples.java
 *Purpose:
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Sep 25, 2018 | 12:40:01 PM
 */
package MyProjects.shitterCode;

import java.util.Scanner;

public class Pythag_Triples
{

	public static void main(String[] args)
	{
		//creates scanner obj
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a scale factor number for side variable m: ");
		int n = in.nextInt();

		System.out.print("\nEnter a scale factor number for side variable n: ");
		int m = in.nextInt();


		//returns the result
		System.out.println("Given the vector direction of m and n all sides equate to");
		System.out.println
		(
				"Sides: A = " + sideA(m, n) + ", " + "B = " + sideB(m, n) + ", C = " + sideC(m, n)
		);

		in.close();//good house keeping

	}

	public static int sideA(int m, int n)
	{
		int A = 2*m*n;

		return A;

	}//end sideA

	public static double sideB(int m, int n)
	{
		double B = Math.pow(m, 2) - Math.pow(n, 2);

		return B;

	}//end sideB

	public static double sideC(int m, int n)
	{
		double C = Math.pow(m, 2) + Math.pow(n, 2);;

		return C;

	}//end sideC

}//end class
