public class WordsPyrmid
{
    public static void main(String[] args) {
        String word="CODE";
        for(int i=0;i<word.length();i++)
        {
            for(int s=0;s<word.length()-i;s++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(word.charAt(i)+" ");
            }
            System.out.println(" ");
        }
        
    }
}