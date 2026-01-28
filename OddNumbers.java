import java.util.*;

public class OddNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
      
        while(n > 0) {
            int digit = n % 10;   // extract last digit

            if(digit % 2 != 0) {  // check odd
                System.out.println("Odd digit: " + digit);
            }

            n = n / 10;           // remove last digit
        }

        sc.close();
    }
}
