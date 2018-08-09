import java.util.Arrays;
import java.util.Scanner;

public class p05RoundingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        for (int i = 0; i < nums.length; i++) {
            double rounded = roundNumber(i, nums);
            System.out.printf("%f => %.0f%n", nums[i], rounded);
        }
    }

    private static double  roundNumber(int index, double[] nums) {
        double num = nums[index];

        double absoluteValue = Math.abs(num);
        double increasedNumber = absoluteValue + 0.5;
        double truncatedToInteger = Math.floor(increasedNumber);

        if (nums[index] < 0) {
            truncatedToInteger = truncatedToInteger * -1;
        }

        return truncatedToInteger;
    }
}
