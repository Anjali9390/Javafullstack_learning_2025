import java.util.*;

public class MissingArray
{
    public static void main(String[]args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter N (last number in series): ");
        int n=Sc.nextInt();

        int arr[]=new int[n-1];
        System.out.println("enter"+(n-1)+"number");
        int sum=0;
        for(int i=0;i<n-1;i++)
        {
            arr[i]=Sc.nextInt();
            sum+=arr[i];

        }
        int totalsum=n*(n+1)/2;
        int MissingArray=totalsum-sum;
         System.out.println("Missing Number = " + MissingArray);
    }
}