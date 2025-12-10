import java.util.*;

public class sumofnumbers
{
    public static void main(String[]args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int n=Sc.nextInt();
        int rem,sum=0;

while(n>0)
{
    rem=n%10;
    sum+=rem;
    n/=10;

}
System.out.println("sum of digits:"+sum);
Sc.close();
    }
}