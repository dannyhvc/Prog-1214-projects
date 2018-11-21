/*
 * Project Name: D_H_BusFare.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 02
 * Date: 10/26/2018 | Time: 12:11 PM
 */

package MyProjects.shitterCode;

import javax.swing.*;
import java.util.Scanner;

public class D_H_BusFare {
  public static void main(String[] args) {
    //explanation to the user.
    System.out.println("This is a bus fare program");

    //creates a scanner
    Scanner in = new Scanner(System.in);

    //inputs sections.
    System.out.println("how many on the waiting list?: ");
    int waitingList = in.nextInt();

    System.out.println("How many seats on the coach?: ");
    int numberOfSeats = in.nextInt();

    System.out.println("How many drivers?: ");
    int availableDrivers = in.nextInt();
    in.nextLine();//clear buffer

    System.out.println("What the name of the company?: ");
    String companyName = in.nextLine();
    in.close();//house keeping.

    //processing
    if ((double) waitingList % numberOfSeats >= (double) numberOfSeats / 2) {
      int result = waitingList / numberOfSeats + 1;
      Drivers(result, availableDrivers, numberOfSeats);

    } else {
      int result = waitingList / numberOfSeats;
      Drivers(result, availableDrivers, numberOfSeats);
    }

  }//end main()

  //method makes sure that there is a sufficient amount of drivers with respect to the amount of coaches.
  private static void Drivers(int a, int b, int c) {
    int totalSeats = a * c;

    if (a > b) {
      System.out.println("Error 101: Sorry not enough driver. Trip cannot be completed.");

    } else {
      System.out.println("Total seats in the trip: " + totalSeats);
      guiOutput(a);

    }//end if-else[]

  }//end main()

  private static void guiOutput(int a2) {
    JFrame frame = new JFrame("JFrame demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(320, 240);//240p

    //creates a panel
    JPanel jPanel = new JPanel();

    //creates jlable1
    JLabel jLabel1 = new JLabel();
    jLabel1.setText("Num of Coaches: " + a2);
    jLabel1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
    jPanel.add(jLabel1);

    //adds the panel to the gui and makes it visible to the user.
    frame.add(jPanel);
    frame.setVisible(true);

  }//end guiOutput

}//end Main class
