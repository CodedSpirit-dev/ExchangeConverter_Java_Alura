package com.exchangeconverter.bashconverter.api;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ExchangeRateApi {

    private final String baseUrl = "https://v6.exchangerate-api.com/v6/9beb9440922d7b3f38f00bc4";

    public ExchangeRateApi(){

    }

    public void getLatestExchangeRates() {
        // Ask for the currency to know the exchange rate

        System.out.println("Enter the currency you want to know the exchange rate for, default value is USD:");
        Scanner scanner = new Scanner(System.in);
        String currency = scanner.nextLine(); // Actualizar la variable existent

        if (currency.isEmpty()) {
            currency = "USD";
        }

        // Create the URL with the currency
        String url = baseUrl + "/latest/" + currency;

        // Create a new HTTP request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        System.out.println(url);
        //
        try {
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getLatestExchangeRatesWithAmount() {

        // Solicitar la moneda desde la que se va a convertir
        Scanner scannerCurrencyBase = new Scanner(System.in);
        System.out.println("Enter the currency you want to convert from:");
        String currencyBase = scannerCurrencyBase.nextLine(); // Actualizar la variable existente

        // Solicitar la moneda a la que se va a convertir
        Scanner scannerCurrencyTarget = new Scanner(System.in);
        System.out.println("Enter the currency you want to convert to:");
        String currencyTarget = scannerCurrencyTarget.nextLine(); // Actualizar la variable existente

        // Solicitar la cantidad a convertir
        Scanner scannerAmount = new Scanner(System.in);
        double amount;
        while (true) {
            System.out.println("Enter the amount you want to convert:");
            try {
                amount = Double.parseDouble(scannerAmount.nextLine()); // Actualizar la variable existente
                break; // Si la conversión es exitosa, sal del bucle
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount, please enter a number.");
                System.out.println("Do you want to try again? Enter 1 for yes, 2 for no, or 3 to go back to the main menu:");
                int user = Integer.parseInt(scannerAmount.nextLine());
                if (user == 2) {
                    System.out.println("Goodbye!");
                    return; // Sal del método si el usuario elige salir
                }
            }
        }

        // Crear la URL con la moneda base, la moneda objetivo y la cantidad
        String url = baseUrl + "/pair/" + currencyBase + "/" + currencyTarget + "/" + amount;
        System.out.println(url);

        // Create a new HTTP request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        // Send the request and get the response
        try {
            // Send the request and get the response
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

            // Parse the JSON response
            String JSON = response.body();
            Gson gson = new GsonBuilder().create();
            JsonObject jsonObject = gson.fromJson(JSON, JsonObject.class);

            // Extract the conversion rate
            double conversion_rate = jsonObject.get("conversion_rate").getAsDouble();
            System.out.println("The result of your conversion is: " + conversion_rate);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}