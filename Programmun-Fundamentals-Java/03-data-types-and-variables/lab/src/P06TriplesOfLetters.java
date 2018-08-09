import java.util.Scanner;

public class P06TriplesOfLetters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {

                    char firstLetter = (char) ('a' + i);
                    char secondLetter = (char) ('a' + j);
                    char thirdLetter = (char) ('a' + k);

					//printing with format
                    System.out.printf("%c%c%c %n", firstLetter, secondLetter, thirdLetter);
                }
            }
        }
    }
}