public class LogicsPrct2
{
    public static boolean isprime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
    return true;
    }


    public static void main(String[] args)
    {
        int input=5;
        int number=1;
        for(int i=1;i<=input;i++)
        {
            int c=0;
            int[] temp = new int[i];
            while(c<i)
            {
                  if (!isprime(number)) 
                    { 
                    temp[c] = number;
                    c++;
            }
            number++;
        }
        if(i%2==0)
        {
            for(int j=i-1;j>=0;j--)
            {
                 System.out.print(temp[j] + " ");
            }
        }
        
    else {
                for (int j = 0; j < i; j++) {
                    System.out.print(temp[j] + " ");
                }
            }

            System.out.println();
}
}
}