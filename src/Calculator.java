import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static int power(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Negative exponent is not supported");
        }
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }
    
    public static void main(String[] args) {
        final int EXIT = 0;
        final int ADD = 1;
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Calculator Menu ===");
            System.out.println(ADD + ". Add");
            System.out.println(EXIT + ". Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case ADD:
                    System.out.print("Enter two numbers: ");
                    double a = scanner.nextDouble(); // use nextDouble
                    double b = scanner.nextDouble(); // use nextDouble
                    System.out.println("Result = " + add(a, b));
                    break;
                case EXIT:
                    System.out.println("Exiting calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != EXIT);

        scanner.close();
    }
}
