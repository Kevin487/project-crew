package project;

import java.util.Scanner;

/**
* Class containing the Vigenere encryption and decryption method.
*
* @author Adriana Solis
* @author Kevin Lee
* @author Gabe Schwartz
*/
public class JavaCipher {

  // initialzing the variables

  /* the message from the user that will be encrypted. */
  private String input;

  /* the message from the user that will be decrypted. */
  private String output;

  /* the key that is used to decrypt the output. */
  private String key;

  /* declares the alphabet which will be used to encrypt/decrypt the message */
  public static final String alphabetUppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  public static final String alphabetLowercase = "abcdefghijklmnopqrstuvwxyz";

  // ENCRYPTION PART OF THE CODE

  /**
  * Uses the Vigenere Cipher to encrypt the message from the user.
  * @return the encrypted message.
  **/
  public static String encryptInput(String input, String key) {
    String output = "";
    input = input.toLowerCase();
    key = key.toLowerCase();
    // the current character that is being encrypted
    char current;

    // the current character used for the key
    char keyCurrent;

    // the index of the current character in the Key
    int placeOfKey = 0;

    // the amount of the shift according to the corresponding letter
    int shifter = 0;

    // where the current letter is in terms of the alphabet
    int placeOfLetter = 0;

    // where the cipher designates that the letter starts at in the alphabet
    int placeOfCipher = 0;

    for(int i = 0; i < input.length(); i++) {
      current = input.charAt(i);
      //the current letter being encrypted.
      keyCurrent = key.charAt(placeOfKey);
      //the current letter in the Key being used.

      // if indexOf() doesn't find the char, it returns -1 as the index.
      if(alphabetUppercase.indexOf(current) > -1) //if the plaintext letter is uppercase
      {
        shifter = alphabetLowercase.indexOf(keyCurrent);
        placeOfLetter = alphabetUppercase.indexOf(current);
        placeOfCipher = placeOfLetter + shifter; //shift it to another uppercase letter
        if(placeOfCipher > 25) //if it gets shifted outside of the alphabet
        {
          placeOfCipher = placeOfCipher - 26; //loop it back to the beginning of the alphabet
        }
        output += alphabetUppercase.charAt(placeOfCipher); //add the encrypted letter to the output string
      }
      else if(alphabetLowercase.indexOf(current) > -1) //if the plaintext letter is lowercase
      {
        shifter = alphabetLowercase.indexOf(keyCurrent);
        placeOfLetter = alphabetLowercase.indexOf(current);
        placeOfCipher = placeOfLetter + shifter; //shift it to another uppercase letter
        if(placeOfCipher > 25) //if it gets shifted outside of the alphabet
        {
          placeOfCipher = placeOfCipher - 26; //loop it back to the beginning of the alphabet
        }
        output += alphabetLowercase.charAt(placeOfCipher); //add the encrypted letter to the output string
      }
      else //if the plaintext letter is not a letter.
      {
        placeOfKey--; //don't increase the place in the password. (negates increasing it later.)
        output += current;
      }
      placeOfKey++; //go to the next letter in the password.
      if(placeOfKey >= key.length()) { placeOfKey = 0; } //loop back to the first letter of the password if the end has been reached.
    }
    return output.toString();
  }

  public class CaesarianCipher {

    /* value of the alphabet. */
    public static final String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789 ";

    /* start of the encryption method for the user generated input. */
    public static String encryptedMessage(String input, int shifter) {

      // converts the input from the user to lowercase for simplicity
      input = input.toLowerCase();

      // initializing an empty string
      String output = "";

      // assigns an integer value to each letter of the alphabet
      for (int i = 0; i < input.length(); i++) {

        char encrypt = input.charAt(i);
        int value = alphabet.indexOf(encrypt);

        // finds out what the value of the shift is
        int shiftValue = (shifter + value) % alphabet.length();

        // finds out what character needs to be replaced
        char replacedValue = alphabet.charAt(shiftValue);

        // adding this to the output
        output += replacedValue;
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

        char decrypt = output.charAt(i);
        int val = alphabet.indexOf(decrypt);

        int val2 = (val - shifter) % alphabet.length();

        if (val2 < 0) {
          val2 += Math.abs(alphabet.length());
        }
        char val3 = alphabet.charAt(val2);
        input += val3;
      }
      return input.toString();
    }
  }

  // DECRYPTION PART OF THE CIPHER

  /**
  * Uses the Vigenere Cipher to decrypt the output.
  * @return the decrypted message.
  **/
  public static String decryptOutput(String output, String key) {
    String input = "";
    output = output.toLowerCase();
    key = key.toLowerCase();
    // the current character that is being encrypted
    char current;

    // the current character used for the key
    char keyCurrent;

    // the index of the current character in the Key
    int placeOfKey = 0;

    // the amount of the shift according to the corresponding letter
    int shifter = 0;

    // where the current letter is in terms of the alphabet
    int placeOfLetter = 0;

    // where the cipher designates that the letter starts at in the alphabet
    int placeOfInput = 0;

    for (int i = 0; i < output.length(); i++) {
      current = output.charAt(i);
      //the current letter being decrypted.
      keyCurrent = key.charAt(placeOfKey);
      //the current letter in the Key being used.

      // if indexOf() doesn't find the char, it returns -1 as the index.
      if(alphabetUppercase.indexOf(current) > -1)
      //if the output letter is uppercase
      {
        shifter = alphabetLowercase.indexOf(keyCurrent);
        placeOfLetter = alphabetUppercase.indexOf(current);
        placeOfInput = placeOfLetter - shifter;
        //shift it to another uppercase letter
        if(placeOfInput < 0)
        //if it gets shifted outside of the alphabet
        {
          placeOfInput = placeOfInput + 26;
          //loop it back to the end of the alphabet
        }
        input += alphabetUppercase.charAt(placeOfInput);
        //add the decrypted letter to the input string
      }
      else if(alphabetLowercase.indexOf(current) > -1)
      //if the output letter is lowercase
      {
        shifter = alphabetLowercase.indexOf(keyCurrent);
        placeOfLetter = alphabetLowercase.indexOf(current);
        placeOfInput = placeOfLetter - shifter;
        //shift it to another uppercase letter
        if(placeOfInput < 0)
        //if it gets shifted outside of the alphabet
        {
          placeOfInput = placeOfInput + 26;
          //loop it back to the end of the alphabet
        }
        input += alphabetLowercase.charAt(placeOfInput);
        //add the decrypted letter to the input string
      }
      else
      //if the output letter is not a letter.
      {
        placeOfKey--;
        //don't increase the place in the Key. (negates increasing it later.)
        input += current;
      }
      placeOfKey++;
      //go to the next letter in the Key.
      if(placeOfKey >= key.length()) { placeOfKey = 0; }
      //loop back to the first letter of the Key if the end has been reached.
    }
    return input.toString();
  }
}
