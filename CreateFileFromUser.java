/*
 * Project Name: CreateFileFromUser.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/20/2018 | Time: 2:28 PM
 */
package File_IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreateFileFromUser
{

  public static void main(String[] args) throws IOException
  {
    FileWriter writer = new FileWriter(chooseFile());

    // Use your FileWriter
  }//end main()

  /**
   * Method Name: chooseFile()
   * Purpose: to create any file type of any name via user input
   * Accepts: nothing
   * Returns: File, create a file of name (ui) and type (ui).
   * Date: nov 20, 2018
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static File chooseFile()
  {
    String fname = null;
    File file = null;

    System.out.println("Please choose file name:");
    while (true)
    {
      try (Scanner in = new Scanner(System.in))
      {
        // Reads a single line from the console
        fname = in.nextLine();
        file = new File(fname);
        if (!file.createNewFile())
        {
          throw new RuntimeException("File already exist");
        }
        break;
      } catch (Exception ex)
      {
        System.out.println(ex.getMessage() + ", please try again:");
      }
    }
    return file;
  }//end chooseFile()
}//end -> class