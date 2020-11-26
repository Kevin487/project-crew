package practicalfour.repeat;

/**
 * An interface for all of the repeater implementations.
 *
 * @author Janyl Jumadinova
 */

public abstract class Repeater {

  /** The name of the repeater. */
  protected String name;

  /** The default name of the repeater. */
  private static final String DEFAULT_REPEATER = "default";

  /** Configure the name of the repeater. */
  public Repeater() {
    name = DEFAULT_REPEATER;
  }

  /** The name of the repeater. */
  public String getName() {
    return name;
  }

  /** Require that a Repeater provide a method for performing repeated string building. */
  public abstract String repeat(char character, int repeats);

}
