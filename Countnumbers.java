public class Countnumbers {
    public static void main(String[] args) {

        int count = 1;   // start from 1
        int sum = 0;     // store total

        while(count <= 5) {
            sum = sum + count;   // add current number
            count++;             // increase count
        }

        System.out.println("Sum of first 5 numbers: " + sum);
    }
}
