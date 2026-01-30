import java.util.*;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
public class Mapfrqc
{
    public static void main(String[]args )
    {
        int arr[]={1,3,4,8,3,4,2,1};

        Map<Integer,Integer> freq=new HashMap<Integer,Integer>();

        for(int num:arr)
        {
             if(freq.containsKey(num))
             {
                    freq.put(num, freq.get(num)+1);
             }
               else 
                {
                freq.put(num, 1);
            }
        }
for(Map.Entry<Integer,Integer>entry:freq.entrySet())
{
        System.out.println(entry.getKey()+"->"+entry.getValue());
}

    }
}