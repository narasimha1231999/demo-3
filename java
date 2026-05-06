import java.util.Scanner;

public class Main {

    // Method to swap two numbers
    public static void swapNumbers(int a, int b) {
        System.out.println("Before Swap:");
        System.out.println("a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap:");
        System.out.println("a = " + a + ", b = " + b);
    }

    // Method to check even or odd
    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for swap
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        swapNumbers(a, b);

        // Input for even/odd
        System.out.print("Enter a number to check Even/Odd: ");
        int num = scanner.nextInt();

        checkEvenOdd(num);

        scanner.close();
    }
}