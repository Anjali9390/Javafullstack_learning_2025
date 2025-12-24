public class TriangleHello2
{
    public static void main(String[] args) {
        String word="Hello";
for(int i=0;i<word.length();i++)
{
    for(int j=i;j<word.length();j++)
    {
        System.out.print(word.charAt(j)+" ");
    }
    System.out.println(" ");

}
    }
}