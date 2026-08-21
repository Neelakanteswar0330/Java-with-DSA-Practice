import java.util.*;
class GymMembershipCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Months: ");
        int month = sc.nextInt();
        
        if (month < 0){
            System.out.println("Invalid Input");
        } else if (month == 0) {
            System.out.println(0);
        } else if(month == 1) {
            System.out.println(2000);
        } else if(month == 2 || month == 3) {
            System.out.println(5000);
        } else if(month >= 4 && month <= 6) {
            System.out.println(9000);
        } else if(month == 9) {
            System.out.println(12000);
        } else if(month == 12) {
            System.out.println(15000);
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}