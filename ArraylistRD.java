import java.util.*;

public class ArraylistRD
{
    public static void main(String[]args)
    {
        ArrayList<Integer> elements=new ArrayList<>();

        elements.add(90);
        elements.add(80);
        elements.add(70);
        elements.add(90);
      System.out.println("print the elements "+elements);

      Set<Integer> Set=new TreeSet<>(elements);

      ArrayList<Integer>uniqeSet=new ArrayList<>(Set);

      System.out.println("remove the dupilcates elements"+uniqeSet);
    }
}