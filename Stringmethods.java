
public class Stringmethods
{
    public static void main(String[]args)
    {
        String s1="Hyd";
        String s2="Hyd";
        StringBuffer s3=new StringBuffer("Hyd");
        StringBuffer s4=new StringBuffer("Hyd");
        s3.insert(0,"e");
        if(s1.equals(s2))
        {
            System.out.println("values are same");
        }
        else{
            System.out.println("values are not same");
        }
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s3.append(s4));
        System.out.println(s3.reverse()); 
        
    }
}