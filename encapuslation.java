class one{
    int a;
        public void demo()
        {
            a=10;
            a--;
            System.out.println("this demo method");
        }
    }

public class encapuslation
{
    public static void main(String[]args)
    {
    one obj=new one();
    obj.demo();
    System.out.println(obj.a);
    }
}