import java.util.*;
public class RemoveIfA {
    public static void main(String[] args) {
        ArrayList <String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Pine Apple");
        fruits.add("Guava");

        System.out.println(fruits);
        fruits.removeIf(result -> result.contains("A"));
        System.out.println(fruits);
        }
    }