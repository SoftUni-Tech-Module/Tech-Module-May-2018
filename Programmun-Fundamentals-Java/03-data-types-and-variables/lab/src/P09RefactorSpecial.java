import java.util.Scanner;

public class P09RefactorSpecial {
    public static void main(String[] args) {
		
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        for(int i = 1; i <= number; i++) 
		{
            int sum = 0, digits = i;
            while(digits > 0) 
			{
                sum += digits % 10;
                digits /= 10;
            }
			
            boolean condition = (sum == 5 || sum == 7 || sum == 11);
			//ternary in java
            System.out.format(condition ? "%d -> True%n" : "%d -> False%n", i);
        }
    }
}