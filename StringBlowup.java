//Created by: Adam Guettit
//Created on: Feb 22
// assignment 1B
// Mr. O'Hara  (ICS4U)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class StringBlowup {

  public static void main(String[] args) {

    // Replaces numbers in a string with the following character
    // multiplied by the number that was replaced.

    String orgString = "";
    String finalString = "";

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the string you want to be blown up: ");
    
    try {
      //Get user input
      orgString = reader.readLine();
    } catch (IOException noInput) {
      noInput.printStackTrace();
    }

    // Check each character in the string
    for (int character = 0; character < orgString.length() - 1; character++) {

      // Check if the selected character is a number
      if (Character.isDigit(orgString.charAt(character))) {

        // Duplicate the characters
        for (int repeat = 0; repeat < Character.getNumericValue(orgString.charAt(character)) 
            - 1; repeat++) {
          
          finalString = finalString + orgString.charAt(character + 1);
        }
      } else {
        finalString = finalString + orgString.charAt(character);
      }
    }

    //Check if last character needs to be removed
    if (Character.isLetter(orgString.charAt(orgString.length() - 1))) {
      finalString = finalString + orgString.charAt(orgString.length() - 1);
    }
    System.out.println("The blown up string is: " + finalString);
  }
}


