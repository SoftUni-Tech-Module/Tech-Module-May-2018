import java.util.Scanner;

public class p03TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] filterWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String filterWord : filterWords) {
            String replacement = getReplacement(filterWord);
            text = text.replaceAll(filterWord, replacement);
        }

        System.out.println(text);
    }

    private static String getReplacement(String filterWord) {
        StringBuilder replacement = new StringBuilder();

        for (int i = 0; i < filterWord.length(); i++) {
            replacement.append("*");
        }

        return replacement.toString();
    }
}
