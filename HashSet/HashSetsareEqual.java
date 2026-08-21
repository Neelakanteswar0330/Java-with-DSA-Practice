import java.util.*;
public class HashSetsareEqual {
    public static void main(String[] args) {
        HashSet<Integer> hash1 = new HashSet<Integer>();
        HashSet<Integer> hash2 = new HashSet<Integer>();
        hash1.add(11); 
        hash1.add(12);
        hash1.add(13);
        hash1.add(14);
        hash1.add(15);

        hash2.add(11);
        hash2.add(12);
        hash2.add(13);
        hash2.add(14);
        hash2.add(16);

        if(hash1.equals(hash2)){
            System.out.println("Both the HashSets Are Equal!");
        } else{
            System.out.println("Both the HashSets Are Not Equal!");
        }
    }
}
