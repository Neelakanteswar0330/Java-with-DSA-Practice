import java.util.Scanner;
public class alphabetORNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println("It is an alphabet.");
        } else {
            System.out.println("It is not an alphabet.");
        }

        sc.close();
    }
}