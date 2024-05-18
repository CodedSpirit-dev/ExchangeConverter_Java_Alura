package exchangeconverter.controller;

import com.google.gson.Gson;
import exchangeconverter.model.ConversionTarget;
import exchangeconverter.model.ExchangeRateApiResponse;
import exchangeconverter.service.ApiConsumer;

public class ExchangeRateController {

    private ApiConsumer apiConsumer = new ApiConsumer();
    private Gson gson = new Gson();

    public double convertCurrency(ConversionTarget conversionTarget) {
        try {
            String jsonResponse = apiConsumer.obtainData(conversionTarget); // Correctly returns raw JSON String
            ExchangeRateApiResponse response = gson.fromJson(jsonResponse, ExchangeRateApiResponse.class);
            if (response != null) {
                return response.getConversion_rate();
            } else {
                System.out.println("Error obtaining the exchange rate");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return 0;
    }
}