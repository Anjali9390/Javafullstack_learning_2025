import java.util.*;
import java.util.Collection;


public class Setinterface2
{
    public static void main(String[] args) {
        Collection<Integer> numbers = new HashSet<>();
        numbers.add(6);
        numbers.add(5);
        numbers.add(5); // Duplicate, will be ignored by HashSet
        numbers.add(4);
        numbers.add(8);

        System.out.println("Set contents: " + numbers); 

        
        Iterator<Integer> values = numbers.iterator();
        System.out.println("Iterating through values:");
        
        while (values.hasNext()) {
            
            Integer currentValue = values.next();
            System.out.println(currentValue);
        }

        
        System.out.println("Iterating using enhanced for loop:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
