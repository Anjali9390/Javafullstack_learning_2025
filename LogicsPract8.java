public class LogicsPract8 {
    public static void main(String[] args) {

        int rows = 3;      // number of rows
        int cols = 4;      // number of columns
        int num = 1;       // starting number

        for(int i = 1; i <= rows; i++) {      // rows
            for(int j = 1; j <= cols; j++) {  // columns
                System.out.print(num + " ");
                num++;
            }
            System.out.println();  // next row
        }
    }
}
