import java.util.*;

public class SortingandReverseSorting {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Vinod");
    cars.add("Mahith");
    cars.add("Sai Kalyan");
    cars.add("Poojesh");
    cars.add("Sai");
    cars.add("Zeroth");
    cars.add("Ashok");
    
    Collections.sort(cars);
    System.out.println("Alphabetical Order: " + cars);
    
    Collections.reverse(cars);
    System.out.println("Reverse Order: " + cars);
}
}
