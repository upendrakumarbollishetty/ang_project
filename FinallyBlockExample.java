package assignments12;
import java.util.Scanner;

public class FinallyBlockExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter a number: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter another number: ");
            int denominator = scanner.nextInt();


            int result = numerator / denominator;


            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Error: Division by zero is not allowed.");

        } catch (NumberFormatException e) {

            System.out.println("Error: Invalid input. Please enter a valid number.");

        } catch (Exception e) {

            System.out.println("An unexpected error occurred: " + e.getMessage());

        } finally {

            System.out.println("Finally block: This code always executes.");
            

            scanner.close();
        }

        System.out.println("Program continues after the try-catch-finally block.");
    }
}

