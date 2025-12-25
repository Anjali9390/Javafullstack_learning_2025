public class RTriangleJava {
    public static void main(String[] args) {
        String word="JAVA";

        for(int i=word.length()-1;i>=0;i--)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print(word.charAt(j));
        }
        System.out.println(" ");
    }
    }
    
}
