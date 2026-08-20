import java.util.*;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Word: ");
        String word = sc.nextLine().toLowerCase();

        StringBuilder str = new StringBuilder(word);
        String reverse = str.reverse().toString();

        if(reverse.equals(word)) {
            System.out.println("It is an Palindrome");
        } else{
            System.out.println("It is Not an Palindrome");
        }
    }
}