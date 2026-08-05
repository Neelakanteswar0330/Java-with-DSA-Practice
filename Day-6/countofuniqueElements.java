import java.util.*;
class CountOfUniqueElements {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,2,1,4};
        HashSet<Integer> numbers = new HashSet<Integer>();
        
        for(int num:arr) {
            numbers.add(num);
        }
        
        System.out.println("Count of Unique Elements: " + numbers.size());
    }
}