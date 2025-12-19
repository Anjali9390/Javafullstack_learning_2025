import java.util.*;

public class MultipleCount {
    public static void main(String[] args) {

        int[] arr = {1,2,8,9,12,46,7,76,82,15,20,30};

        Map<Integer, Integer> result = new HashMap<>();

        for (int d = 1; d <= 9; d++) {

            int count = 0;

            for (int num : arr) {
                if (num % d == 0) {
                    count++;
                }
            }

            result.put(d, count);
        }

        System.out.println(result);
    }
}
