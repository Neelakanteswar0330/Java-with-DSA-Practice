import java.util.*;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base value:" );
        double base = sc.nextDouble();
        System.out.println("Enter the Height value:" );
        double height = sc.nextDouble();

        double area = ((1.0)/2*base*height);
        System.out.println("Area Of the Triangle: " + area);
        sc.close();
    }
}
