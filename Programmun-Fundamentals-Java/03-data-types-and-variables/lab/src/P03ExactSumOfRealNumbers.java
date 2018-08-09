import java.math.BigDecimal;
import java.util.Scanner;
//Solution using BigDecimal

public class P03ExactSumOfRealNumbers{
	
    public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
        Integer numbersCount = Integer.parseInt(console.nextLine());
        BigDecimal sum = new BigDecimal(0);
        
		for (int i = 0; i < numbersCount; i++) {
            sum = sum.add(new BigDecimal(console.nextLine()));
        }
        System.out.println(sum);
    }
}