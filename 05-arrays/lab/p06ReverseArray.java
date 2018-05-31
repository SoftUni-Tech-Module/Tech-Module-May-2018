import java.util.Scanner;

public class p06ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");
        String[] reversedElements = new String[elements.length];

        for (int i = 0; i < reversedElements.length; i++) {
            reversedElements[i] = elements[elements.length - i - 1];
        }

        System.out.println(String.join(" ", reversedElements));
    }
}
