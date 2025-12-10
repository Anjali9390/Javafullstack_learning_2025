import java.util.*;
public class Logicspract6
{
    public static void main(String args[])
    {
     Scanner Sc=new Scanner(System.in);
     System.out.println("enter the numnber:");
     int n=Sc.nextInt();
     int count=0;

     while(n>0)
        {
      n=n/10;
      count++;

        }
     System.out.println("total digits:"+count);
    }
}