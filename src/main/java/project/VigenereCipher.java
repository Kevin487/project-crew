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

  public static Void encryptedDycrypt(String input, String keyWord) {
    //Converts input to char arrays
    char msg[] = input.toCharArray();
    int msgLen = msg.length;
    int i,j;

    //Creating new char arrays
    char key[] = new char[msgLen];
    char encryptedMsg[] = new char[msgLen];
    char decryptedMsg[] = new char[msgLen];

    //Generates a cyclic version of the key equal to the userInput length
    for(i = 0, j = 0; i < msgLen; ++i, ++j) {
      if(j == keyWord.length()) {
        j = 0;
        }
        key[i] = keyWord.charAt(j);
      }
    //encryption code
    for(i = 0; i < msgLen; ++i) {
      encryptedMsg[i] = (char) (((msg[i] + key[i]) % 26) + 'A');
      }

    //decryption code
    for(i = 0; i <msgLen; ++i) {
      decryptedMsg[i] = (char)((((encryptedMsg[i] - key[i]) + 26) % 26) + 'A');
      }

    }
    return input.toString();

  }
