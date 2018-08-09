import java.text.DecimalFormat;
import java.util.Scanner;

public class P06CalculateTriangleArea {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        DecimalFormat format = new DecimalFormat ("#.########");

        double width = Double.parseDouble(console.nextLine());
        double height = Double.parseDouble(console.nextLine());
        double area = CalculateTriangleArea(width, height);

        System.out.println(format.format(area));
    }

    static double CalculateTriangleArea(double width, double height)
    {
        return (width * height) / 2;
    }
}
