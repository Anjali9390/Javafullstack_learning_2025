public class LogicString
{
    public static void main(String[]args)
    {
        String str="hello";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='o')
            {
                count++;
            }
        }
        System.out.println("vowels="+count);
    }
}