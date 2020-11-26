package project;

import java.util.Scanner;

/**
 * Class containing the Caesarian encryption and decryption method.
 *
 * @author Adriana Solis
 * @author Kevin Lee
 * @author Gabe Schwartz
 */

public class CaesarianCipher {
  /* value of the alphabet. */
  public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

  /* start of the encryption method for the user generated input. */
  public static String encryptedMessage(String input, int shifter) {
    // converts the input from the user to lowercase for simplicity
    input = input.toLowerCase();
    // initializing an empty string
    String output = "";
    // assigns an integer value to each letter of the alphabet
    for (int i = 0; i < input.length(); i++) {
      int value = alphabet.indexOf(input.charAt(i));

      // finds out what the value of the shift is
      int shiftValue = (shifter + value) % 26;
      // finds out what character needs to be replaced
      char replacedValue = alphabet.charAt(shiftValue);
      // adding this to the output
      output = output + replacedValue;
    }
    return output.toString();
  }
  /* start of the decryption method from the user generated input */
  public static String decryptedMessage(String output, int shifter) {
    // converst the output into lowercase for simplicity
    output = output.toLowerCase();
    // initializes an empty String
    String input = "";

    for (int i = 0; i < output.length(); i++) {
      int value = alphabet.indexOf(output.charAt(i));
      int shiftValue = (value - shifter) % 26;
      // adding this if statement in case there are any negatives
      if (shiftValue < 0) {
        shiftValue = alphabet.length() + value;
      }
      // shows the character that is being replaced
      char replacedValue = alphabet.charAt(shiftValue);
      input = input + replacedValue;
    }
    return input.toString();
  }
}
