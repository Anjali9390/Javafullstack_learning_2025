public class IncreaseTriangle {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int N = 5;        // rows
        int number = 1;   // start number

        for (int i = 1; i <= N; i++) {   // rows
            int count = 0;               // how many numbers printed in row

            while (count < i) {          // fill row numbers

                if (!isPrime(number)) {               // skip prime numbers
                    if (i % 2 != 0 && number % 2 == 0) {     // odd row → even numbers
                        System.out.print(number + " ");
                        count++;
                    }
                    else if (i % 2 == 0 && number % 2 != 0) { // even row → odd numbers
                        System.out.print(number + " ");
                        count++;
                    }
                }
                number++;   // next number
            }

            System.out.println();   // next line
        }
    }
}


