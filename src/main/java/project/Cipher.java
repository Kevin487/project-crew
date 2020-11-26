package project;

/**
 * An interface for all of the cipher implementations.
 *
 * @author Adriana Solis
 * @author Gabe Schwartz
 * @author Kevin Lee
 */

public abstract class Cipher {

  /** The name of the cipher. */
  protected String name;

  /** The default name of the cipher. */
  private static final String DEFAULT_CIPHER = "default";

  /** Configure the name of the cipher. */
  public Cipher() {
    name = DEFAULT_CIPHER;
  }

  /** The name of the cipher. */
  public String getName() {
    return name;
  }

  /** Require that a Cipher provide a method for performing encryptions/decryptions. */
  // public abstract String encrypt(char character, int repeats);

}
