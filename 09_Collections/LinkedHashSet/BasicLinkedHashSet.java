import java.util.*;
public class BasicLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Goose Berry");
        fruits.add("Jack Fruit");
        fruits.add("Indian Jamun");
        System.out.println("Fruits Set: " + fruits);

        if(fruits.contains("Mango")){
            System.out.println("Mango is Present in the Set");
        }

        fruits.remove("Apple");
        System.out.println("After Removing Apple: " + fruits);
        System.out.println("Size of the Fruits Set: "+fruits.size());
    }
}