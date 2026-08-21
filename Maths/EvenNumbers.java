import java.util.*;
public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number from (1-100): ");
        int n = sc.nextInt();
    
        for (int i = n; i <= 100; i++) {
            if (i%2==0) {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
