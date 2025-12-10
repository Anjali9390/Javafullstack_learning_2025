import java.util.*;

public class Fact
{
    public static void main(String[]args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the numbers");
        int n=Sc.nextInt();
       int fact=1;
        for(int i=1;i<=n;i++)
        {
             fact=fact*i;
        }
        System.out.println("factorial of n:"+fact);
    }
}