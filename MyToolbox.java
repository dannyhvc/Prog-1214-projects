package Methods_Chp6;// standard method documentation header that should appear at the top of each method

public class MyToolbox
{
//*******************************//
// PrintArrayContents(1) Section //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//*******************************//
  /**
   * Method Name: printArrayContents
   * Purpose: a public class method that will print out the contents of an array.
   * with a max of 10 values per line.
   * Accepts: an array of type int.
   * Returns: void
   * Date: nov 7, 2018.
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static void printArrayContents(int[] array)
  {
    for (int i = 0; i < array.length; i++)
    {
      ////limit output
      if (i % 10 == 0)
      {
        System.out.println(); //prints a blank line
      }//end if

      System.out.print(array[i] + " ");
    }//end for
    System.out.println();//for spacing.
  }//end ====> printArrayContents method

  /**
   * Method Name: printArrayContents
   * Purpose: a public class method that will print out the contents of an array.
   * with a max of 10 values per line.
   * Accepts: an array of type double.
   * Returns: void
   * Date: nov 7, 2018.
   * Coder: Daniel Herrera (0881570) for section 02.
   * <p>
   * IMPORTANT CONCEPT: Uses method overloading.
   * * a method signature is a combination of a method name and
   * the @param list.
   * * the method signature must be unique to each method.
   */
  public static void printArrayContents(double[] array)
  {
    for (int i = 0; i < array.length; i++)
    {
      ////limit output
      if (i % 10 == 0)
      {
        System.out.println(); //prints a blank line
      }//end if

      System.out.print(array[i] + " ");
    }//end for
    System.out.println();//for spacing.
  }//end ====> printArrayContents method

  /**
   * Method Name: printArrayContents
   * Purpose: a public class method that will print out the contents of an array.
   * with a max of 10 values per line.
   * Accepts: an array of type char.
   * Returns: void
   * Date: nov 7, 2018.
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static void printArrayContents(char[] array)
  {
    for (int i = 0; i < array.length; i++)
    {
      ////limit output
      if (i % 10 == 0)
      {
        System.out.println(); //prints a blank line
      }//end if

      System.out.print(array[i] + " ");
    }//end for
    System.out.println();//for spacing.
  }//end ====> printArrayContents method

  /**
   * Method Name: printArrayContents
   * Purpose: a public class method that will print out the contents of an array.
   * with a max of 10 values per line.
   * Accepts: an array of type String.
   * Returns: void
   * Date: nov 7, 2018.
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static void printArrayContents(String[] array)
  {
    for (int i = 0; i < array.length; i++)
    {
      ////limit output
      if (i % 10 == 0)
      {
        System.out.println(); //prints a blank line
      }//end if

      System.out.print(array[i] + " ");
    }//end for
    System.out.println();//for spacing.
  }//end ====> printArrayContents method


//******************************//
// PrintArrayContents(2) Section//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//******************************//
  /**
   * Method Name: printArrayContents
   * Purpose: a public class method that will print out the contents of an array.
   * with a max of valuesPerLine.
   * Accepts: an array of type int.
   * Returns: void
   * Date: nov 7, 2018.
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static void printArrayContents(int[] array, int valuesPerLine)
  {
    for (int i = 0; i < array.length; i++)
    {
      ////limit output to valuesPerLine
      if (i % valuesPerLine == 0)
      {
        System.out.println(); //prints a blank line
      }//end if

      System.out.print(array[i] + " ");
    }//end for
    System.out.println();//for spacing.
  }//end ====> printArrayContents method

  /**
   * Method Name: printArrayContents OVERLOADED version with valuesPer <br>
   * Purpose: a public class method that will print out the contents of an array.
   * with a max of valuesPerLine.<br>
   * Accepts: an array of type double.<br>
   * Returns: void<br>
   * Date: nov 7, 2018.
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static void printArrayContents(double[] array, int valuesPerLine)
  {
    for (int i = 0; i < array.length; i++)
    {
      ////limit output to valuesPerLine
      if (i % valuesPerLine == 0)
      {
        System.out.println(); //prints a blank line
      }//end if

      System.out.print(array[i] + " ");
    }//end for
    System.out.println();//for spacing.
  }//end ====> printArrayContents method

  /**
   * Method Name: printArrayContents OVERLOADED version with valuesPer <br>
   * Purpose: a public class method that will print out the contents of an array.
   * with a max of valuesPerLine.<br>
   * Accepts: an array of type char.<br>
   * Returns: void<br>
   * Date: nov 7, 2018.
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static void printArrayContents(char[] array, int valuesPerLine)
  {
    for (int i = 0; i < array.length; i++)
    {
      ////limit output to valuesPerLine
      if (i % valuesPerLine == 0)
      {
        System.out.println(); //prints a blank line
      }//end if

      System.out.print(array[i] + " ");
    }//end for
    System.out.println();//for spacing.
  }//end ====> printArrayContents method

  /**
   * <h1>Method Name:</h1> printArrayContents OVERLOADED version with valuesPer <br>
   * <h1>Purpose:</h1> a public class method that will print out the contents of an array.
   * with a max of valuesPerLine.<br>
   * <h1>Accepts:</h1> an array of type String.<br>
   * <h1>Returns:</h1> void<br>
   * <h1>Date:</h1> nov 7, 2018.
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static void printArrayContents(String[] array, int valuesPerLine)
  {
    for (int i = 0; i < array.length; i++)
    {
      ////limit output to valuesPerLine
      if (i % valuesPerLine == 0)
      {
        System.out.println(); //prints a blank line
      }//end if

      System.out.print(array[i] + " ");
    }//end for
    System.out.println();//for spacing.
  }//end ====> printArrayContents method


//*****************************//
// sumArrayContents(1) Section //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//*****************************//
  /**
   * Method Name: sumArrayContents
   * Purpose: a public class method that sum up the values in a numeric type array
   * Accepts: an array of type int
   * Returns: an int that is the sum of all the values in the array
   * Date: nov 12, 2018.
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static int sumArrayContents(int[] intArray)
  {
    int sum = 0;
    for (int i = 0; i < intArray.length; i++)
    {
      sum += intArray[i];
    }//end for
    return sum;
  }//end sumArrayContents()

  /**
   * Method Name: sumArrayContents
   * Purpose: a public class method that sum up the values in a numeric type array
   * Accepts: an array of type double
   * Returns: a double that is the sum of all the values in the array
   * Date: nov 12, 2018.
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static double sumArrayContents(double[] doubleArray)
  {
    double sum = 0;
    for (int i = 0; i < doubleArray.length; i++)
    {
      sum += doubleArray[i];
    }//end for
    return sum;
  }//end sumArrayContents()

  /**
   * Method Name: calcArrayAverage()
   * Purpose: public class method to calculate the average values in a numeric array
   * Accepts: an array of type int.
   * Returns: a double value as the average
   * Date: nov 12, 2018
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static double calcArrayAverage(int[] intArray)
  {
    //casting array.length to double to avoid integer division.
    return sumArrayContents(intArray) / (double) intArray.length;
  }//end calcArrayAverage()

  /**
   * Method Name: calcArrayAverage()
   * Purpose: public class method to calculate the average values in a numeric array
   * Accepts: an array of type double.
   * Returns: a double value as the average
   * Date: nov 12, 2018
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static double calcArrayAverage(double[] doubleArray)
  {
    return sumArrayContents(doubleArray) / doubleArray.length;
  }//end calcArrayAverage()


//**********************//
// copyArray(1) Section //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//**********************//
  /**
   * Method Name: copyArray()
   * Purpose: public class method that copies an array so that the order of the values in the original can remain
   * unchanged while we work on the copy.
   * Accepts: an array of type int.
   * Returns: an array of type int that is a copy of the original
   * Date: nov 12, 2018.
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static int[] copyArray(int[] array)
  {
    //create of same type an length.
    int[] copiedArray = new int[array.length];
    //loop to copy old to new
    for (int i = 0; i < array.length; i++)
    {
      copiedArray[i] = array[i];
    }//end for
    return copiedArray;
  }// end copyArray()

  /**
   * Method Name: copyArray()
   * Purpose: public class method that copies an array so that the order of the values in the original can remain
   * unchanged while we work on the copy.
   * Accepts: an array of type int.
   * Returns: an array of type int that is a copy of the original
   * Date: nov 12, 2018.
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static double[] copyArray(double[] array)
  {
    //create of same type an length.
    double[] copiedArray = new double[array.length];
    //loop to copy old to new
    for (int i = 0; i < array.length; i++)
    {
      copiedArray[i] = array[i];
    }//end for
    return copiedArray;
  }// end copyArray()

  /**
   * Method Name: copyArray()
   * Purpose: public class method that copies an array so that the order of the values in the original can remain
   * unchanged while we work on the copy.
   * Accepts: an array of type int.
   * Returns: an array of type int that is a copy of the original
   * Date: nov 12, 2018.
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static char[] copyArray(char[] array)
  {
    //create of same type an length.
    char[] copiedArray = new char[array.length];
    //loop to copy old to new
    for (int i = 0; i < array.length; i++)
    {
      copiedArray[i] = array[i];
    }//end for
    return copiedArray;
  }// end copyArray()

  /**
   * Method Name: copyArray()
   * Purpose: public class method that copies an array so that the order of the values in the original can remain
   * unchanged while we work on the copy.
   * Accepts: an array of type int.
   * Returns: an array of type int that is a copy of the original
   * Date: nov 12, 2018.
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static String[] copyArray(String[] array)
  {
    //create of same type an length.
    String[] copiedArray = new String[array.length];
    //loop to copy old to new
    for (int i = 0; i < array.length; i++)
    {
      copiedArray[i] = array[i];
    }//end for
    return copiedArray;
  }// end copyArray()


//***************************//
// calcArrayMedian() Section //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//***************************//
  /**
   * Method Name: calcArrayMedian()
   * Purpose: public class method that calculates the median value in an array
   * Accepts: an array of type int
   * Returns: a double that is the median value of the array
   * Date: nov 14, 2018
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static double calcArrayMedian(int[] array)
  {
    //step 1: make a copy of the array and do the transformation on the copy.
    int[] copiedArray = copyArray(array);

    //step 2: sort the array using the fully qualified path name to get
    //        access to the Arrays class method sort()
    java.util.Arrays.sort(copiedArray);//(note) no var needed for a return value because the real McCoy is
    //       is sent and sorted in memory.
    //step 3: clac the median
    //        Need to find out if it has en even or odd number
    if (copiedArray.length % 2 == 0)
    {
      //it has an even number of elements
      int rightMiddleElementIndex = copiedArray.length / 2;
      int leftMiddleElementIndex = rightMiddleElementIndex - 1;

      //add the 2 alues at these indexes and divide by 2 to get the median
      double median = (copiedArray[rightMiddleElementIndex] + copiedArray[leftMiddleElementIndex]) / (double) 2;
      return median;

    } else
    {
      //it has an odd number of elements
      return copiedArray[copiedArray.length / 2];
    }
  }//end calcArrayMedian

  /**
   * Method Name: calcArrayMedian()
   * Purpose: public class method that calculates the median value in an array
   * Accepts: an array of type int
   * Returns: a double that is the median value of the array
   * Date: nov 14, 2018
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static double calcArrayMedian(double[] array)
  {
    double[] copiedArray = copyArray(array);
    java.util.Arrays.sort(copiedArray);//(note) no var needed for a return value because the real McCoy is

    if (copiedArray.length % 2 == 0)
    {
      //it has an even number of elements
      int rightMiddleElementIndex = copiedArray.length / 2;
      int leftMiddleElementIndex = rightMiddleElementIndex - 1;

      //add the 2 values at these indexes and divide by 2 to get the median
      double median = (copiedArray[rightMiddleElementIndex] + copiedArray[leftMiddleElementIndex]) / (double) 2;
      return median;

    } else
    {
      //it has an odd number of elements
      return copiedArray[copiedArray.length / 2];
    }
  }//end calcArrayMedian

  /**
   * Method Name: calcArrayMedian()
   * Purpose: public class method that calculates the median value in an array
   * Accepts: an array of type String
   * Returns: a String that is the median value of the array
   * Date: nov 14, 2018
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static String calcArrayMedian(String[] array)
  {
    //step 1: make a copy of the array and do the transformation on the copy.
    String[] copiedArray = copyArray(array);

    //step 2: sort the array using the fully qualified path name to get
    //        access to the Arrays class method sort()
    java.util.Arrays.sort(copiedArray);//(note) no var needed for a return value because the real McCoy is
    //       is sent and sorted in memory.
    //step 3: clac the median
    //        Need to find out if it has en even or odd number
    if (copiedArray.length % 2 == 0)
    {
      //it has an even number of elements
      int rightMiddleElementIndex = copiedArray.length / 2;
      int leftMiddleElementIndex = rightMiddleElementIndex - 1;

      //concatenate the 2 median string values
      String median = copiedArray[rightMiddleElementIndex] + " & " + copiedArray[leftMiddleElementIndex];
      return median;

    } else
    {
      //it has an odd number of elements
      return copiedArray[copiedArray.length / 2];
    }
  }//end calcArrayMedian

//****************************//
// convertFahrToCel() Section //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//****************************//
  /**
   * Method Name: convertFahrToCel
   * Purpose: public class method that converts a fahrenheit temp to its Celsius equivalent
   * Accepts: a double that is fahrenheit temp
   * Returns: a double that is equal temp in celsius
   * Date: nov 14, 2018
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static double convertFahrToCel(double fahrTemp)
  {
    return (double) 5 / 9 * (fahrTemp - 32);
  }//end convertFahrToCel


//******************************//
// swapArrayElements(3) Section //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//******************************//
  /**
   * Method Name: swapArrayElements()
   * Purpose: a public class mehtod that will swap the values of any two elements
   *          in an array
   * Accepts: an array of type int and two int argss that rep the index number of the 2
   * Returns:
   * Date:
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static void swapArrayElements(int[] array, int index1, int index2)
  {
    int emptyGlass;
    //pour 1;
    emptyGlass = array[index1];
    //pour 2
    array[index1] = array[index2];
    //pour 3
    array[index2] = emptyGlass;
  }//end swapArrayElements

  /**
   * Method Name: swapArrayElements()
   * Purpose: a public class mehtod that will swap the values of any two elements
   *          in an array
   * Accepts: an array of type int and two int argss that rep the index number of the 2
   * Returns:
   * Date:
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static void swapArrayElements(double[] array, int index1, int index2)
  {
    double emptyGlass;
    //pour 1;
    emptyGlass = array[index1];
    //pour 2
    array[index1] = array[index2];
    //pour 3
    array[index2] = emptyGlass;
  }//end swapArrayElements

  /**
   * Method Name: swapArrayElements()
   * Purpose: a public class mehtod that will swap the values of any two elements
   *          in an array
   * Accepts: an array of type int and two int argss that rep the index number of the 2
   * Returns:
   * Date:
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static void swapArrayElements(char[] array, int index1, int index2)
  {
    char emptyGlass;
    //pour 1;
    emptyGlass = array[index1];
    //pour 2
    array[index1] = array[index2];
    //pour 3
    array[index2] = emptyGlass;
  }//end swapArrayElements

  /**
   * Method Name: swapArrayElements()
   * Purpose: a public class mehtod that will swap the values of any two elements
   *          in an array
   * Accepts: an array of type int and two int argss that rep the index number of the 2
   * Returns:
   * Date:
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static void swapArrayElements(String[] array, int index1, int index2)
  {
    String emptyGlass;
    //pour 1;
    emptyGlass = array[index1];
    //pour 2
    array[index1] = array[index2];
    //pour 3
    array[index2] = emptyGlass;
  }//end swapArrayElements


//*********************************//
// reverseArrayElements(1) Section //~~~~ returns ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//*********************************//
  /**
   * Method Name: reverseArrayElements()
   * Purpose: public class method that will reverse the order of values in the elements of the submitted array
   * Accepts: int[] array
   * Returns: int[] array in reverse order
   * Date: nov 19, 2018
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static int[] reverseArrayElements(int[] array)
  {
    //step 1: make a copy of the array
    int[] copiedArray = copyArray(array);

    //step 2: use a for loop and assign values from from the original to the copy in reverse order.
    for(int i=0; i < array.length; i++)
    {
      copiedArray[i] = array[(array.length - 1) - i]; // elegant piece of code
    }//end for

    return copiedArray;
  }//end reverseArrayElements()

  /**
   * Method Name: reverseArrayElements()
   * Purpose: public class method that will reverse the order of values in the elements of the submitted array
   * Accepts: double[] array
   * Returns: double[] array in reverse order
   * Date: nov 19, 2018
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static double[] reverseArrayElements(double[] array)
  {
    //step 1: make a copy of the array
    double[] copiedArray = copyArray(array);

    //step 2: use a for loop and assign values from from the original to the copy in reverse order.
    for(int i=0; i < array.length; i++)
    {
      copiedArray[i] = array[(array.length - 1) - i]; // elegant piece of code
    }//end for

    return copiedArray;
  }//end reverseArrayElements()

  /**
   * Method Name: reverseArrayElements()
   * Purpose: public class method that will reverse the order of values in the elements of the submitted array
   * Accepts: char[] array
   * Returns: char[] array in reverse order
   * Date: nov 19, 2018
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static char[] reverseArrayElements(char[] array)
  {
    //step 1: make a copy of the array
    char[] copiedArray = copyArray(array);

    //step 2: use a for loop and assign values from from the original to the copy in reverse order.
    for(int i=0; i < array.length; i++)
    {
      copiedArray[i] = array[(array.length - 1) - i]; // elegant piece of code
    }//end for

    return copiedArray;
  }//end reverseArrayElements()

  /**
   * Method Name: reverseArrayElements()
   * Purpose: public class method that will reverse the order of values in the elements of the submitted array
   * Accepts: String[] array
   * Returns: String[] array in reverse order
   * Date: nov 19, 2018
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static String[] reverseArrayElements(String[] array)
  {
    //step 1: make a copy of the array
    String[] copiedArray = copyArray(array);

    //step 2: use a for loop and assign values from from the original to the copy in reverse order.
    for(int i=0; i < array.length; i++)
    {
      copiedArray[i] = array[(array.length - 1) - i]; // elegant piece of code
    }//end for

    return copiedArray;
  }//end reverseArrayElements()


//*********************************//
// reverseArrayElements(1) Section //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//*********************************//
  /**
   * Method Name: reverseArrayElementsVersion2()
   * Purpose: public class method that will reverse the order of values in the elements of the submitted array
   * Accepts: int[] array
   * Returns: nothing! void method! this version works on the real McCoy.
   * Date: nov 19, 2018
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static void reverseArrayElementsVersion2(int[] array)
  {
    // loop had to run array,length/2 times to do the necessary swaps.
    for (int i = 0; i < array.length / 2; i++)
    {
      //call the swapArrayElementsMethod
      swapArrayElements(array, i, (array.length - 1) - i);// more elegant code
    }//end for
  }//end reverseArrayElementsVersion2()

  /**
   * Method Name: reverseArrayElementsVersion2()
   * Purpose: public class method that will reverse the order of values in the elements of the submitted array
   * Accepts: double[] array
   * Returns: nothing! void method! this version works on the real McCoy.
   * Date: nov 19, 2018
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static void reverseArrayElementsVersion2(double[] array)
  {
    // loop had to run array,length/2 times to do the necessary swaps.
    for (int i = 0; i < array.length / 2; i++)
    {
      //call the swapArrayElementsMethod
      swapArrayElements(array, i, (array.length - 1) - i);// more elegant code
    }//end for
  }//end reverseArrayElementsVersion2()

  /**
   * Method Name: reverseArrayElementsVersion2()
   * Purpose: public class method that will reverse the order of values in the elements of the submitted array
   * Accepts: char[] array
   * Returns: nothing! void method! this version works on the real McCoy.
   * Date: nov 19, 2018
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static void reverseArrayElementsVersion2(char[] array)
  {
    // loop had to run array,length/2 times to do the necessary swaps.
    for (int i = 0; i < array.length / 2; i++)
    {
      //call the swapArrayElementsMethod
      swapArrayElements(array, i, (array.length - 1) - i);// more elegant code
    }//end for
  }//end reverseArrayElementsVersion2()

  /**
   * Method Name: reverseArrayElementsVersion2()
   * Purpose: public class method that will reverse the order of values in the elements of the submitted array
   * Accepts: String[] array
   * Returns: nothing! void method! this version works on the real McCoy.
   * Date: nov 19, 2018
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static void reverseArrayElementsVersion2(String[] array)
  {
    // loop had to run array,length/2 times to do the necessary swaps.
    for (int i = 0; i < array.length / 2; i++)
    {
      //call the swapArrayElementsMethod
      swapArrayElements(array, i, (array.length - 1) - i);// more elegant code
    }//end for
  }//end reverseArrayElementsVersion2()


//********************//
// Palindrome Section //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//********************//
  /**
   * Method Name: isPalindromicWord()
   * Purpose: public class method that determines if the submitted word is a palindrome.
   * Accepts: accepts String arg to be tested
   * Returns: a boolean true if the word it palindromic, false if not.
   * Date: nov 19, 2018.
   * Coder: Daniel Herrera (0881570) for section 02.
   */
  public static boolean isPalindromicWord(String word)
  {
    //step 0: harmonize the letter case.
    word = word.toUpperCase(); // (note) toUpperCase() returns a values /\ you must catch it.
    //step 1: create a char array from the String.
    char[] charArray = word.toCharArray();
    //step 2:reverse the order of the array using reverseArrayElementsVersion2()
    reverseArrayElementsVersion2(charArray);
    //step 3:
    String reversedString = new String(charArray);
    //step 4:
    if(word.equals(reversedString))
    {
      return true;
    }
    else
    {
      return false;
    }//end if-else[]
  }//end isPalindromicWord()

  /**
   * Method Name: isPalindromicWord()
   * Purpose: public class method that
   * Accepts:
   * Returns:
   * Date:
   * Coder: Daniel Herrera (0881570) for section 02.
   */


}//end Main class *===**===* *===**===* *===**===* *===**===* *===**===* *===**===* *===**===* *===**===* *===**===* *=*

// standard method documentation header that should appear at the top of each method
/**
 * Method Name:
 * Purpose:
 * Accepts:
 * Returns:
 * Date:
 * Coder: Daniel Herrera (0881570) for section 02.
 */