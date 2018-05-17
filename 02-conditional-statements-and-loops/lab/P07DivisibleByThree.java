//import java.util.Scanner;

public class P07DivisibleByThree {

    public static void main(String[] args) {
        //we don`t need console because we don`t receive input
        //Scanner console = new Scanner(System.in);

        //cheating with step 3
        for (int i = 3; i <= 100; i+=3) {
            System.out.println(i);
        }

        //using modulus operator => returns the reminder of the division
        //for (int i = 3; i < 100; i++) {
        //            if (i % 3 == 0){
        //                System.out.println(i);
        //            }
        //        }
    }

}
