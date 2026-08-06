import java.util.*;
class BasicTreeSet {
    public static void main(String[] args) {
        TreeSet <Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println("TreeSet Elements: "+ set);
        System.out.println("First Elemets: "+ set.first());
        System.out.println("First Elemets: "+ set.last());
        set.remove(20);
        System.out.println("After Removing 20: "+ set);
        
        System.out.print("Iteration: ");
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next() + " ");
        }
        
        System.out.println("Does It Contains: " +set.contains(30));
        System.out.println("HeadSet (<40): " +set.headSet(40));
        System.out.println("TailSet (>=30): " +set.tailSet(30));
        System.out.println("SubSet (30 to 50): " +set.subSet(30,50));
    }
}