public class hello
{
    public static void main(String[]args)
    {
        int a=1;
        for(int i=1;i<=5;i++)
        {
            for(int s=1;s<=2*i-1;s++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=5;j++)
            {
                System.out.print(" * ");
            }
        System.out.println(" ");
        }
    }
}