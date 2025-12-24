public class RTriangleHello
{
    public static void main(String[] args)
    {
        String word="Hello";
        for(int i=word.length()-1;i>=0;i--)
        {
            for(int j=i;j<word.length();j++)
            {
                System.out.print(word.charAt(j)+" ");
            }
            System.out.println(" ");
        }
    }
}