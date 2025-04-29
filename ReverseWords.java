import java.util.*;
public class ReverseWords
{
    public static void main(String[]args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the Number");
        int n=Sc.nextInt();
        while(n>0)
        {
       switch(n%10)
       {
        case 0:
        System.out.println("zero");
        break;
        case 1:
        System.out.println("one");
        break;
        case 2:
        System.out.println("two");
        break;
        case 3:
        System.out.println("three");
        break;
        default:
                    System.out.println("Other digit not handled");
       }
       n=n/10;
        }
        Sc.close();
    }
}