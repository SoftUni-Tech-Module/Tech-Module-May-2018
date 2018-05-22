import java.util.Scanner;

public class P05SpecialNumbers {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		
		for (int num = 1; num<=n; num++) 
		{
			int sum=0;
			int digits=num;
			
			while(digits>0) {
				sum+=digits%10;
				digits=digits/10;
			}
			
			boolean special = (sum==5) || (sum==7) || (sum==11);
			
			System.out.println(num+" -> "+special);
		}
	}
}