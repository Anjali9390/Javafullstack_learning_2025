import java.util.*;

public class Mapinterface2
{
    public static void main(String[] args)
    {
        Map<String,Integer> Students=new HashMap<String,Integer>();
        Students.put("Anjali",78);
        Students.put("Pramila",67);
        Students.put("raji",48);
        Students.put("swati",90);
        Students.put("sravs",56);
        Students.put("Anjali",100);
        System.out.println(Students);
        System.out.println(Students.get("raji"));
        System.out.println(Students.keySet());
System.out.println("Looping through");

for(String name:Students.keySet())
{
    System.out.println(name+""+Students.get(name));
}
        

    }
}