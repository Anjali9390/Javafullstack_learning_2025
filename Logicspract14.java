import javax.sound.midi.SysexMessage;

public class Logicspract14
{
   
    public static void main(String[] args) {

        int start = 1;   // starting number

        for(int i = 1; i <= 4; i++) {       // rows
            int num = start;                // reset for row

            for(int j = 1; j <= i; j++) {   // columns
                System.out.print(num + " ");
                num++;
            }

            start = num - 1;  
            System.out.println();
        }
    }
}
