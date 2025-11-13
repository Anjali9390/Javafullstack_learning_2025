import java.util.*;

public class EvenoddArray
{
    public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the even and odd number");
        int n=Sc.nextInt();

        int a[]=new int[n];
         System.out.println("enter then number:");
         for (int i = 0; i < n; i++)
         {
            a[i] = Sc.nextInt();
        }
         System.out.println("\nEven numbers:");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }

        System.out.println("\nOdd numbers:");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }

        Sc.close();
    }
}
