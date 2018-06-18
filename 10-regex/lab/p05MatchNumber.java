import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p05MatchNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        final String regex = "(^|(?<=\\s))-?\\d+(\\.\\d+)?($|(?=\\s))";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.printf("%s ", matcher.group());
        }

    }
}
