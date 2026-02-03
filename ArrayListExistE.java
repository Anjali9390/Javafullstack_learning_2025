import java.util.*;
public class ArrayListExistE
{
    public static void main(String[] args) {

        ArrayList<String> fruties=new ArrayList<>();

        fruties.add("Apple");
        fruties.add("banana");
        fruties.add("gova");

        System.out.println(fruties.contains("grapes"));

        System.out.println(fruties);

        System.out.println(fruties.contains("Apple"));



        
    }
}