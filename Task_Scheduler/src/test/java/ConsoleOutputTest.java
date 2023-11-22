import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import view.ConsoleOutput;

public class ConsoleOutputTest {
  @Test
  public void shouldPrintCorrectStringWithPrintln() {
    final PrintStream systemOut = System.out;
    ByteArrayOutputStream testOut;

    testOut = new ByteArrayOutputStream();
    System.setOut(new PrintStream(testOut));

    ConsoleOutput consoleOutput = new ConsoleOutput();
    consoleOutput.println("Hello World");
    assertEquals("Hello World\n", testOut.toString());

    System.setOut(systemOut);
  }

  @Test
  public void shouldPrintCorrectStringWithPrint() {
    final PrintStream systemOut = System.out;
    ByteArrayOutputStream testOut;

    testOut = new ByteArrayOutputStream();
    System.setOut(new PrintStream(testOut));

    ConsoleOutput consoleOutput = new ConsoleOutput();
    consoleOutput.print("Hello New World");
    assertEquals("Hello New World", testOut.toString());

    System.setOut(systemOut);
  }
}
