import java.util.Scanner;

public class p02ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = size - 1; i>=0; i--){
            System.out.printf("%d ", nums[i]);
        }
    }
}
