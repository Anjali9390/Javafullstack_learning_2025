import java.util.*;

public class Sumofdigits
{
    public static void main(String[]args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the number of digits");
        int a=Sc.nextInt();
        int mul=0,rem;
        while(a>0)
        {
            rem=a%10;
            if(rem%2==0)
            {
            mul=mul*rem;
            }
            a=a/10;
        }
        System.out.println("mul of digits:"+mul);
    }
}
