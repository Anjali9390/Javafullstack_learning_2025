public class LogicsPrct7
{
    public static void main(String[]args)
    {
        int input=47628;
        int count=0;

      while(input>0)
      {
        int digit=input%10;
        if(digit%2==0)
        {
            count++;
    
        }
        input=input/10;

      }
      System.out.println("even digits numbers "+count);
    }
}