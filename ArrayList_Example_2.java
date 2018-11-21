/*
 * Project Name: ArrayList_Example_1.java
 * Purpose: this version is a type safetied / paramaterized Arraylist to store just string objects.
 *          this list will only accept String objects.
 *
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 10/31/2018 | Time: 2:35 PM
 */

//

package Arrays_Chp6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList_Example_2 {
  public static void main(String[] args) {
    //create it and type safety it
    ArrayList <String> groupList = new ArrayList<>();

    //check its size using size method()
    //(note) this returns the number of occupied elements. not the abs number.
    System.out.println("The current size of group is " + groupList.size());

    //add the names of some of the great bands of the 60's
    groupList.add("The Beatles");
    groupList.add("The Rolling Stones");
    System.out.println("The current size of group is " + groupList.size());

    groupList.add("The Birds");
    groupList.add("The Guess Who");
    groupList.add("Crosby, Stills and Nash");
    groupList.add("Buffalo Springfeild");
    groupList.add("The Turtles");
    groupList.add("Frankie Valli and the Four Seasons");
    groupList.add("Led Zepppelin");
    groupList.add("The Beach Boys");
    System.out.println("The current size of group is " + groupList.size());

    //OOPs! we forgot the Mamas and the Papas
    groupList.add("The Mamas and The Papas");  //the array list will automatically double in size.
    System.out.println("After adding M&P the current size is NOW: " + groupList.size());

    //print out the contents of the array list using a for:each loop, also
    System.out.println("\nThe great bands of the 60's");
    for (String band: groupList) {
      System.out.println(band);
    }//end foreach

    //same thing done using a regular for loop
    System.out.println("\nsame thing done using a regular for loop");
    for (int i=0; i < groupList.size(); i++) System.out.println(groupList.get(i));


  }//end main()   
}//end Main class
