import java.util.Scanner;

public class FindMaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.println("Enter three integer values:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Close the scanner since we've finished reading input
        scanner.close();

        // Find the maximum and minimum among the three values
        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);

        // Print the maximum and minimum
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
