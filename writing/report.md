# Report by Kevin Lee, Adriana Solis, Gabe Schwartz

## Design of your Program

Hi Professor JJ,
Our group wanted to design three different kinds of ciphers, which would each be able to encrypt and decrypt a message. First a foremost, this tool is supposed to be a tool that is enhances secrecy, so we have also developed a cipher that will hide a message with asterisks, as it is written into our program, while waiting to be encrypted.
We were able to design our program by having two paths within our SRC folder. Within our SRC folder we have one path named MAIN and our second path, which is named TEST. The main path is where our program exists and the TEST folder is where our test cases for our program exists. Within our MAIN folder, we have split up our program into three different folders. One folder, named project, to host our CipherProgram.java, which is built to implement the use of our ciphers. This java file has hard coding in it too allow the calling of our three ciphers and will also allow system inputs/ system print statements. This will allow people to interact with our cipher when our program is run. Therefore, we have a Caesarian Cipher and Vigenere Cipher, within the 2nd folder called "ciphers" within our MAIN folder, to be called upon by our CipherProgram.java. We have also used those two ciphers to call upon their methods in order to create a third cipher within our CipherProgram.java.
Furthermore, we have created more java files, within the file "hidden message" within MAIN, in order to create secrecy when using our cipher program. The MaskingThread.java and our PasswordField.java, are called upon by CipherProgram.java, in order to hide the message with asterisks.  

## Implementation of your Program


## Evaluation and Testing of your Program

Include program input and output and output of test cases in code blocks

```
bash-5.0# gradle run

> Task :run
Welcome to "Useful Tool for Spies", a Cipher program!

Please choose your desired cipher from the available options below.

Cipher 1: Caesarian Cipher
Cipher 2: Vigenere Cipher
Cipher 3: Java Cipher

Enter "1", "2" or "3":

1

You have chosen the Caesarian Cipher!

Please enter your message:
***m*****************                  
*
Please enter a shift value from 0-26:

7

Encrypting your message...

Encrypted Text:

jvtw10lygzjplujlg878

Press any character to view your decrypted message.

hi

Decrypted Text:

computer science 101

Printing out the results of running the Caesarian Cipher.
```
```
bash-5.0# gradle run

> Task :run
Welcome to "Useful Tool for Spies", a Cipher program!

Please choose your desired cipher from the available options below.

Cipher 1: Caesarian Cipher
Cipher 2: Vigenere Cipher
Cipher 3: Java Cipher

Enter "1", "2" or "3":

2

You have chosen the Vigenere Cipher!

Please enter your message:
*****************************
*
Please enter your desired word to use as your key.

what

Encrypting your message...

Encrypted Text:

yvmiqaek ojixjje 101 bo koia

Press any character to view your decrypted message.

hi

Decrypted Message:

computer science 101 is dope
```
```
bash-5.0# gradle run

> Task :run
Welcome to "Useful Tool for Spies", a Cipher program!

Please choose your desired cipher from the available options below.

Cipher 1: Caesarian Cipher
Cipher 2: Vigenere Cipher
Cipher 3: Java Cipher

Enter "1", "2" or "3":

3

You have chosen the Java Cipher!
Please enter your message:
********o**************
*
Please enter your desired word to use as your key.

Whats Up

Please enter a shift value from 0-25.

14

Encrypting your message...

Encrypted Text:

32ouqnawxnzb2b 50r1n4x

Press any character to view your decrypted message.

hi

Decrypted Message:

thank you professor jj

Printing out the results of running the Vigenere Cipher.

```

Include commands needed to run and test your project

## Description of the challenges that you faced and how you resolved them

The biggest challenge we faced during this project, as a group, was researching how to implement the ability to mask the messages we type into our cipher. This was a tactic that we were eager to accomplish because we thought it would be very cool. However, we figured that we never learned how to do such a thing. Therefore, we called upon the internet to read a lot of guides.
The guides helped a lot, but the loop we were trying to create were very hard. We understood the concept, but we were not able to break down the steps. The issue was not being able to deconstruct what we learned into simple steps we could implement into our code. Therefore, we combined our research and talked about how we think this part of the program should be built. We discussed what our goal was and the small steps that we needed to accomplish a task. We were able to respond to each others ideas and figure out how create a iteration that will be able to accomplish the task we wanted. We were able to complete the task of hiding our message through conversing and a lot of trial and error. It was a three hour process, but we were eventually able to complete the task.

## If worked in a team, description of the way in which you and your team members shared the project work

We divided up the tasks as followed and it worked really well.
Group work
- Talk about project and ideas
- Research how to implement ciphers and continually brainstorm ideas together
- Teach each other what we learned from our research and grow together

Individual work (Adriana)
- Adriana was responsible for the Caesarian Cipher and the Test Caesarian Cipher
- Adriana was also responsible for most of the coding for the MaskingThread.java and PasswordField.Java

Individual work (Gabe)
- Gabe was responsible for the VigenereCipher and Test VigenereCipher

Individual work(Kevin)
- Kevin was responsible for the hard coding within the CipherProgram.Java
- Kevin was responsible for writing the proposal, update, and report
- Kevin was responsible for writing the Java cipher
- Kevin was responsible for writing the Test TestJavaCipher
