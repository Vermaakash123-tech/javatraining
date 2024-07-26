import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conversion rates (example rates, adjust as needed)
        double usdToInrRate = 0.83;  // 1 USD = 0.85 EUR
        double inrToUsdRate = 1.18;  // 1 EUR = 1.18 USD

        System.out.println("Currency Converter");
        System.out.println("Choose an option:");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        int choice = scanner.nextInt();

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        double convertedAmount;

        switch (choice) {
            case 1:
                convertedAmount = amount * usdToInrRate;
                System.out.printf("USD %.2f is equivalent to INR %.2f%n", amount, convertedAmount);
                break;
            case 2:
                convertedAmount = amount * inrToUsdRate;
                System.out.printf("INR %.2f is equivalent to USD %.2f%n", amount, convertedAmount);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}