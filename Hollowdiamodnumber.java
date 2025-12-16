public class Hollowdiamodnumber
{
    public static void main(String[]args)
    {
   int n = 4; // height of upper half

        // upper half
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // numbers and spaces
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // lower half
        for (int i = n - 1; i >= 1; i--) {

            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // numbers and spaces
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}