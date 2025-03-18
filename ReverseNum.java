import java.util.*;
 public class ReverseNum
 {
    public static void main(String[]args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the reverse Numbers");
        int num=Sc.nextInt();
        int reverse=0;
        while(num!=0)
        {
        int digit=num%10;
        reverse=reverse*10+digit;
        num=num/10;       
     }
     System.out.println("reversed number: " + reverse);
     Sc.close();
    }
}
 