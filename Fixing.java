/*
 * Project Name: Fixing.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/16/2018 | Time: 1:21 PM
 */
package MyProjects.shitterCode2;

public class Fixing {
  public static void main(String[] args) {
    String decipheredText = "";
    String decipheredText_output;
    String inputText = "EBO";
    int shift = 1;
    boolean key = true;

    //loop section for decyphering.
    for(int i = 0; i < inputText.length(); i++){
      //cycles all chars to the left of shift.
      char c = (char)(inputText.charAt(i) - shift);
      if (c > 'z') {
        decipheredText += (char) (inputText.charAt(i) + (26 + shift));
      } else {
        decipheredText += (char)(inputText.charAt(i) - shift);
      }//end if
    }//end for

    // replaces the space box in unicode with a space.
    decipheredText_output = decipheredText.replace("\u001F", " ").toUpperCase();

    if (key) {
      System.out.println("\nThe ciphertext and deciphered plaintext are as follows:");
      System.out.println(decipheredText_output);
      System.out.println(inputText.toUpperCase() + "\n");
    }

  }//end main()   
}//end Main class
