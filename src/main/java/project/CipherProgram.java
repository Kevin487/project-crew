package project;

import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.util.*;

/**
* Class containing the main method.
*
* @author Adriana Solis
* @author Kevin Lee
* @author Gabe Schwartz
*/
public class CipherProgram {

  // add your implementation of the main method

  /**
  * @param args
  */
  public static void main(String[] args) {

    final int VALUE_LOWER_LIMIT = 1;
    final int VALUE_MIDDLE_LIMIT = 2;
    final int VALUE_UPPER_LIMIT = 3;

    System.out.println("Welcome to \"Useful Tool for Spies\", a Cipher program!\n");
    System.out.println("Please choose your desired cipher from the available options below.\n");
    System.out.println("Cipher 1: Caesarian Cipher");
    System.out.println("Cipher 2: Vigenere Cipher");
    System.out.println("Cipher 3: Java Cipher\n");
    Scanner scanChoice = new Scanner(System.in);
    System.out.println("Enter \"1\", \"2\" or \"3\": \n");
    int choiceEntry = scanChoice.nextInt();
    if (choiceEntry == VALUE_LOWER_LIMIT) {
      System.out.println("\nYou have chosen the Caesarian Cipher!\n");
      Scanner scanner = new Scanner(System.in);
      char password[] = null;
      try {
        password = PasswordField.getPassword(System.in, "Please enter your message: \n");
      } catch(IOException ioe) {
        ioe.printStackTrace();
      }
      if (password == null) {
        System.out.println("\nNo message was entered.");
      } else {
        System.out.println("\nPlease enter a shift value from 0-26: \n");
        int shiftedValue = scanner.nextInt();
        System.out.println("\nEncrypting your message...");
        CaesarianCipher encrypt = new CaesarianCipher();
        String userInput = String.valueOf(password);
        String encryptedMessages = encrypt.encryptedMessage(userInput, shiftedValue);
        System.out.println("\nEncrypted Text: \n");
        System.out.println(encryptedMessages);
        System.out.println("\nPress any character to view your decrypted message. \n");
        String dval = scanner.nextLine();
        String userInput2 = scanner.nextLine();
        CaesarianCipher decrypt = new CaesarianCipher();
        String decryptedMessages = decrypt.decryptedMessage(encryptedMessages, shiftedValue);
        System.out.println("\nDecrypted Text: \n");
        System.out.println(decryptedMessages);
        scanner.close();
        System.out.println("\nThank you for using \"Useful Tool for Spies\", a Cipher Program!");
        System.out.println("Have a nice day!");
      }
    } else if (choiceEntry == VALUE_MIDDLE_LIMIT) {
      System.out.println("\nYou have chosen the Vigenere Cipher!\n");
      Scanner scanner = new Scanner(System.in);
      char password2[] = null;
      try {
        password2 = PasswordField.getPassword(System.in, "Please enter your message: \n");
      } catch(IOException ioe) {
        ioe.printStackTrace();
      }
      if (password2 == null) {
        System.out.println("\nNo message was entered.");
      } else {
        System.out.println("\nPlease enter your desired word to use as your key.\n");
        String key2 = scanner.nextLine();
        System.out.println("\nEncrypting your message...");
        VigenereCipher vigenereMessage = new VigenereCipher();
        String messageFromUser = String.valueOf(password2);
        String encryptionOfMessage = vigenereMessage.encryptInput(messageFromUser, key2);
        System.out.println("\nEncrypted Text: \n");
        System.out.println(encryptionOfMessage);
        System.out.println("\nPress any character to view your decrypted message.\n");
        String dval = scanner.nextLine();
        VigenereCipher vigenereMessage2 = new VigenereCipher();
        String decryptionMessage = vigenereMessage2.decryptOutput(encryptionOfMessage, key2);
        System.out.println("\nDecrypted Message: \n");
        System.out.println(decryptionMessage);
        System.out.print("\nThank you for using \"Useful Tool for Spies\", a Cipher Program!");
        System.out.print(" Have a nice day!");
      }
    } else if (choiceEntry == VALUE_UPPER_LIMIT) {
      System.out.println("\nYou have chosen the Java Cipher!");
    } else {
      System.out.println("\nPlease try again with a valid choice.");
    }
  }
}
