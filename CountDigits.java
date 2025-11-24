import java.util.*;

public class CountDigits {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        while (n != 0) {   // repeat until number becomes 0
            n = n / 10;    // remove last digit
            count++;       // increase digit count
        }

        System.out.println("Number of digits = " + count);
    }
}
