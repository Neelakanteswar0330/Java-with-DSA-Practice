import java.util.*;

public class Update3rdValueinArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> family = new ArrayList<Integer>();
        family.add(32);
        family.add(30);
        family.add(05);
        family.add(21);

        family.set(2, 06);
        System.out.println(family);
    }
}