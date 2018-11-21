package File_IO;
/**
 * Program Name: FileWriter_Example_1.java
 * Purpose: shows how to create and use a PrintWriter object to write text to a file
 * Coder: Bill Pulling for Sec01
 * Date:Nov 16, 2018
 */
import java.util.Scanner;
import java.io.*;
public class FileWriter_Example_1
{

	public static void main(String[] args) throws FileNotFoundException
	{
		// create Scanner and prompt user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line of text that you want to save in the file: ");
		String text = input.nextLine();
		
		//create a File object to hold our path name to pass to the PrintWriter object
		File outputFile = new File("meow.bat");
		
		//create the PrintWriter object and pass it the file object
		//NOTE: this next line will actually create the empty file on the disk
		PrintWriter writer = new PrintWriter(outputFile);
		
		//call the write methodand pass it the text to be written to the file		
		writer.write(text);
		
		//VERY IMPORTANT> No text will be written to the file until we
		// close the PrintWriter object
		writer.close(); //closes the stream, and writes the text in the buffer 
		               //to the file.
	}
	//end main
}
//end class