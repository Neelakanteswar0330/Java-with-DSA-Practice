import java.util.*;

public  class DuplicateElementsinHashset {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,2,3,4,5,6};
        HashSet<Integer> seen = new HashSet<Integer>();
        HashSet<Integer> duplicate = new HashSet<Integer>();

        for(int i=0; i<arr.length; i++) {
            if (seen.contains(arr[i])) {
                duplicate.add(arr[i]);
            } else {
                seen.add(arr[i]);
            }
        }
        if (duplicate.isEmpty()) {
            System.out.println("No Duplicate Elements");
        } else {
            System.out.println("Duplicate Elements: " + duplicate);
        }


    }
}
