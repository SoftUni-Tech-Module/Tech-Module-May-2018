import java.util.Arrays;
        import java.util.Scanner;

public class p09ExtractMiddleElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int length = nums.length;

        if (length % 2 == 0) {
            System.out.printf("{ %d, %d }", nums[length / 2 - 1], nums[length / 2]);
        } else if (length == 1) {
            System.out.printf("{ %d }", nums[0]);
        } else {
            System.out.printf("{ %d, %d, %d }",
                    nums[length / 2 - 1],
                    nums[length / 2],
                    nums[length / 2 + 1]);
        }
    }
}
