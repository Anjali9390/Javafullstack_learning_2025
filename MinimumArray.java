import java.util.*;

public class MinimumArray
{
    public static void main(String[] args)
    {
         Scanner Sc=new Scanner(System.in);
         System.out.println("enter the numbers of elements:");
         int n=Sc.nextInt();
         int a[]=new int[n];
         System.out.println("enter numbers:");
         for(int i=1;i<n;i++)
         {
            a[i]=Sc.nextInt();
         }
         Arrays.sort(a);
         System.out.println("minimum number of array is:"+a[0]);;

    }
}