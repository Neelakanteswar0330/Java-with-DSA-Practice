import java.util.*;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Name: ");
        String name = sc.nextLine();

        System.out.println("Happy Married Life Dear "+name);
        sc.close();
    }
}
