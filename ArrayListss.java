import java.util.*;

public class ArrayListss
{
    public static void main(String args[])
    {
        ArrayList<String> list=new ArrayList<>();

        list.add("Anjali");
        list.add("harika");
        list.add("mounika");
        list.add("pramila");
        list.add("varshi");

        System.out.println(list);
         for(String name : list) 
            {
            System.out.println(name);
        }

    }
}