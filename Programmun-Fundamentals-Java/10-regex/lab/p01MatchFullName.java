import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p01MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        final String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.printf("%s ", matcher.group());
        }
    }
}
