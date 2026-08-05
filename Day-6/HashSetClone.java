import java.util.*;

public class HashSetClone {
  public static void main(String[] args) {  
    HashSet<Integer> numbers = new HashSet<Integer>();
    numbers.add(10);
    numbers.add(0);
    numbers.add(20);
    numbers.add(40);
    numbers.add(100);
    
    System.out.println("New HashSet: " + numbers);
    HashSet<Integer> numbers1 = new HashSet<Integer>(numbers);
    System.out.println("Cloned HashSet: " + numbers1);
  }
}
