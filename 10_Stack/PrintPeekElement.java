import java.util.*;
public class PrintPeekElement {
    public static void main(String[] args) {
        Stack <String> s1 = new Stack<>();
        s1.push("Hello");
        s1.push("Good Morning!");

        System.out.println("Initial Stack: " + s1);
        System.out.println("The Element at the top of the Staack is: " + s1.peek());
    }
}
