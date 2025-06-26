import java.util.*;

public class Reveresed
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rever of string");
        String Original=sc.next();
        String reversed="";
        for(int i=length.Original-1;i>=0;i++)
        {
            reversed=reversed+Original.charAt(i);
            System.out.println("reveresed number of String="+reversed);
        }
    }
}