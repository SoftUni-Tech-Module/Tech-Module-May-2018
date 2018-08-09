import java.util.Scanner;

public class P09MultiplyEvensByOdds {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        System.out.println(GetMultiplicationOfEvensAndOdds(number));
    }

    static int GetMultiplicationOfEvensAndOdds(int number)
    {
        number = Math.abs(number);
        // We pass true value to our sumEven boolean, when we want to sum the even digits.
        int evenDigitSum = GetSumOfOddOrEvenDigits(number, true);
        int oddDigitSum = GetSumOfOddOrEvenDigits(number, false);
        return evenDigitSum * oddDigitSum;
    }

    // We use a boolean to determine if we are going to sum even or odd numbers.
    static int GetSumOfOddOrEvenDigits(int number, boolean sumEven)
    {
        // Ternary operator
        // If the boolean sumEven is false, so the remainder of the modulus division
        // should be 1, else it should be 0 (we are going to sum even numbers).
        int remainder = sumEven ? 0 : 1;
        int sum = 0;

        while (number > 0)
        {
            int digit = number % 10;
            if (digit % 2 == remainder)
            {
                sum += digit;
            }
            number /= 10;
        }

        return sum;
    }
}
