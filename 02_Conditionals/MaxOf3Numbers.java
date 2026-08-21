import java.util.Scanner;
public class MaxOf3Numbers {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter A Value: ");
        double a = sc.nextDouble();
        System.out.print("Enter B Value: ");
        double b = sc.nextDouble();
        System.out.print("Enter C Value: ");
        double c = sc.nextDouble();

        if (a>b && a>c) {
            System.out.println(a + " A is Maximum Number");
        } else if(b>a && b>c){
            System.out.println(b + " B is Maximum Number");
        } else {
            System.out.println(c + " C is Maximum Number");
        }
        sc.close();
    }
}