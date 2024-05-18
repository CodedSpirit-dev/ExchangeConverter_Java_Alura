package exchangeconverter.model;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClient {

    // Realiza una solicitud GET y devuelve la respuesta como objeto ExchangeRateResponse
    public ExchangeRateResponse sendGetRequest(String url) throws IOException {
        StringBuilder result = new StringBuilder();
        URL urlObj = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
        connection.setRequestMethod("GET");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }

        Gson gson = new Gson();
        return gson.fromJson(result.toString(), ExchangeRateResponse.class);
    }
}