import java.util.Scanner;

public class P05TemperatureConversion {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        double fahrenheit = Double.parseDouble(console.nextLine());
        double celsius = FahrenheitToCelsius(fahrenheit);

        System.out.printf("%.2f",celsius);
    }

    //
    private static double FahrenheitToCelsius(double fahrenheit){

        return ((fahrenheit - 32) * 5) / 9;
    }
}
