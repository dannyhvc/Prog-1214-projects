/*
 * Project Name: StringMethodsExample.java
 * Purpose: shows some of the methods of a string class and how they are used.
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 10/25/2018 | Time: 8:38 PM
 */

//

package Arrays_Chp6;

public class StringMethodsExample {
  public static void main(String[] args) {
    //test strings
    String firstName = "Moe";
    String lastName = "Howard";

    System.out.println("Value of firstName is " + firstName);
    System.out.println("Value of lastName is " + lastName);

    //fine the length of each string
    System.out.println("\nlength of firstName is " + firstName.length());
    System.out.println("length of lastName is " + lastName.length());

    //use the concat method to create a third  string called fullName.
    String fullName = firstName.concat(lastName);
    System.out.println("\nthe concatenated fullName is " + fullName);

    //look at the trim(), used to remove unwanted spaces in a string.
    String longString = "\n         SPACED OUT          ";
    System.out.println("Value of longString befor triming is " + longString + ".");
    System.out.println("length of longString before trimming is " + longString.length());

    String shortString = longString.trim();
    System.out.println("Value of shortString before trimming is " + shortString + ".");
    System.out.println("length of shortString before trimming is " + shortString.length());

    //example using subString()
    String student1 = "0881570 Herrera, Daniel";
    System.out.println("\nSubstring example: before snipping, val of student1 is " +
        student1);
    System.out.println("length of student1 is " + student1.length());

    //let's pul off the first 7 chars in a subString called student#.
    /*
     * (note) VERY IMPORTANT subString = subString(startIndex , endIndex - 1);
     */
    String studentNum = student1.substring(0,7);
    System.out.println(studentNum);

    //snip out the center section
    String centerSection = student1.substring(10,18);
    System.out.println("The val of centerSection is " + centerSection);

    //use the replace() method to change one char to another.
    String replaceString = "abcdeabcdeabcdeabcde";
    System.out.println("val of replacement is " + replaceString.replace('b','B'));

  }//end main()   
}//end Main class
