import java.util.*;

public class UrLrDrS {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in); // added semicolon here

        System.out.println("Enter the alphabet:");
        char ch = Sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("This is an Uppercase letter");
        }
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("This is a Lowercase letter");
        }
        else if (ch >= '0' && ch <= '9') {
            System.out.println("This is a digit");
        }
        else {
            System.out.println("This is a special symbol");
        }

        Sc.close();
    }
}
