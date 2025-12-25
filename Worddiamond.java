public class Worddiamond
{
    public static void main(String[] args) {
        
        String word="ABC";

        for(int i=0;i<word.length();i++)
        {
            for(int s=0;s<word.length()*2-i;s++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(word.charAt(j)+" ");
            }
            System.out.println(" ");
        }
        for(int i=word.length()-2;i>=0;i--)
        {
            for(int s=0;s<word.length()*2-i;s++)
            {
                System.out.print(" ");
            }
             for(int j=0;j<=i;j++)
            {
                System.out.print(word.charAt(j)+" ");
            }
            System.out.println(" ");
        }
        }
}