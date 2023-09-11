import java.io.IOException;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) throws IOException {
        
        CurrencyConverter cc = new CurrencyConverter();

        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the source currency: ");
        String sourceCurrency = scanner.nextLine();

        
        System.out.print("Enter the amount to convert: ");
        float amount = scanner.nextFloat();

        
        System.out.print("Enter the destination currency: ");
        String destinationCurrency = scanner.nextLine();

        
        float exchangeRate =cc.getRate(sourceCurrency, destinationCurrency);

        
        float convertedAmount = amount * exchangeRate;

        
        System.out.println("The converted amount is " + convertedAmount + " " + destinationCurrency);
    }
}