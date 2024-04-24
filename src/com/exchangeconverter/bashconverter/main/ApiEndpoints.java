package com.exchangeconverter.bashconverter.main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import static com.exchangeconverter.bashconverter.api.UrlApi.buildUrl;


public class ApiEndpoints {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Create endpoint for latest exchange rates
        latestExchangeRates();

        // Create endpoint for historical exchange rates
        //historicalExchangeRates();
    }

    //Create a connection to the API in general
    private static void connectionBase(HttpRequest request) throws IOException, InterruptedException {
        // Build the URL
        String urlBase = buildUrl();
        System.out.println("API URL: " + urlBase);

        // Create a new HTTP client
        HttpClient client = HttpClient.newHttpClient();

        // Send the request and get the response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Print the response
        System.out.println("Latest Exchange Rates: " + response.body());
    }

    // Create endpoint for latest exchange rates
    static void latestExchangeRates() throws IOException, InterruptedException {
        // Build the URL
        String urlBase = buildUrl();
        String url = urlBase + "/latest/USD";

        // Create a new HTTP request
        HttpRequest requestLatestExchangeRates = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        // Let the user choose the currency through the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the currency you want to convert to, in case that you want all the currencies, type 'all':");
        String currency = scanner.nextLine();

        if (!currency.equals("all")) {
            url = urlBase + "/latest/" + currency;
        } else {
            url = urlBase + "/latest";
        }

        // Call the connectionBase method with the request
        connectionBase(requestLatestExchangeRates);
    }
}