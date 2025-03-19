public class Threads {
    public static void main(String[] args) {
        int a = 10;
        int b;
        try {
            b = a / 0;  
            System.out.println(b);
        } catch (ArithmeticException e) {  
            System.out.println("Please provide proper values");  
        }
    }
}
