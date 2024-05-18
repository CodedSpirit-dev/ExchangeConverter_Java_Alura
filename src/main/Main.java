package main;

import exchangeconverter.model.UrlApi;
import exchangeconverter.service.ApiConsume;

import java.util.Scanner;

public class Main {
    // Constant for the URL with the API key
    private final String URL_WITH_APIKEY = UrlApi.buildUrlWithApiKey();
    // Instance of the Scanner class
    private final Scanner keyboard = new Scanner(System.in);
    // Instance of the ApiConsume class
    private final ApiConsume apiConsume = new ApiConsume();

    public void showMenu() {
        var option = -1;

        // Loop until the user chooses to exit
        while (option != 0) {
            var menu = """
                    **********
                    Welcome to the Exchange Rate Converter
                    1) Dolar =>> Argentine Peso
                    2) Argentine Peso =>> Dolar
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
            // Get the user's choice
            option = keyboard.nextInt();
            keyboard.nextLine();

            // Call the method that corresponds to the user's choice
            switch (option) {
                case 1 -> convertDollarToArgentinePeso();
                case 2 -> convertArgentinePesoToDollar();
                case 3 -> convertDollarToBrazilianReal();
                case 4 -> convertBrazilianRealToDollar();
                case 5 -> convertMexicanPesoToDollar();
                case 6 -> convertDollarToMexicanPeso();
                case 7 -> convertDollarToColombianPeso();
                case 8 -> convertColombianPesoToDollar();
                case 9 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid option");
            }
        }
    }

    private void convertArgentinePesoToDollar() {

    }

    private void convertDollarToArgentinePeso() {
        
    }
}
