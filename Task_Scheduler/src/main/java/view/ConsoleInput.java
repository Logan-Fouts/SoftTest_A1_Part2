package view;

import java.util.Scanner;

public class ConsoleInput implements IInput {
  private Scanner scanner = new Scanner(System.in);

  @Override
  public String readLine() {
    return scanner.nextLine();
  }

  @Override
  public int readInt() {
    int number = scanner.nextInt();
    scanner.nextLine();
    return number;
  }

}
