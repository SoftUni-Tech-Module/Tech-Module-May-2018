import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p04MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        final String regex = "\\b(\\d{2})([-.\\\\/])([A-Z][a-z]{2})\\2(\\d{4})\\b";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String day = matcher.group(1);
            String month = matcher.group(3);
            String year = matcher.group(4);

            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);
        }
    }
}
