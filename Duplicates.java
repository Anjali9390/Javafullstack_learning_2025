
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anjali", "Ravi", "Anjali", "Kiran", "Ravi");

        List<String> uniqueNames = names.stream()
                                        .distinct()
                                        .collect(Collectors.toList());

        System.out.println("Unique names: " + uniqueNames);
    }
}
