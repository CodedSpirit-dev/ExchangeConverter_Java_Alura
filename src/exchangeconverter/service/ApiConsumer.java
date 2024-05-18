package exchangeconverter.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import exchangeconverter.model.ConversionTarget;
import exchangeconverter.model.UrlApi;

public class ApiConsumer {

    public String obtainData(ConversionTarget conversionTarget) throws IOException, InterruptedException {
        String url = UrlApi.buildUrlWithApiKey() + conversionTarget.getPath();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body(); // Return the raw JSON response directly
    }
}