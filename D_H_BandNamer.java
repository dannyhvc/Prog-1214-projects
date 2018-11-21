/*
 * Project Name: D_H_BandNamer.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/8/2018 | Time: 2:38 PM
 *
 * PSEUDO-CODE:
 *      1) import Scanner, and Random
 *        1.a) make scanner obj
 *      2) Declare variables
 *      3) print line that explaining program
 *      4) ask for amount of band names to see
 *      5) create arrays using direct instantiation.
 *      6) give output message
 *      7) print the names
 */
package MyProjects.shitterCode2;
//1) import Scanner, and Random
import java.util.Scanner;

public class D_H_BandNamer {
  public static void main(String[] args) {
    //1.a) make scanner obj
    Scanner scanner = new Scanner(System.in);

    //2) Declare variables
    int numberOFBandNames;
    int incrementor = 0;
    String[] concatArray;

    //3) print line that explaining program
    System.out.println("This is Daniel Herrera's Band Namer Program!");

    //===============//
    // INPUT SECTION //
    //===============//
    //4) ask for amount of band names to see
    System.out.print("how many band names would you like to see? ");
    numberOFBandNames = scanner.nextInt();
    scanner.close(); // house keeping

    //5) create arrays using direct instantiation.
    String[] adjArray = {
        "Wild",
        "Crazy",
        "Idiotic",
        "Hot",
        "Cold",
        "Fast",
        "Slow",
        "Jumbo",
        "Tiny",
        "Medium"
    };

    String[] nounsArray = {
        "Cats",
        "Dogs",
        "Teachers",
        "Students",
        "Animals",
        "Peas",
        "Peppers",
        "Lemons",
        "Assassins",
        "Zombies",
        "Pinheads",
        "Bones"
    };

    //====================//
    // PROCESSING SECTION //
    //====================//
    System.out.println("Dan's randomly generated band names are: ");
    printConcatArray(adjArray,nounsArray,numberOFBandNames);

  }//end ===> main()

  /**
   * Method Name: printConcatArray()
   * Purpose: to print multiple
   * Accepts: String[] adjArray, String[] nounsArray, int numberOfBandNames
   * Returns: concatArray
   * Date: nov 8, 2018
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  private static void printConcatArray(String[] adjArray, String[] nounsArray, int numberOfBandNames) {
    String[] concatArray = new String[numberOfBandNames];

    for(int i = 0; i < concatArray.length; i++) {
      int random = (int)(Math.random() * adjArray.length);
      int random_2 = (int) (Math.random() * nounsArray.length);

      concatArray[i] = adjArray[random] + " " + nounsArray[random_2];
      System.out.println(concatArray[i]);
    }//end for
  }//end printConcatArray()

}//end Main class
