import java.util.*;
public class UnionOf2Arrays {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4};
        Integer[] arr2 = {7,9,3,4};
        HashSet <Integer> union = new HashSet<Integer>();

        for(int num : arr1) {
            union.add(num);
        } for(int num : arr2) {
            union.add(num);
        }
        System.out.println("Union Of Both Arrays is: " + union);
    }
}
