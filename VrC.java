import java.util.*;
public class VrC
{
public static void main(String[] args)
{
    Scanner Sc=new Scanner(System.in);
    System.out.println("enter the Alphabet:");
    char ch=Sc.next().charAt(0);
 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
 {
    System.out.println("It is vowel");

 }
 else
 {
    System.out.println("it is not a vowel");
 }
 Sc.close();

}
}
