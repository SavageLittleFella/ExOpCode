import java.util.Scanner;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
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
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println("Result = " + add(a, b));
                    break;
                case EXIT:
                    System.out.println("Exiting calculator. Goodbye!");
                    break;
                case PRIME:
                    System.out.println("Enter a Number to check if it is prime: ");
                    int a = scanner.nextInt();
                    System.out.println(isPrime(a) ? "It is a prime number." : "It is not a prime number.");
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != EXIT);

        public boolean isPrime(int num)
        {
            int x = 2;
            for(int i = 2; i < num; i++)
            {
                if(num % i == 0)
                {
                    return false;
                }
                
            }
            return true;
        }
    }
}
