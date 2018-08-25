import java.util.Scanner;

public class Objective7Lab3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int selection;

    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List my favorite food");
    System.out.println("3: Exit");
    System.out.println();
    selection = keyboard.nextInt();

    while ( selection == 1 ) {
      System.out.println("Hello Human");
      printMenu();
      selection = keyboard.nextInt();
    }

      while ( selection == 2 ) {
        System.out.println("Apples, Bananas, Coconuts");
        printMenu();
        selection = keyboard.nextInt();
      }
      if ( selection == 3 ) {
        System.out.println("Goodbye!");
      }


  }
  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
