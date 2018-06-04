import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p04SplitByWordCasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] allWords = Arrays.stream(scanner.nextLine().split("[\\\\,:;.!()\"'/\\[\\]\\s]+"))
                .filter(w -> w.length() > 0) //remove empty entries
                .toArray(String[]::new);

        ArrayList<String> lowerCaseWords = new ArrayList<>();
        ArrayList<String> mixedCaseWords = new ArrayList<>();
        ArrayList<String> upperCaseWords = new ArrayList<>();

        for (String word : allWords) {
            if (isUpperCase(word)) {
                upperCaseWords.add(word);
            } else if (isLowerCase(word)) {
                lowerCaseWords.add(word);
            } else {
                mixedCaseWords.add(word);
            }
        }

        System.out.printf("Lower-case: %s%n", String.join(", ", lowerCaseWords));
        System.out.printf("Mixed-case: %s%n", String.join(", ", mixedCaseWords));
        System.out.printf("Upper-case: %s%n", String.join(", ", upperCaseWords));
    }

    private static boolean isLowerCase(String word) {
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            if (!Character.isLowerCase(currentChar)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isUpperCase(String word) {
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            if (!Character.isUpperCase(currentChar)) {
                return false;
            }
        }

        return true;
    }
}
