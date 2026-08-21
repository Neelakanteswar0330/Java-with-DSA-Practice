import java.util.*;

public class HashsettoArray {
    public static void main(String[] args) {
        
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        
        Integer[] array = numbers.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));
    }
}