import java.util.Arrays;
import java.util.Scanner;

public class p04TripleSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean hasFoundSum = false;

        for (int currIndex = 0; currIndex < nums.length; currIndex++) {
            for (int nextIndex = currIndex + 1; nextIndex < nums.length; nextIndex++) {
                int sum = nums[currIndex] + nums[nextIndex];

                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == sum) {
                        System.out.printf("%d + %d == %d%n", nums[currIndex], nums[nextIndex], sum);
                        hasFoundSum = true;
                        break;
                    }
                }
            }
        }

        if (hasFoundSum == false) {
            System.out.println("No");
        }
    }
}
