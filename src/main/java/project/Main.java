package project;

import java.util.Scanner;


/**
 * Class containing the main method.
 *
 * @author Adriana Solis
 * @author Kevin Lee
 * @author Gabe Schwartz
 */

public class Main {

  // TODO: add your implementation of the main method
  public static void main(String args[]) {
    System.out.println("Choose your cipher");
    System.out.println("Cipher 1: Caesarian Cipher");
    System.out.println("Cipher 2:");
    System.out.println("Cipher 3:");
    Scanner scanchoice = new Scanner(System.in);
    System.out.println("");
    System.out.println("Enter \"1\", \"2\" or \"3\"");
    int choiceentry = scanchoice.nextInt();
  }

}
