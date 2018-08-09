import java.util.Arrays;
import java.util.Scanner;

public class p05ShortWordsSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays.stream(scanner.nextLine().split("[\\\\,:;.!()\"'/\\[\\]\\s+]+"))
                .map(String::toLowerCase)
                .filter(w -> w.length() < 5)
                .sorted()
                .distinct()
                .toArray(String[]::new);

        System.out.println(String.join(", ", words));
    }
}
