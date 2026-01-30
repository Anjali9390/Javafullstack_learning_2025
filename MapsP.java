import java.util.*;

public class MapsP
{
    public static void main(String[]args)
    {
        Map<String,Integer> names=new HashMap<String,Integer>();
        names.put("anjali",1);
        names.put("harika",2);
        names.put("mounika",3);
        names.put("pramilaa", 4);

        System.out.println(names);
        System.out.println(names.get("anjali"));
        System.out.println(names.keySet());
        System.out.println(names.get(3));

    }
}