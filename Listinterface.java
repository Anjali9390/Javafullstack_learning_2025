import java.util.ArrayList;
import java.util.List;

public class Listinterface {
    public static void main(String[] args) {
    List<String> names=new ArrayList<String>();
    names.add("Anjali");
    names.add("Aparna");
    names.add("Thiru");
    names.add("Rani");
    names.add("Naga");
  System.out.println("list of names"+names);

  for(String name:names)
  {
    System.out.println(name);
  }
}

    
}