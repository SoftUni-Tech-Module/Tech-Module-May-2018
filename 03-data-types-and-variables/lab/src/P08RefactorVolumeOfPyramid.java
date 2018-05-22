import java.util.Scanner;

public class P08RefactorVolumeOfPyramid {
    public static void main(String[] args) {
		
        Scanner console = new Scanner(System.in);
		//we can initialize multiple variable on single line -> not a good practice
        //double lenght, width, height = 0;
		
        System.out.print("Length: ");
        double lenght = Double.parseDouble(console.nextLine());
        System.out.print("Width: ");
        double width = Double.parseDouble(console.nextLine());
        System.out.print("Height: ");
        double height = Double.parseDouble(console.nextLine());
        
		double volume = (lenght * width * height)/3 ;
        System.out.printf("Pyramid Volume: %.2f", volume);

    }
}
