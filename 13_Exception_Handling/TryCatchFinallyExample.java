import java.util.Scanner;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("100 divided by your number: " + (100 / number));
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero.");
        } catch (java.util.InputMismatchException exception) {
            System.out.println("Please enter a whole number.");
        } finally {
            scanner.close();
            System.out.println("The program has finished.");
        }
    }
}