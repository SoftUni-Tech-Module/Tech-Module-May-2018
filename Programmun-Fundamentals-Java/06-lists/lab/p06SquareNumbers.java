import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p06SquareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> squareNumbers = new ArrayList<>();

        for (int number : inputNumbers) {
            if (Math.sqrt(number) == (int) (Math.sqrt(number))) {
                squareNumbers.add(number);
            }
        }

        squareNumbers.stream()
                .sorted((e1, e2) -> Integer.compare(e2, e1)) //order in descending order
                .forEach(n -> System.out.printf("%d ", n));
    }
}
