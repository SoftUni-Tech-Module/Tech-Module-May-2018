import java.util.Scanner;

public class P08SumOfOddNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 1; i <= num * 2; i += 2) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }

    public static void mainModulus(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int oddSum= 0;
        int count=0;
        for (int i = 1; ; i++) {
            if(i%2!=0){
                oddSum+=i;
                count++;
                System.out.println(i);
            }
            if(count==num){
                break;
            }
        }

        System.out.printf("Sum: %s",oddSum);

    }
}
