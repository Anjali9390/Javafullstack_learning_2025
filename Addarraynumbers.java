import java.util.*;

public class Addarraynumbers
{
  public static void main(String[]args)
  {
    Scanner Sc=new Scanner(System.in);
    System.out.println("enter the number of elements");
    int n=Sc.nextInt();
     
      
    System.out.println("enter the numbers");
    int sum=0;
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
       arr[i] = Sc.nextInt();
      
        sum+=arr[i];
    }
System.out.println("sum of the numbers="+sum);
}
}