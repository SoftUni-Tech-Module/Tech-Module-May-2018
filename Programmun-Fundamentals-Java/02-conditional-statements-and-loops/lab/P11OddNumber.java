import java.util.Scanner;

public class P11OddNumber {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        while (n % 2 == 0) {
            System.out.println("Please write an odd number.");
            n = Integer.parseInt(console.nextLine());
        }

        System.out.print("The number is: " + Math.abs(n));
    }
}
