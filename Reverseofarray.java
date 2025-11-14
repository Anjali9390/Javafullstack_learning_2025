import java.util.*;

public class Reverseofarray
{
    public static void main(String[]args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=Sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter the numbers");
        for(int i=0;i<n;i++)
        {
            arr[i]=Sc.nextInt();
        }
         int start = 0; 
        int end = n - 1; 

        while (start < end) {
        
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;   
        }
        System.out.println("reversed of numbers:");
         for (int i = 0; i < n; i++) 
         {
            System.out.println(arr[i]);
        }
 Sc.close();
    }
}
