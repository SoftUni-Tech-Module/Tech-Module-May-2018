import java.util.Scanner;

public class P01Passed {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grade = Double.parseDouble(scan.nextLine());

        if (grade >= 3){
            System.out.print("Passed!");
        }
    }
}
