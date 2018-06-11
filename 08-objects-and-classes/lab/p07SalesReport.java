import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p07SalesReport {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int inputCount = Integer.parseInt(scanner.nextLine());

        Sale[] sales = readSales(inputCount);
        TreeMap<String, Double> salesByTown = calculateSalesByTown(sales);

        for (Map.Entry<String, Double> townMoney : salesByTown.entrySet()) {
            System.out.printf("%s -> %.2f%n", townMoney.getKey(), townMoney.getValue());
        }
    }

    private static TreeMap<String, Double> calculateSalesByTown(Sale[] sales) {
        //We need to print the sales ordered by the town name
        TreeMap<String, Double> salesByTown = new TreeMap<>();

        for (Sale sale : sales) {
            String town = sale.getTown();
            double moneyPerSale = sale.getPrice() * sale.getQuantity();

            if (salesByTown.containsKey(town)) {
                salesByTown.put(town, salesByTown.get(town) + moneyPerSale);
            } else {
                salesByTown.put(town, moneyPerSale);
            }
        }

        return salesByTown;
    }

    private static Sale[] readSales(int inputCount) {
        Sale[] sales = new Sale[inputCount];

        for (int i = 0; i < inputCount; i++) {
            String[] tokens = scanner.nextLine().split(" ");

            String town = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);
            double quantity = Double.parseDouble(tokens[3]);

            sales[i] = new Sale(town, product, price, quantity);
        }

        return sales;
    }

    static class Sale {
        private String town;
        private String product;
        private double price;
        private double quantity;

        public Sale(String town, String product, double price, double quantity) {
            this.town = town;
            this.product = product;
            this.price = price;
            this.quantity = quantity;
        }

        public String getTown() {
            return town;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getQuantity() {
            return quantity;
        }

        public void setQuantity(double quantity) {
            this.quantity = quantity;
        }
    }
}
