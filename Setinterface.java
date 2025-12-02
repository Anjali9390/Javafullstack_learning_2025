 import java.util.*;
public class Setinterface
{
    public static void main(String[] args) {
        Set<Integer> values=new HashSet<Integer>();
        values.add(89);
        values.add(78);
        values.add(34);
        values.add(20);
       
        for(int n:values)
        {
            System.out.println(n);
        }

        
    }
}