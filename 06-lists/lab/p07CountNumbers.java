import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p07CountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read numbers and sort them, which will make the counting easier.
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        //Get first number
        int currentNumber = numbers.get(0);

        //Remove first number, otherwise our algorithm won't work properly for the first number
        numbers.remove(0);

        int currentCounter = 1;

        for (Integer num : numbers) {
            if (num == currentNumber) {
                currentCounter++;
            } else {
                System.out.printf("%d -> %d%n", currentNumber, currentCounter);

                currentNumber = num;
                currentCounter = 1; //reset the counter
            }
        }

        //Print the last repeating number
        System.out.printf("%d -> %d", currentNumber,currentCounter);
    }
}
