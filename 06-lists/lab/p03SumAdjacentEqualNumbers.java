import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p03SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            double currentNum = numbers.get(i);
            double nextNum = numbers.get(i + 1);

            if (currentNum == nextNum) {
                numbers.set(i, currentNum + nextNum); //aggregate the numbers
                numbers.remove(i + 1);
                i = -1; //reset the loop
            }
        }

        for (Double num : numbers) {
            System.out.printf("%f ", num);
        }
    }
}
