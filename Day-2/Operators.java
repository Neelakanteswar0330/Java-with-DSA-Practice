import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number A: ");
        double a = sc.nextDouble();
        System.out.print("Enter Number B: ");
        double b = sc.nextDouble();
        System.out.print("Enter any Operator: ");
        char c = sc.next().charAt(0);
        
        if (c =='+') {
            System.out.println("Sum: " + (a+b));
        } else if(c =='-'){
            System.out.println("Difference: " + (a-b));
        } else if(c =='*'){
            System.out.println("Product: " + (a*b));
        } else if(c =='/'){
            if (b!=0) {
                System.out.println("Result: " + (a/b));
            } else {
             System.out.println("Division by is not Possible");   
            }
        } else {
            System.out.println("Invalid Operator");
        }
        sc.close();
    }
}
