class one3
{
    private int a=10;
    public void demo()
    {
        a++;
        System.out.println("executing the demo method");
    }
}
class two3 extends one3
{
    double b=19.2;
    public void demo2()
    {
     b++;
     System.out.println("executing the demo2 method");
    }
}
public class PrivateModifier
{
public static void main(String args[])
{
   two3 obj=new two3();
   obj.demo();
   obj.demo2();
}
}