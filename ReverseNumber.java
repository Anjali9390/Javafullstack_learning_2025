import java.util.*;
public class ReverseNumber
{
    public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int n=Sc.nextInt();
        int rev=0,rem;
        while(n>0)
        {
            rem=n%10;
            rev=rem+rev*10;
            n=n/10;
        }
        System.out.println("Reverse of a given number="+rev);
        Sc.close();
    }
}