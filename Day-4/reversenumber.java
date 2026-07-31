import java.util.*;
public class reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number you want to reverse: ");
        int num = sc.nextInt();

        String str = Integer.toString(num);
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println(reverse);
        sc.close();
    }
}