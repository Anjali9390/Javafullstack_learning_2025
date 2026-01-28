public class Learningp1
{
    public static void main(String args[])
    {
    int n=123456;
    int rev=0;
    while(n>0)
        {
            int digit = n%10;
            if(digit%2==0)
            {

             rev=rev*10+digit;
        
        }
        n=n/10;
    }
        System.out.println(rev);
    }

}