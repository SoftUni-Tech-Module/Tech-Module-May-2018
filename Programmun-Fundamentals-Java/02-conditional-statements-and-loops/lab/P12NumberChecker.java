import java.util.Scanner;

public class P12NumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("It is a number.");
        }catch (Exception ex){
            //Houston, we have a problem!
            System.out.println("Invalid input!");
        }

    }
}
