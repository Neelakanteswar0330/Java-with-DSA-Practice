import java.util.*;
public class AreaOfEuilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Side value:" );
        double a = sc.nextDouble();

        double area = ((Math.sqrt(3)/4)*(a*a));
        System.out.println("Area Of the Euilateral Triangle: " + area);
        sc.close();
    }
}