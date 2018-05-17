import java.util.Scanner;

public class P10MultiplicationTable2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        if (multiplier > 10) {
            System.out.printf("%d X %d = %d%n", number, multiplier, number * multiplier);
            return;
        }

        for (int i = multiplier; i <= 10; i++) {
            System.out.println(String.format("%d X %d = %d", number, i, number * i));
        }
    }
}
