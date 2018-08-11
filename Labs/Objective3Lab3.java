//import java.util.Scanner;
import java.util.*;

public class Objective3Lab3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    int birthYear, age;

    System.out.println("How old are you?");
    age = keyboard.nextInt();

    birthYear = currentYear - age;

    //System.out.println(currentYear);
    //System.out.println(birthYear);
    System.out.println("You were born in " + birthYear);

  }
}
