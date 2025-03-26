public class PatternA {
    public static void main(String[] args) {
        int n = 7; // Height of the pattern
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                // Logic to print "A"
                if ((j == 0 || j == n) && i != 0 ||
                    i == 0 && j != 0 && j != n ||  
                    i == n / 2) {                
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
