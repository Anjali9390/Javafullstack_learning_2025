import java.util.*;

public class IncreDecre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        int x = a++ + ++a + --b + --a + a-- + b++ + ++b;

        System.out.println("Result (x): " + x);
        System.out.println("Final value of a: " + a);
        System.out.println("Final value of b: " + b);
        sc.close();
    }
}
