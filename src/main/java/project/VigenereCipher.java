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

  public static Void encryptedDycrypt(String input, String key) {
    //Converts input to char arrays
    char msg[] = input.toCharArray();
    int msgLen = msg.length;
    int i,j;

    //Creating new char arrays
    char key[] = new char[msgLen];
    char encryptedMsg[] = new char[msgLen];
    char decryptedMsg[] = new char[msgLen];

    //Generates a cyclic version of the key equal to the userInput length
    for(i = 0; i < msgLen; ++i)
    }

  }
