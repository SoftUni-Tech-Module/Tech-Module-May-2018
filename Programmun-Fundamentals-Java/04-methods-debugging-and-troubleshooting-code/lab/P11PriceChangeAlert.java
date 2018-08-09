import java.text.DecimalFormat;
import java.util.Scanner;

public class P11PriceChangeAlert {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int pricesCount = Integer.parseInt(reader.nextLine());
        double significanceThreshold = Double.parseDouble(reader.nextLine()) * 100.0;
        double previousPrice = Double.parseDouble(reader.nextLine());

        for (int i = 0; i < pricesCount - 1; i++)
        {
            double currentPrice = Double.parseDouble(reader.nextLine());
            double percentDifference = GetPercentageDifference(previousPrice, currentPrice);
            boolean isSignificantDifference = IsThereSignificantDifference(percentDifference, significanceThreshold);

            String message = GetMessage(currentPrice, previousPrice, percentDifference, isSignificantDifference);
            System.out.println(message);
            previousPrice = currentPrice;
        }

    }

    static String GetMessage(double currentPrice, double previousPrice, double percentageDifference, boolean isSignificantDifference)
    {
        DecimalFormat df = new DecimalFormat("#.#####");

        if (percentageDifference == 0)
        {
            return String.format("NO CHANGE: %s",df.format( currentPrice));
        }

        if (!isSignificantDifference)
        {
            return String.format("MINOR CHANGE: %s to %s (%.2f%%)", df.format(previousPrice),df.format( currentPrice), percentageDifference);
        }

        if (percentageDifference > 0)
        {
            return String.format("PRICE UP: %s to %s (%.2f%%)", df.format(previousPrice), df.format( currentPrice), percentageDifference);
        }

        return String.format("PRICE DOWN: %s to %s (%.2f%%)",df.format(previousPrice),df.format( currentPrice), percentageDifference);
    }

    static boolean IsThereSignificantDifference(double percentageDifference, double significanceThreshold)
    {
        return Math.abs(percentageDifference) >= significanceThreshold;
    }

    static double GetPercentageDifference(double previousPrice, double currentPrice)
    {
        return (currentPrice - previousPrice) / previousPrice * 100.0;
    }
}
