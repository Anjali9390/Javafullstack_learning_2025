import java.util.*;

public class evennumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        while(n > 0) {
            int digit = n % 10;   // get last digit

            if(digit % 2 == 0) {
                System.out.println(digit);
            }

            n = n / 10;           // remove last digit
        }

        sc.close();
    }
}
