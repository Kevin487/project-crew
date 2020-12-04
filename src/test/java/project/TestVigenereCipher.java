package project;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * A JUnit test suite.
 *
 * @author Adriana Solis
 * @author Kevin Lee
 * @author Gabe Schwartz
 */

 public class TestVigenereCipher {

   private VigenereCipher cipher = new VigenereCipher();

   String key1 = "key";
   String key2 = "qwe";
   String key3 = "zxc";
   String key4 = "iop";

   @Test
   public void cipherShouldEncryptLowercaseLetters() {
     assertEquals("kfa", cipher.encryptInput("abc", key1));
     assertEquals("qxg", cipher.encryptInput("abc", key2));
     assertEquals("zye", cipher.encryptInput("abc", key3));
     assertEquals("ipr", cipher.encryptInput("abc", key4));
   }
}
