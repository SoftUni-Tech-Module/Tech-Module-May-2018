import java.util.Scanner;

public class p01DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputDay = Integer.parseInt(scanner.nextLine());

        String[] dayNames = new String[]
                {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (inputDay < 1 || inputDay > 7) {
            System.out.println("Invalid Day!");
        } else {
            System.out.println(dayNames[inputDay - 1]);
        }
    }
}
