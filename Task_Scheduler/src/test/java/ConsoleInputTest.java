import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

import view.ConsoleInput;

public class ConsoleInputTest {
  @Test
  public void shouldReturnSpecifiedStringWhenReadLine() {
    String MESSAGE = "Magic Words";
    final InputStream systemIn = System.in;
    ByteArrayInputStream testIn = new ByteArrayInputStream(MESSAGE.getBytes());

    System.setIn(testIn);

    ConsoleInput consoleInput = new ConsoleInput();
    assertEquals(MESSAGE, consoleInput.readLine());

    System.setIn(systemIn);
  }

  @Test
  public void shouldReturnSpecifiedIntWhenReadInt() {
    String input = "42\n";
    final InputStream systemIn = System.in;
    ByteArrayInputStream testIn = new ByteArrayInputStream(input.getBytes());

    System.setIn(testIn);

    ConsoleInput consoleInput = new ConsoleInput();
    assertEquals(42, consoleInput.readInt());

    System.setIn(systemIn);
  }

}
