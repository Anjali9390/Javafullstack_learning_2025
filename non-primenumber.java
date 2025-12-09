public class non-primenumber
{
public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int N = 4;          // matrix size (4x4)
        int number = 1;
        int count = 0;

        while (count < N * N) {   // total 16 values required

            if (!isPrime(number)) {     // skip prime numbers
                System.out.print(number + "\t");
                count++;

                if (count % N == 0) {   // move to next line after 4 numbers
                    System.out.println();
                }
            }
            number++;
        }
    }
}
