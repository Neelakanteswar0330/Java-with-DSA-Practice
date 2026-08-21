import java.util.Random;

public class OTP {
    public static void main(String[] args) {
    Random ran = new Random();

    int otp = ran.nextInt(99999) + 1;

    System.out.println(otp);
}
}