package exchangeconverter.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import exchangeconverter.model.ConversionTarget;
import exchangeconverter.model.UrlApi;

/**
 * The ApiConsumer class is responsible for making HTTP requests to an external API.
 * It fetches currency conversion data based on the specified ConversionTarget.
 */
public class ApiConsumer {

    /**
     * Fetches data from the external API based on the provided ConversionTarget.
     * Constructs the request URL using the ConversionTarget's path and sends an HTTP GET request.
     *
     * @param conversionTarget The conversion target specifying the currency pair for conversion.
     * @return The raw JSON response from the API as a String.
     * @throws IOException If an I/O error occurs when sending or receiving the HTTP request.
     * @throws InterruptedException If the operation is interrupted.
     */
    public String obtainData(ConversionTarget conversionTarget) throws IOException, InterruptedException {
        String url = UrlApi.buildUrlWithApiKey() + conversionTarget.getPath(); // Construct the URL with the API key and conversion path.
        HttpClient client = HttpClient.newHttpClient(); // Create a new HttpClient instance.
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url)) // Set the request URI.
                .build(); // Build the HttpRequest.

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); // Send the request and receive the response.
        return response.body(); // Return the raw JSON response directly.
    }
}