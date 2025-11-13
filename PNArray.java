import java.util.*;

public class PNArray
{
    public static void main(String[]args)
    {
      Scanner Sc=new Scanner(System.in);
      System.out.println("enter the number of elements:");
      int n=Sc.nextInt();

      int arr[]=new int[n];
      System.out.println("enter the numbers:");

       for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
      int positive = 0, negative = 0, zero = 0;

      for(int i=1;i<n;i++)
      {
        if (arr[i] > 0)
                positive++;
            else if (arr[i] < 0)
                negative++;
            else
                zero++;
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);
    }
}