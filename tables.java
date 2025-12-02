import java.util.*;

public class tables
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=Sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.println(n+"*"+i+"="+(n*i));
        }
        Sc.close();
    }
}