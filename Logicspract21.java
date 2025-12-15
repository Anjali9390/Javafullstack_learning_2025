public class Logicspract21
{
    public static void main(String[]args)
    {
        int num=1;
        //Upper part
        for(int i=1;i<=3;i++)
        {
            for(int s=1;s<=3-i;s++)
            {
             System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                 System.out.print(num+" ");
                 num++;
            }
 System.out.println(" ");
        }
     //lower part
          for(int i=2;i>=1;i--)
          {
            for(int s=1;s<=3-i;s++)
            {
                 System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println(" ");
          }
    }
}