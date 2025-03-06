import java.util.*;
public class Palindrome{
    public static void main(String[]args)
    {
Scanner Sc=new Scanner(System.in);
System.out.println("enter the number:");
int num=Sc.nextInt();

int OriginalNum=num;
int reversedNum=0,rem;

while(num!=0)
{
    rem=num%10;
    reversedNum=reversedNum*10+rem;
    num=num/10;

}

if(OriginalNum==reversedNum)
{
    System.out.println("this is a palindrome");
}
else{
       System.out.println("this is not a palindrome");
}
    }
}