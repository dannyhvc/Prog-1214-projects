/*
* purpose: this demonstrates a few
* of the many methods that are available in the math class, which is a utility class in the java lib.
 */

package Arrays_Chp6;

public class Math_Class_Methods_Examples {
  public static void main(String[] args) {
    //math class value for PI
    System.out.println("Value of PI from Math.PI: " + Math.PI);

    //Math.abs
    System.out.println("Absolute val of -5 using Math.abs() is: " + Math.abs(-5));
    System.out.println("Absolute val of 5 using Math.abs() is: " + Math.abs(5));

    //Ceiling and floor
    double num1 = 6.4;
    System.out.println("\nCeiling of " + num1 + " is " + Math.ceil(num1));
    System.out.println("floor of " + num1 + " is " + Math.floor(num1));

    //sqrt
    double num2 = 100.0;
    double num3 = -1;
    System.out.println("\n the square root of num2 is " + Math.sqrt(num2));
    System.out.println("the square root of num2 is " + Math.sqrt(num3)); //(note) gives NaN (not a real number)

    //cube root
    System.out.println("Cube root of " + num2 + " is " + Math.cbrt(num2));

    //pow
    double num4 = 2.0;
    double num5 = 3.0;
    double num6 = 3.5;
    System.out.println("\nUsing Math.pow(), " + num4 + " raised to exponent of " +
        num5 + " is " + Math.pow(num4, num5));
    System.out.println("Using Math.pow(), " + num4 + " raised to exponent of " +
        num6 + " is " + Math.pow(num4, num6));

    //trigonometry methods
    //(note) java angular measure uses radians not degrees.
    double angle1 = Math.PI / 2;
    double angle2 = Math.PI / 4;
    System.out.println("\nthe value of sin(PI/2) is " + Math.sin(angle1));
    System.out.println("the value of sin(PI/4) is " + Math.sin(angle2));

    System.out.println("\nthe value of cos(PI/2) is " + Math.cos(angle1));
    System.out.println("the value of cos(PI/4) is " + Math.cos(angle2));

  }//end main   
}//end class
