import java.util.Scanner;

public class p02CountSubstringOccurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();
        String countWord = scanner.nextLine().toLowerCase();

        int counter = 0;
        int index = text.indexOf(countWord);

        while (index != -1) {
            counter++;
            index = text.indexOf(countWord, index + 1);
        }

        System.out.println(counter);
    }
}
