import java.util.*;
public class AmstrongNum
{
    public static void main (String[] args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the amstrong numbers:");
        int n=Sc.nextInt();
        int sum=0,rem;
        int temp=n;
        while(n!=0)
        {
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println("this is a amstromg");
        }
        else
        {
            System.out.println("this is not amstrong");
        }
        Sc.close();

    }
}