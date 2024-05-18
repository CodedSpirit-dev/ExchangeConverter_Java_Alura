package exchangeconverter.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class ApiConsume {
    public <T> T obtainData(String url, Class <T> clazz) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), clazz);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (response != null) {
                return response.body();
            }
        }
        Gson gson = new Gson();
        return gson.toJson(response);
    }

}