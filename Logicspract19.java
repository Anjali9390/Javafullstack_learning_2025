public class Logicspract19 {
    public static void main(String[]args)
    {
        int arr[]={1,3,4,6,7,5,4,3,1};
    int currentcount=1;
        int maxcount=1;
        for(int i=1;i<arr.length;i++)
        {
          if(arr[i]>arr[i-1])
          {
              currentcount++;
          }
else
{
              currentcount=1;
          }
           if (currentcount > maxcount) {
                maxcount = currentcount;
            }

        }
 System.out.println("Longest length = " + maxcount);
    }
    
}
