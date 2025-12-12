import java.util.*;

public class NaturalN
{
  public static void main(String[]args)
  {
    Scanner Sc=new Scanner(System.in);
    System.out.println("enter the numer");
    int a=Sc.nextInt();
    
    int count=0;
    for(int i=1;i<=a;i++)
    {
        if(count<=i)
        {
            count++;
            System.out.println("to print first 10 natural numbers"+count);
        }
    }
    Sc.close();
  }
}