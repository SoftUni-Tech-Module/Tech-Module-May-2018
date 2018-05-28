import java.util.Scanner;

public class P08GreaterOfTwoValues {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String type = console.nextLine();

        switch (type) {
            case "int": {
                int first = Integer.parseInt(console.nextLine());
                int second = Integer.parseInt(console.nextLine());
                int max = GetMax(first, second);
                System.out.println(max);
                break;
            }
            case "char": {
                char first = (console.nextLine()).charAt(0);
                char second = (console.nextLine()).charAt(0);
                char max = GetMax(first, second);
                System.out.println(max);
                break;
            }
            default: {
                String first = console.nextLine();
                String second = console.nextLine();
                String max = GetMax(first, second);
                System.out.println("" + max);
                break;
            }
        }

    }

    static int GetMax(int first, int second) {
        if (first >= second) {
            return first;
        } else {
            return second;
        }
    }

    static char GetMax(char first, char second) {
        if (first > second) {
            return first;
        } else if (first < second) {
            return second;
        } else {
            return first;
        }
    }

    static String GetMax(String first, String second) {
        if (first.compareTo(second) > 0) {
            return first;
        } else if (first.compareTo(second) < 0) {
            return second;
        } else {
            return first;
        }
    }
}
