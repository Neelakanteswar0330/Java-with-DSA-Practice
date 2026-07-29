import java.util.Random;

public class RandomNumberEvenOdd {
    public static void main(String[] args) {
        Random ran = new Random();

        int x = ran.nextInt(100);
        System.out.println(x);
        System.out.println((x%2==0) ? "Even Number" : "Odd Number");
    }
}