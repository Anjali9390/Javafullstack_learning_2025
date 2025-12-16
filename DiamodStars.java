public class DiamodStars
{
    public static void main(String[]args)
    {
        for(int i=1;i<=3;i++)
        {
            for(int s=1;s<=3-i;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        for(int i=3-1;i>=1;i--)
        {
            for(int s=1;s<=3-i;s++)
            {
                 System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}