import java.util.Scanner;

public class P02CircleArea {
	
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
		double r = Double.parseDouble(console.nextLine());
        double a = r * r * Math.PI;
        System.out.printf("%.12f",a);
    }
}