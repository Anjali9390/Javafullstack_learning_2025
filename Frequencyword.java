import java.util.*;
public class Frequencyword
{
public static void main(String[] args)
 {
    String s="programming";

    Map<Character,Integer> word=new HashMap<>();
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(word.containsKey(ch))
        {
            word.put(ch, word.get(ch) + 1);
        }
        else
        {
            word.put(ch,1);
        }
    }
    for(Map.Entry<Character,Integer> entry:word.entrySet())
    {
System.out.println(entry.getKey() + " = " + entry.getValue());
    }


 }
}