package assignments12;
import java.util.Scanner;
public class TryBlockWithParameters {
    public static void main(String[] args) {

        int numerator = 0;
        int denominator = 0;

        try {

            numerator = getUserInput("Enter the numerator: ");
            denominator = getUserInput("Enter the denominator: ");


            int result = performDivision(numerator, denominator);


            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {

            System.out.println("Error: Division by zero is not allowed.");
        } catch (NumberFormatException e) {

            System.out.println("Error: Invalid input. Please enter a valid number.");
        } catch (Exception e) {

            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        System.out.println("Program continues after the try-catch block.");
    }


    private static int getUserInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);


        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number.");
            System.out.print(message);
            scanner.next(); // Consume the invalid input
        }

        return scanner.nextInt();
    }


    private static int performDivision(int numerator, int denominator) {
        return numerator / denominator;
    }
}
