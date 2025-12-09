public class Diamondpa {

    // Method to check prime number
    public static boolean isprime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;  // not prime
            }
        }
        return true; // prime
    }

    public static void main(String[] args) {

        int[] rowcounts = {1, 2, 3, 2, 1}; // diamond shape
        int number = 1;

        for (int i = 0; i < rowcounts.length; i++) {

            int count = 0;
            int needed = rowcounts[i];

            // print spaces to center pattern
            int spaces = 3 - needed;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            // print non-prime numbers
            while (count < needed) {
                if (!isprime(number)) {         // skip prime
                    System.out.print(number + " ");
                    count++;
                }
                number++;
            }

            System.out.println();
        }
    }
}
