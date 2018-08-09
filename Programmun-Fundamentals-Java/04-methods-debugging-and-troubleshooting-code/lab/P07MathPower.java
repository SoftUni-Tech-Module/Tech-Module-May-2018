import java.text.DecimalFormat;
import java.util.Scanner;

public class P07MathPower {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        double num = Double.parseDouble(console.nextLine());
        double pow  = Double.parseDouble(console.nextLine());
        DecimalFormat df = new DecimalFormat("#.####");


        double sum = calcPower(num,pow);
        System.out.println(df.format(sum));
    }

    static double calcPower(double number, double power){
        return Math.pow(number,power);

    }
}

