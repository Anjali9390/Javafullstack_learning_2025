import java.util.*;

public class REmoveD
{
    public static void main(String[] args) 
    {

        List<String> list=new ArrayList<>();
        list.add("Anjali");
        list.add("Naveen");
        list.add("Anjali");
        list.add("pramila");
System.out.println(list);

Set<String> names=new LinkedHashSet<>(list);

System.out.println(names);
 
for(String name:names)
{
      System.out.println(name);
}


    }
}