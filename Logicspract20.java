public class Logicspract20
{
    public static void main(String[]args)
    {
        int n=123;
        while(n>0)
        {
        int digit=n%10;
        switch (digit) {
            case 1:
                System.out.println("one");
                break;
        case 2:
            System.out.print("two");
            break;
            case 3:
                System.out.print("theree");
                break;
            default:
                System.out.print("excute defalut value");
                break;
        }
        n=n/10;
    }
}
}