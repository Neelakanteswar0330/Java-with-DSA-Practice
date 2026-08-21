import java.util.*;

public class MaxOf2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number A:");
        double a = sc.nextDouble();
        System.out.print("Enter any Number B:");
        double b = sc.nextDouble();

        if (a>b) {
            System.out.println("A is the Maximum Number!");
        } else if(a==b){
            System.out.println("Both are Equal");
        } else {
            System.out.println("B is the Maximum Number!");
        }
        sc.close();
    }
}