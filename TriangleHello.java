public class TriangleHello
{
    public static void main(String[]args)
    {
        String word="Hello";
        String input="H";
        for(int i=0;i<word.length();i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(word.charAt(j)+" ");
            }
    
            System.out.println(" ");
        }
    }
}