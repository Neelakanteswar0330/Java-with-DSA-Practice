import java.util.*;

public class SortingOfArrayUsingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(3);

        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);
        Collections.reverse(list);
        

        System.out.println("Reversed Array: " + list);
}
}