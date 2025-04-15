import java.util.*;
 public class PN   
 {
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the positive andnegative numbers");
        int n=Sc.nextInt();
        if (n>0) {
            System.out.println(" the is positive numbers");
             }
             else if (n<0)
             {
           System.out.println(" the is negative numbers");
             }
             else
             {
                System.out.println("this is zero number");
             }
             Sc.close();
    }
 }