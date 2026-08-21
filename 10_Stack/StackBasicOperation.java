import java.util.*;
public class StackBasicOperation {
    public static void main(String[] args) {
        Stack <Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        System.out.println("Initial Stack: " + s1);
        System.out.println("Popped Element: " + s1.pop());
        System.out.println("Stack after Pop Operation: " + s1);
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        System.out.println("Is Satck Empty ? : " + s1.isEmpty());
    }
}