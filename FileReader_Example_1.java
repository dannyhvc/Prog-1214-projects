/**
 * Program Name: FileReader_Example_1.java
 * Purpose: shows how to use a Scanner object to read in data from
 *         a text file.
 * Coder: Bill Pulling for Sec01
 * Date:Nov 16, 2018
 */
package File_IO;
import java.util.Scanner;
import java.io.*;
public class FileReader_Example_1
{

	public static void main(String[] args)throws FileNotFoundException
	{
		// Step 1: create a File object and pass it the name of the text file
		// that we want to read. 
		// We are using a relative path, so the file will have to located in
		// the project folder "File IO Ch7"
		
		File fileOne = new File("c:\\temp1\\SampleText1.txt");
		
		//Step 2: create the Scanner object and pass it the File object
		//        as an argument.
		
		//NOTE: this next line can throw a FileNotFoundException, so we need
		//       to "CONFESS" by including a throws clause on the method
		//       declaration.
		Scanner fileReader = new Scanner(fileOne);
		
		//Step 3:
		// Set up a while loop to read the contents of the file and print
		// them out. 
		
		while(fileReader.hasNext())
		{
			String word = fileReader.next();
			System.out.println(word);
		}//end loop
		
		System.out.println("End of program.");
		
		
		
	}
	//end main
}
//end class