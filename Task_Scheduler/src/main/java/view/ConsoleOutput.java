package view;

public class ConsoleOutput implements IOutput {
  @Override
  public void println(String message) {
    System.out.println(message);
  }

  @Override
  public void print(String message) {
    System.out.print(message);
  }
}
