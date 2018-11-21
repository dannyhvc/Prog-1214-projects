/**
 *Program Name: Employe.java
 *Purpose: Shows the magnitude between two vectors and the and calculates the new
 *				 vector magnitude.
 *Coder: Daniel Herrera 0881570 for section 02
 *Date: Sep 20, 2018 | 5:08:59 PM
 */

package MyProjects.shitterCode;

import java.util.Scanner;

public class Cords
{

	public enum Tipe{SEEM, MEEN, ABSTRACT}

	public static void main(String[] args)
	{

		//creates a scanner obj
		//use of a & b are parameters for pos1 obj
		Scanner in = new Scanner(System.in);

		System.out.print("enter x1 cord: ");//x1 pos
		int x1 = in.nextInt();
		System.out.print("enter y1 cord: ");//y1 pos
		int y1 = in.nextInt();

		//second set of corrdinates
		System.out.print("enter x2 cord: ");//x2 pos
		int x2 = in.nextInt();
		System.out.print("enter y2 cord: ");//y2 pos
		int y2 = in.nextInt();

		//creates obj
		Cords pos1 = new Cords();
		double c1 = pos1.magnitude(x1, y1);

		Cords pos2 = new Cords();
		double c2 = pos2.magnitude(x2, y2);

		//takes the 2 magnitudes of the pos1 and pos2 and creates magnitude of new right vector.
		double magnitudeOfVectors = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
		System.out.println("\nThe magnitude of the vector is " + magnitudeOfVectors);

		//good house keeping
		in.close();

	}//end main

	public double magnitude(int x, int y)
	{
		double z = Math.sqrt((Math.pow(x,2) + Math.pow(y,2))); //finds the magnitude of
																													 //both sets.

		//titles the processing steps
		System.out.println("\n\nprocessing...");

		//prints the steps of the processing...
		System.out.println("sqrt(" +x+"^2" + " + " + y+"^2"+")");
		System.out.println("sqrt("+ Math.pow(x,2) + " + " + Math.pow(y,2) + ")");
		System.out.println("The radius of z = " + z);

		return z;

	}//end vector

	public Tipe sizing(int x, int y)
	{
		Tipe foo;

		if(x >= Math.pow(y ,2))
		{
			foo = Tipe.SEEM;

		} else if (x == Math.pow(y, 2)) {
			foo = Tipe.MEEN;

		} else {
			foo = Tipe.ABSTRACT;

		}

		return foo;

	}


}//end class
