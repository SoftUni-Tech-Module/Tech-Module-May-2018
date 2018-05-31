import java.util.Scanner;

public class p03LastKNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int takeNumbers = Integer.parseInt(scanner.nextLine());

        long[] nums = new long[size];
        nums[0] = 1;

        for (int i = 1; i < size; i++) {
            long sum = 0;
            for (int j = i - takeNumbers; j <= i - 1; j++) {
                if (j >= 0) {
                    sum += nums[j];
                }
            }

            nums[i] = sum;
        }

        for (int i = 0; i < size; i++) {
            System.out.printf("%d ", nums[i]);
        }
    }
}
