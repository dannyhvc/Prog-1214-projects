/*
 * Project Name: MethoTesto.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/5/2018 | Time: 2:52 PM
 */
package MyProjects.shitterCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MethoTesto {
  public static void main(String[] args) throws FileNotFoundException {
    File file = new File
        ("C:\\Users\\DaniS\\OneDrive\\##Main_Use_Docs##\\INFO-1214\\" +
            "GRS's\\Ch 1\\INFO1214 Horstmann Ch 1-1 Reading Assignment .txt");
    Scanner sc = new Scanner(file);
    sc.useDelimiter("\\Z");
    System.out.println(sc.next());

  }//end main()

}//end Main class
