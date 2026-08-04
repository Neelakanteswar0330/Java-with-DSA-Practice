import java.util.*;

public class Morethan5Chars {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Vinod");
    cars.add("Mahith");
    cars.add("Sai Kalyan");
    cars.add("Poojesh");
    cars.add("Sai");
    cars.add("Raj");

     for (String result : cars) {
            if (result.length() > 5) {
                System.out.println(result);
            }
  }
  }
}