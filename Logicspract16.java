public class Logicspract16
{
    public static void main(String[]args)
    {
        int a=10;
        int b=25;
        int c=15;

        if((a>=b)&&(a>=c))
        {
            System.out.println("a is big");
        }
        else if((b>=c)&&(b>=a))
        {
            System.out.println("b is big");
        }
        else 
        {
           System.out.println("c is big");
        }
    }
}