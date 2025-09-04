class N
{
    public void demo()
    {
        int n=2;
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+n*i);

        }
    }
}
public class TwoTable
{
    public static void main(String[]args)
    {
        N aa= new N();
        aa.demo();
    }
}