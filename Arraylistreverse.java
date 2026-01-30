import java.util.*;

public class Arraylistreverse
{
    public static void main(String[]args)
    {
        ArrayListss<String> Students=new ArrayListss<>();
        Students.add("rama");
        Students.add("venky");
        Students.add("siri");

        System.out.println("college students name"+Students);
        Collections.reverse(Students);
        Collections.sort(Students);
        System.out.println("Alphabetical order list: " + Students);

         System.out.println("\nPrinting elements individually order:");

for(String n:Students)
{
       System.out.println(n);
}

    }
}