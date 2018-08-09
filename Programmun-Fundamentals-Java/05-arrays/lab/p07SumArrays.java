import java.util.Arrays;
import java.util.Scanner;

public class p07SumArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxLen = Math.max(arr1.length, arr2.length);
        int[] sumArr = new int[maxLen];

        for (int i = 0; i < maxLen; i++) {
            sumArr[i] = arr1[i % arr1.length] + arr2[i % arr2.length];
        }

        for (int num : sumArr) {
            System.out.printf("%d ", num);
        }
    }
}
