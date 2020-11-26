package project;

import java.lang.*;
import java.util.Scanner;
import java.util.*;



/**
* Class containing the main method.
*
* @author Adriana Solis
* @author Kevin Lee
* @author Gabe Schwartz
*/

public class Main {

  // add your implementation of the main method
  public static void main(String[] args) {
    final int VALUE_LOWER_LIMIT = 1;
    final int VALUE_MIDDLE_LIMIT = 2;
    final int VALUE_UPPER_LIMIT = 3;

    System.out.println("Welcome to \"Useful Tool for Spies\", a Cipher program!");
    System.out.println();
    System.out.println("Please choose your desired cipher from the available options below.");
    System.out.println();
    System.out.println("Cipher 1: Caesarian Cipher");
    System.out.println("Cipher 2: Vigenere Cipher");
    System.out.println("Cipher 3: Java Cipher");
    System.out.println();
    Scanner scanChoice = new Scanner(System.in);
    System.out.println("Enter \"1\", \"2\" or \"3\": ");
    System.out.println();
    int choiceEntry = scanChoice.nextInt();
    if (choiceEntry == VALUE_LOWER_LIMIT) {
      System.out.println();
      System.out.println("You have chosen the Caesarian Cipher!");
      System.out.println();
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter the message that you want to encrypt: ");
      String userInput = scanner.next();
      System.out.println();
      System.out.println("Please enter a shift value from 0-25: ");
      System.out.println();
      int shiftedValue = scanner.nextInt();
      System.out.println();
      CaesarianCipher encrypt = new CaesarianCipher();
      String encryptedMessages = encrypt.encryptedMessage(userInput, shiftedValue);
      System.out.println("Encrypted Text:");
      System.out.println(encryptedMessages);
      System.out.println();
      CaesarianCipher decrypt = new CaesarianCipher();
      String decryptedMessages = decrypt.decryptedMessage(encryptedMessages, shiftedValue);
      System.out.println("Decrypted Text:");
      System.out.println(decryptedMessages);
      scanner.close();
      System.out.println();
      System.out.print("Thank you for using \"Useful Tool for Spies\", a Cipher Program!");
      System.out.print(" Have a nice day!");

    } else if (choiceEntry == VALUE_MIDDLE_LIMIT) {
      System.out.println();
      System.out.println("You have chosen the Vigenere Cipher!");
    } else if (choiceEntry == VALUE_UPPER_LIMIT) {
      System.out.println();
      System.out.println("You have chosen the Java Cipher!");
    } else {
      System.out.println("Please try again with a valid choice.");
    }
  }

}
