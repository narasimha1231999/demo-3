import java.util.Scanner;

public class Main {

    // Swap two numbers
    public static void swap(int a, int b) {
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    // Check Even or Odd
    public static void evenOdd(int num) {
        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");
    }

    // Factorial
    public static void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " = " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Swap Numbers");
            System.out.println("2. Check Even/Odd");
            System.out.println("3. Factorial");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    swap(a, b);
                    break;

                case 2:
                    System.out.print("Enter number: ");
                    int num = sc.nextInt();
                    evenOdd(num);
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    factorial(n);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}