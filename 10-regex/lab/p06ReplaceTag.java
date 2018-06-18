import java.util.Scanner;

public class p06ReplaceTag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String replacement = "[URL href=$1]$2[/URL]";
        final String regex = "<a.*?href.*?=(.*)>(.*?)</a>";

        String input;
        while (!(input = scanner.nextLine()).equals("end")) {
            String replaced = input.replaceAll(regex, replacement);
            System.out.println(replaced);
        }
    }
}
