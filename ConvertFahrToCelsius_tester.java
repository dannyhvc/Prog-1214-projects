/*
 * Project Name: ConvertFahrToCelsius_tester.java
 * Purpose: tests the
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/14/2018 | Time: 2:34 PM
 */
package Methods_Chp6;

import Methods_Chp6.MyToolbox;

import java.util.Scanner;

public class ConvertFahrToCelsius_tester {
  public static void main(String[] args) {
    //creates a Scanner obj
    Scanner scanner = new Scanner(System.in);

    //input section
    System.out.println("This program will convert a fahrenheit temp to Celsius temp.");

    System.out.println("Enter a Fahrenheit temp to convert: ");
    double f_temp = scanner.nextDouble();
    scanner.close();

    //output
    double catcher = MyToolbox.convertFahrToCel(f_temp);
    System.out.println("the temp in cel is: " + catcher);


  }//end main()   
}//end Main class
