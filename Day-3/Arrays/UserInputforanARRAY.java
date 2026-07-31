import java.util.*;
public class UserInputforanARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of teh Array you wanted to create: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        int sum = 0;

        System.out.println("Enter " + size + " integer elements: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        System.out.println("Sum of the elements in the Array: " + sum);
        sc.close();
        }
    }