import java.util.Scanner;

public class P01Greeting {

    public static void main(String[] args) {
		// Scanner is the JAVA equivalent of console
		// We need to import it -> see on top
		// console is the name of the variable
        Scanner console = new Scanner(System.in);

        String name = console.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
