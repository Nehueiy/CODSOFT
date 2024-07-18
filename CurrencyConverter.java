import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base currency (e.g., USD): ");
        String baseCurrency = scanner.next().toUpperCase();
        System.out.println("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.next().toUpperCase();
        System.out.println("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        double exchangeRate = fetchExchangeRate(baseCurrency, targetCurrency);
        double convertedAmount = amount * exchangeRate;

        System.out.printf("%.2f %s = %.2f %s%n", amount, baseCurrency, convertedAmount, targetCurrency);

        scanner.close();
    }

    private static double fetchExchangeRate(String baseCurrency, String targetCurrency) {
        // This method should connect to an API to fetch the real-time exchange rate.
        // For demonstration purposes, let's assume a fixed exchange rate.
        return 0.85; // Example: 1 USD = 0.85 EUR
    }
}

