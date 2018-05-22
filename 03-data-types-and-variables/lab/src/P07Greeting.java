import java.util.Scanner;

public class P07Greeting {

    public static void main(String[] args) {
		
        Scanner console = new Scanner(System.in);
		
        String firstName = console.nextLine();
        String lastName = console.nextLine();
        int age = Integer.parseInt(console.nextLine());
        System.out.println("Hello, "+firstName+" "+lastName+". You are " +age+" years old.");
		
		console.close();
    }
}