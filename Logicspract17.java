public class Logicspract17
{
    public static void main(String[] args)
    {
        int n = 783452;
        int count = 0;

        while(n > 0)
        {
            int digit = n % 10;   // get last digit

            if(digit > 5)
            {
                count++;
            }

            n = n / 10;          // remove last digit
        }

        System.out.println("Count greater than 5 = " + count);
    }
}
