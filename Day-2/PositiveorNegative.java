import java.util.Scanner;

public class PositiveorNegative {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        String res = (num>0) ? "Positive" : (num<0) ? "Negative" : "Zero";

        System.out.println("The Number is " + num + " " + res);
        sc.close();
    }
}