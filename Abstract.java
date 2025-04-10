abstract class one
{
   abstract public void main();
}
class two
{
    public void demo()
    {
    System.out.println("this is demo method");
    }
    public void main()
    {
        System.out.println("This is abstract method overridden in subclass");
    }
}
public class Abstract{
    public static void main(String[]args)
    {
        two obj=new two();
        obj.main();
        obj.demo();
    }

}