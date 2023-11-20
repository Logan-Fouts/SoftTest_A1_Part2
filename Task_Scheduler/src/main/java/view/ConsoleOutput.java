package view;

public class ConsoleOutput implements IOutput {
  @Override
  public void println(String message) {
    System.out.println(message);
  }
}
