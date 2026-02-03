import java.util.*;
public class ArrayListMax
{
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.add(20);
        list.add(90);
        list.add(30);
        list.add(50);
        list.add(100);

        System.out.println(list);

        System.out.println(Collections.max(list));

        System.out.println(Collections.min(list));


        
    }
}