import java.util.*;
public class AreaOfCricle {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Radius Values to find the Area of a Circle: ");
     float radius = sc.nextFloat();
     
     double area = Math.PI*radius*radius;   
     System.out.println(area);
     sc.close();
    }
}