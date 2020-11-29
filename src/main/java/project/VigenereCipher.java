package project;

import java.util.Scanner;

/**
* Class containing the Caesarian encryption and decryption method.
*
* @author Adriana Solis
* @author Kevin Lee
* @author Gabe Schwartz
*/

public class VigenereCipher {

 public static String encrypt(String text, final String key)  {

      String res = "";
      text = text.toUpperCase();
      for (int i = 0, j = 0; i < text.length(); i++) {

          char c = text.charAt(i);
          if (c < 'A' || c > 'Z')
              continue;
          res += (char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
          j = ++j % key.length();
      }
      return res;
  }

  public static String decrypt(String text, final String key) {

      String res = "";
      text = text.toUpperCase();
      for (int i = 0, j = 0; i < text.length(); i++) {

          char c = text.charAt(i);
          if (c < 'A' || c > 'Z')
              continue;
          res += (char) ((c - key.charAt(j) + 26) % 26 + 'A');
          j = ++j % key.length();
      }
      return res;
  }

  public static void main(String[] args) {
      String key = key;
      String message = "Hello";
      String encryptedMsg = encrypt(message, key);
      System.out.println("String: " + message);
      System.out.println("Encrypted message: " + encryptedMsg);
      System.out.println("Decrypted message: " + decrypt(encryptedMsg, key));

    }

}