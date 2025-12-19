public class Numberoddeven
{
    public static void main(String[]args)
    {
        int a=6;
        int count;
        if(a%2==0)
        {
            count=a/2;
        }
        else{
            count=a;
        }
        int num = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(num + " ");
            num = num + 2;
        }
    }
}