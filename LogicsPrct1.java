public class LogicsPrct1 {
    public static boolean isprime(int num)
    {
         if(num<=1)
            return false;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
public static void main(String[]args)
{
    int input=10;
    int c=0;
    int n=1;

    while(c<input)
    {
       if(!isprime(n))
       {
        System.out.print(n + " ");
                c++;  
       }
       n++;
    }
}
    
}