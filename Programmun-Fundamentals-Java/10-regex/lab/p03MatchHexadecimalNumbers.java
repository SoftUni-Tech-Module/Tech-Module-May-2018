import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p03MatchHexadecimalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        final String regex = "\\b(?:0x)?[0-9A-F]+\\b";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.printf("%s ", matcher.group());
        }
    }
}
