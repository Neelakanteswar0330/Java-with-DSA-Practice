import java.util.*;
public class SumOfElementsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;

        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.print(sum);
        sc.close();
    }
}
