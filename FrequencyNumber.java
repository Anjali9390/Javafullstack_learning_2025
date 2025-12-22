import java.util.*;
public class FrequencyNumber
{
    public static void main(String[]args)
    {
        int arr[]={2, 3, 2, 5, 3, 2, 4};
        Map<Integer,Integer>frequency=new HashMap<>();

       for(int num:arr)
       {
          if(frequency.containsKey(num))
          {
            frequency.put(num, frequency.get(num)+1);
          }
          else{
             frequency.put(num, 1);
          }
        }
          for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
       }
        

    }
}