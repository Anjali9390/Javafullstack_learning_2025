import java.util.*;
public class AddSum
{
    public static void main(String [] args)
    {
    Scanner Sc=new Scanner(System.in);
    System.out.println("enter the number");
    int num=Sc.nextInt();

    int sum=0,rem;
    while(num!=0)
    {
    rem=num%10;
    sum=sum+rem;
    num=num/10;
    }
    System.out.println(sum);
    }
}