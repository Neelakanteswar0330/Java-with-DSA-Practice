import java.util.*;
public class StartsWithS {
    public static void main(String[] args) {
        ArrayList<String> frnds = new ArrayList<String>();
        frnds.add("Vinod");
        frnds.add("Mahith");
        frnds.add("Sai Kalyan");
        frnds.add("Poojesh");
        frnds.add("Sai");
        frnds.add("Raj");
    
        for (String result : frnds) {
            if (result.startsWith("S")) {
                System.out.println(result);
            }
  }
    }
}