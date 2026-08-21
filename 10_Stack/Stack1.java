import java.util.*;
public class Stack1 {
    public static void main(String[] args) {
        Stack <String> s1 = new Stack<>();
        Stack <String> s2 = new Stack<>();
        s1.push("Hello");
        s1.push("Good Morning!");
        s2.push("Welcome");
        s2.push("Glas to Meet You!");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.size());
        System.out.println(s2.size());
    }
}
