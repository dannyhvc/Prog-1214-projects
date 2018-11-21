/*
 * Project Name: sectionBanner.java
 * Purpose: makes banners to input in production class code.
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 11/8/2018 | Time: 5:58 PM
 */
package MyProjects.shitterCode2;
import java.util.Scanner;

public class sectionBanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Declare variables
    String  bannerName;

    // Explanation section
    System.out.print("Enter the name of the banner: ");

    //===============//
    // INPUT SECTION //
    //===============//
    bannerName = scanner.nextLine();

    //====================//
    // PROCESSING SECTION //
    //********************//
    makeSideTopChars(bannerName);

  }//end main()

  private static void makeSideTopChars(String bannerName) {
    System.out.print("//*"); makeBannerChars(bannerName); System.out.print("*//\n");
    System.out.print("// " + bannerName + " //\n");
    System.out.print("//*"); makeBannerChars(bannerName); System.out.print("*//\n");
  }

  private static void makeBannerChars(String bannerName) {
    for(int i=0; i<bannerName.length(); i++) {
      System.out.print("*");
    }//end makeBannerChars()
  }


}//end Main class
