import java.util.*;

public class ArrayList1
{
    public static void main(String[] args)
    {
        ArrayListss<String> U=new ArrayListss<String>();
        U.add("abc");
        U.add("dfg");
        U.add("hij");
        System.out.println(U);
        U.remove(1);
        System.out.println(U);
        System.out.println(U.get(0));
    }
}