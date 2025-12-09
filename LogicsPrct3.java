public class LogicsPrct3 {

    public static boolean isprime(int num)
    {
        if(num <= 1) {
            return false;
        }

        for(int i = 2; i <= num / 2; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        int input = 5;
        int n = 1;

        String[] rows = new String[input];  // store each row

        for(int i = 1; i <= input; i++)
        {
            int c = 0;
            int temp[] = new int[i];

            while(c < i)
            {
                if(!isprime(n))   // take only non-prime
                {
                    temp[c] = n;
                    c++;
                }
                n++;
            }

            String row = "";
            if(i % 2 == 0)
            {
                for(int j = i-1; j >= 0; j--)
                {
                    row += temp[j] + " ";
                }
            }
            else
            {
                for(int j = 0; j < i; j++)
                {
                    row += temp[j] + " ";
                }
            }

            rows[i-1] = row;   // save row in array
        }

        // print bottom to top
        for(int k = input-1; k >= 0; k--) {
            System.out.println(rows[k]);
        }
    }
}
