
public class ReverseTriangle{
    public static void main(String[] args) {
        for(int i = 5; i >= 1; i--) {   // i controls the row stars count
            for(int j = 1; j <= i; j++) { // j prints stars i times
                System.out.print("* ");
            }
            System.out.println(); // move to next line
        }
    }
}
