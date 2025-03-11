import java.util.*;

public class postIncrement {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = Sc.nextInt();
        int b = Sc.nextInt(); 

        b = ++a + a++ * ++a + a++; 
        System.out.println(b);
        Sc.close();
    }
}

