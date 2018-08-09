import java.util.Arrays;
import java.util.Scanner;

public class p08CondenseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        while (nums.length > 1) {
            int[] condensed = new int[nums.length - 1];

            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = nums[i] + nums[i + 1];
            }

            nums = condensed;
        }

        System.out.println(nums[0]);
    }
}
