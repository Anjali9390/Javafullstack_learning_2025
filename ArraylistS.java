import java.util.*;

public class ArraylistS{
    public static void main(String args[])
    {
        ArrayList<Integer> elements=new ArrayList<>();

        elements.add(90);
        elements.add(80);
        elements.add(50);
        elements.add(40);
       
        System.out.println("store the elements list"+elements);
        Collections.sort(elements);
        System.out.println("Sorted elements list: " + elements);
         int secondHighest = elements.get(1);
        
        System.out.println("The second highest element is: " + secondHighest);

        

    }
}