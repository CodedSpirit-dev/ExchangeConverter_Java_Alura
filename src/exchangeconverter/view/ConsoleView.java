package exchangeconverter.view;

import exchangeconverter.model.ConversionTarget;
import exchangeconverter.controller.ExchangeRateController;
import java.util.Scanner;

/**
 * The ConsoleView class provides the user interface for the Exchange Rate Converter application.
 * It displays the main menu and handles user input to perform currency conversions.
 */
public class ConsoleView {
    private final Scanner keyboard = new Scanner(System.in);
    private final ExchangeRateController exchangeRateController = new ExchangeRateController();

    /**
     * Displays the main menu and processes user input until the user chooses to exit.
     * It allows the user to select a currency conversion operation or to exit the application.
     */
    public void showMenu() {
        int option = -1;
        while (option != 0) {
            String menu = """
                    **********
                    Welcome to the Exchange Rate Converter
                    1) Dollar =>> Argentine Peso
                    2) Argentine Peso =>> Dollar
                    3) Dollar =>> Brazilian Real
                    4) Brazilian Real =>> Dollar
                    5) Mexican Peso =>> Dollar
                    6) Dollar =>> Mexican Peso
                    7) Dollar =>> Colombian Peso
                    8) Colombian Peso =>> Dollar
                    9) Exit
                    **********
                    """;
            System.out.println(menu);
            option = keyboard.nextInt();
            keyboard.nextLine();

            switch (option) {
                case 1:
                    convertDollarToArgentinePeso();
                    break;
                case 9:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    /**
     * Handles the conversion from Dollar to Argentine Peso.
     * It fetches the current conversion rate from the ExchangeRateController and displays the result.
     */
    private void convertDollarToArgentinePeso() {
        double conversionRate = exchangeRateController.convertCurrency(ConversionTarget.USD_ARS);
        String output = String.format("1 dollar to Argentine Peso is %.3f ARS", conversionRate);
        System.out.println(output);
    }
}