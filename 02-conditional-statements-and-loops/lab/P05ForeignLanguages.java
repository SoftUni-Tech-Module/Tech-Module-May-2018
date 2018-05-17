import java.util.Scanner;

public class P05ForeignLanguages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();

        switch (country){
            case "USA":
            case"England":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");

        }
    }

    //using ternary operator
    public static void mainTernaryOperator(String[] args) {
        String country = new Scanner(System.in).next();
        System.out.println(
                country.equals("USA") || country.equals("England") ? "English"
                        :(country.equals("Spain") || country.equals("Argentina") || country.equals("Mexico") ? "Spanish"
                        : "unknown"));
    }
}
