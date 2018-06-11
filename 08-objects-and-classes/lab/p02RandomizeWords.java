import java.util.Random;
import java.util.Scanner;

public class p02RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Random random = new Random();

        for (int pos1 = 0; pos1 < words.length; pos1++) {
            int pos2 = random.nextInt(words.length);

            String temp = words[pos1];
            words[pos1] = words[pos2];
            words[pos2] = temp;
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}
