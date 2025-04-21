class nigh
{
    int aa=90;
    public void show()
    {
        System.out.println("this is show method");

    }
    public int demo()
    {
        aa++;
        return aa;
    }
}
public class Returntype
{
    public static void main(String[]args)
    {
        nigh obj=new nigh();
        obj.show();
        int bb=obj.demo();
        System.out.println(bb);
    }
}