import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p01RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                //.filter(n -> n > 0) -> easier approach
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) <= 0) {
                numbers.remove(i);
                i--;
            }
        }

        if (numbers.size() > 0) {
            Collections.reverse(numbers);
            for (Integer num : numbers) {
                System.out.printf("%d ", num);
            }
        } else {
            System.out.println("empty");
        }
    }
}
