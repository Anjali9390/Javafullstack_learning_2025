import java.util.*;
public class ArrayListEVENnmbr
{
    public static void main(String[]args)
    {
    ArrayList <Integer> numbers=new ArrayList<>();

    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(18);
    numbers.add(31);
    System.out.println(numbers);
     System.out.println("Even numbers are:");

    for(int num:numbers)
    {
        if(num%2==0)
        {
System.out.println(num);
        }
    }
    }
}