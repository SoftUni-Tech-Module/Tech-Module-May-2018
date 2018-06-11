import java.math.BigInteger;
import java.util.Scanner;

public class p03BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());
        BigInteger factorial = findFactorial(inputNumber);

        System.out.println(factorial);
    }

    private static BigInteger findFactorial(int inputNumber) {
        BigInteger factorial = BigInteger.valueOf(1);

        for (int i = inputNumber; i >= 1; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}
