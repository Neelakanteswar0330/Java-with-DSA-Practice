import java.util.*;
public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Diagonal1 value:" );
        double d1 = sc.nextDouble();
        System.out.println("Enter the Diagonal2 value:" );
        double d2 = sc.nextDouble();

        double area = ((1.0)/2*d1*d2);
        System.out.println("Area Of the Triangle: " + area);
        sc.close();
    }
}