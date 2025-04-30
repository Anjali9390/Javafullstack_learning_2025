
class One1
{
    int a;
 public One1(){
    a--;
    System.out.println("executing the parent constructor class");
 }
    public void demo()
    {
     a++;
     System.out.println("executing the demo method");
    }
 }
 class two2 extends One1
 {
    int b;
    public two2(int b)
    {
        super();
        System.out.println("excuting the child class constructor");
    }
public void demo2()
{
    System.out.println("excuting the demo2 method");
}
 }
 public class Constructor
 {
    public static void main(String[] args)
    {

    
    two2 obj=new two2(4);
    obj.demo2();
    
 }
}



