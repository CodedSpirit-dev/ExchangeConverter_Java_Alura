package com.exchangeconverter.bashconverter.api;

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

    // Create endpoint for latest exchange rates
    static void latestExchangeRates() throws IOException, InterruptedException {
        // Build the URL
        String urlBase = buildUrl();
        String url = urlBase + "/latest/USD";

        // Let the user choose the currency through the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the currency you want to convert to, in case that you want all the currencies, type 'all':");
        String currency = scanner.nextLine();

        if (!currency.equals("all")) {
            url = urlBase + "/latest/" + currency;
        } else {
            url = urlBase + "/latest";
        }

        // Create a new HTTP client
        HttpClient client = HttpClient.newHttpClient();

        // Create a new HTTP request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        // Send the request and get the response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Print the response
        System.out.println("Latest Exchange Rates: " + response.body());
    }
}
