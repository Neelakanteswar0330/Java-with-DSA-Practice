import java.util.*;
public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base Value: ");
        float base = sc.nextFloat();
        System.out.print("Enter Height Value: ");
        float height = sc.nextFloat();

        float area = base*height;
        System.out.println("Area of Parallelogram: " + area);
        sc.close();
    }
}