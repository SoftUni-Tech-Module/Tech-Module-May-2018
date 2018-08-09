import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class p01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] inputNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        TreeMap<Double, Integer> map = new TreeMap<>();

        DecimalFormat df = new DecimalFormat("#.#########");

        for (double inputNumber : inputNumbers) {
            if (map.containsKey(inputNumber)) {
                map.put(inputNumber, map.get(inputNumber) + 1);
            } else {
                map.put(inputNumber, 1);
            }
        }

        for (Double number : map.keySet()) {
            System.out.printf("%s -> %d%n", df.format(number), map.get(number));
        }
    }
}
