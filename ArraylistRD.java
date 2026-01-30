import java.util.*;

public class ArraylistRD
{
    public static void main(String[]args)
    {
        ArrayListss<Integer> elements=new ArrayListss<>();

        elements.add(90);
        elements.add(80);
        elements.add(70);
        elements.add(90);
      System.out.println("print the elements "+elements);

      Set<Integer> Set=new TreeSet<>(elements);

      ArrayListss<Integer>uniqeSet=new ArrayListss<>(Set);

      System.out.println("remove the dupilcates elements"+uniqeSet);
    }
}