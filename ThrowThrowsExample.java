package assignments12;
import java.util.Scanner;

class CustomException extends Exception {

    public CustomException(String message) {
        super(message);
    }
}

public class ThrowThrowsExample {

    static void methodWithThrows(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Negative value not allowed");
        }
        System.out.println("Value is: " + value);
    }


    static void methodWithThrow(int value) {
        if (value % 2 != 0) {
            throw new IllegalArgumentException("Only even values allowed");
        }
        System.out.println("Value is: " + value);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter a non-negative value: ");
            int inputValue = scanner.nextInt();
            methodWithThrows(inputValue);


            System.out.print("Enter an even value: ");
            int evenValue = scanner.nextInt();
            methodWithThrow(evenValue);

        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

