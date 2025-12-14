public class Logicspract18
{
    public static void main(String[]args)
    {
        int n=1020304;
       int count=0;
        while(n>0)
        {
            int digit=n%10;
          if(digit==0)
          {
                count++;
          }
          n=n/10;
        }
        System.out.println("how many zero"+count);
    }
}