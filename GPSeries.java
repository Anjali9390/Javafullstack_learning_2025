import java.util.*;

public class GPSeries
{
    public static void main(String [] args)
    {
Scanner Sc=new Scanner(System.in);
System.out.println("enter the first terms of (a)");
Double a=Sc.nextDouble();

System.out.println("enter the common ration of (r)");
Double r=Sc.nextDouble();

System.out.println("enter the natural number of (n)");
int n=Sc.nextInt();

double sum;
if(r==1)
{
    sum=a*n;

}
else{
    sum=a*(Math.pow(r,n)-1)/(r-1);
}
System.out.println("enter the Gp series is:"+sum);
Sc.close();
}
}