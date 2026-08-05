import java.util.*;

public class RemoveDuplicatesFromHash {
  public static void main(String[] args) {
      Integer[] array = {5,2,3,4,1,2};
      
    HashSet<Integer> numbers = new HashSet<Integer>(Arrays.asList(array));
    System.out.println(numbers);
  }
}


// Data Type Of Array Changed the above method directly converting is not possible so the below method should be followed for removing duplicates from an Hasset as the Hashse wont allow
//int[] arr = {1, 2, 3, 2, 4, 1, 5};
//HashSet<Integer> set = new HashSet<>();
//for (int num : arr) {
//    set.add(num);
//}
//System.out.println(set);