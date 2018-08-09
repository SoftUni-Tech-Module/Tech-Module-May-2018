import java.util.Scanner;

public class P02SignOfIntegerNumber {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());

        PrintNumberSign(num);

    }

    static void PrintNumberSign(int num) {
        String result = "zero";
        if (num > 0) {
            result = "positive";
        } else if (num < 0) {
            result="negative";
        }

        System.out.printf("The number %d is %s.",num,result);
    }
}
