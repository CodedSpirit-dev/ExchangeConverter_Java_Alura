package exchangeconverter.view;

import exchangeconverter.model.ConversionTarget;
import exchangeconverter.controller.ExchangeRateController;
import java.util.Scanner;

/**
 * Represents the console view for the Exchange Rate Converter application.
 * This class is responsible for displaying the user interface in the console,
 * capturing user input, and initiating currency conversion operations.
 */
public class ConsoleView {
    private final Scanner keyboard = new Scanner(System.in);
    private final ExchangeRateController exchangeRateController = new ExchangeRateController();

    /**
     * Displays the main menu and handles user input to perform currency conversions
     * or exit the application. This method loops until the user chooses to exit.
     */
    public void showMenu() {
        int option;
        do {
            System.out.println("""
                    **********
                    Welcome to the Exchange Rate Converter
                    1) Dollar =>> Argentine Peso
                    2) Argentine Peso =>> Dollar
                    3) Dollar =>> Brazilian Real
                    4) Brazilian Real =>> Dollar
                    5) Dollar =>> Mexican Peso
                    6) Mexican Peso =>> Dollar
                    7) Dollar =>> Colombian Peso
                    8) Colombian Peso =>> Dollar
                    9) Exit
                    **********
                    """);
            option = keyboard.nextInt();
            keyboard.nextLine(); // Consume newline left-over
            handleOption(option);
        } while (option != 9);
    }

    /**
     * Handles the selected option from the main menu.
     * Initiates currency conversion based on the user's selection or exits the application.
     *
     * @param option The user-selected option from the main menu.
     */
    private void handleOption(int option) {
        switch (option) {
            case 1 -> convertCurrency(ConversionTarget.USD_ARS, "dollar", "Argentine Peso");
            case 2 -> convertCurrency(ConversionTarget.ARS_USD, "Argentine Peso", "dollar");
            case 3 -> convertCurrency(ConversionTarget.USD_BRL, "dollar", "Brazilian Real");
            case 4 -> convertCurrency(ConversionTarget.BRL_USD, "Brazilian Real", "dollar");
            case 5 -> convertCurrency(ConversionTarget.USD_MXN, "dollar", "Mexican Peso");
            case 6 -> convertCurrency(ConversionTarget.MXN_USD, "Mexican Peso", "dollar");
            case 7 -> convertCurrency(ConversionTarget.USD_COP, "dollar", "Colombian Peso");
            case 8 -> convertCurrency(ConversionTarget.COP_USD, "Colombian Peso", "dollar");
            case 9 -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid option");
        }
    }

    /**
     * Initiates a currency conversion operation.
     * Displays the conversion rate for the selected currency pair.
     *
     * @param target The conversion target, representing the currency pair to convert.
     * @param fromCurrency The name of the source currency.
     * @param toCurrency The name of the target currency.
     */
    private void convertCurrency(ConversionTarget target, String fromCurrency, String toCurrency) {
        double conversionRate = exchangeRateController.convertCurrency(target);
        System.out.printf("1 %s to %s is %.3f%n", fromCurrency, toCurrency, conversionRate);
    }
}