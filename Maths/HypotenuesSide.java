import java.util.Scanner;

public class HypotenuesSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Base Side Value: ");
        double base = sc.nextDouble();

        System.out.print("Enter the Height  Value: ");
        double height = sc.nextDouble();
        
        double hypo = Math.sqrt(base*base+height*height);

        System.out.println(hypo);
        sc.close();
    }
}