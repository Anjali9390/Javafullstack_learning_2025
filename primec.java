import java.util.*;

public class primec
{
public static boolean isprime(int number)
{
    if(number<=1)
    {
        return false;
    }
        for(int i=2;i<=number/2;i++)
        {
            if (number % i == 0) 
            {
            return false;
        }
    }
        return true;
    } 

public static void main(String args[])
{
    Scanner Sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=Sc.nextInt();
    
    if(isprime(n))
    {
        System.out.println(n+"this is prime");
    }
    else
    {
        System.out.println(n+"not a prime");
    }
}
}