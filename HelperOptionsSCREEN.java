import java.util.Scanner;

public class HelperOptionsSCREEN {

 private static Scanner scanner = new Scanner(System.in);

 public static int chooseOption(int min, int max) {
  System.out.println("Choose option: ");

  // collect user input
  int option;

  do {
   while (!scanner.hasNextInt()) {
    System.out.print("Provide a number: ");
    scanner.next();
   }
   option = scanner.nextInt();
  } while (option < min || option > max);

  // consume the reminding line after collecting the integer
  scanner.nextLine();

  return option;
 }
}