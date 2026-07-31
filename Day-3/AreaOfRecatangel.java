import java.util.*;
public class AreaOfRecatangel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length Value: ");
        float length = sc.nextFloat();
        System.out.print("Enter Breadth Value: ");
        float breadth = sc.nextFloat();

        float area = length*breadth;
        System.out.println("Area of Rectangle: " + area);
        sc.close();
    }
}