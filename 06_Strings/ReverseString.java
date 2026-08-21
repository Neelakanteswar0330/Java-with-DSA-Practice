import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any word you wanted to Reverse: ");
        String word = sc.nextLine();
        StringBuilder str = new StringBuilder(word);
        String reverse = str.reverse().toString();
        System.out.println("Reversed Word is : " + reverse);
    }
}