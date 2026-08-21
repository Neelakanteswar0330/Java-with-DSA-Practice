import java.util.*;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principa Amount: ");
        int p = sc.nextInt();

        System.out.print("Enter the Time Period: ");
        double t = sc.nextDouble();

        System.out.print("Enter the Intrest Rate: ");
        double r = sc.nextDouble();

        double TotalAmount = (p*t*r)/100;

        System.out.println(p+TotalAmount);
        sc.close();
    }
}
