package exchangeconverter.controller;

import com.google.gson.Gson;
import exchangeconverter.model.ConversionTarget;
import exchangeconverter.model.ExchangeRateApiResponse;
import exchangeconverter.service.ApiConsumer;

/**
 * The ExchangeRateController class is responsible for controlling the flow of data
 * for currency conversion operations. It utilizes the ApiConsumer to fetch conversion
 * data from an external API and processes this data to perform currency conversions.
 */
public class ExchangeRateController {

    private ApiConsumer apiConsumer = new ApiConsumer(); // Instance of ApiConsumer to make HTTP requests.
    private Gson gson = new Gson(); // Gson instance for JSON parsing.

    /**
     * Converts currency based on the provided ConversionTarget.
     * Fetches the conversion rate from an external API and calculates the converted amount.
     *
     * @param conversionTarget The target conversion pair (e.g., USD to EUR).
     * @return The conversion rate if successful, 0 otherwise.
     */
    public double convertCurrency(ConversionTarget conversionTarget) {
        try {
            String jsonResponse = apiConsumer.obtainData(conversionTarget); // Fetches raw JSON response.
            ExchangeRateApiResponse response = gson.fromJson(jsonResponse, ExchangeRateApiResponse.class); // Parses the JSON response.
            if (response != null) {
                return response.getConversion_rate(); // Returns the conversion rate.
            } else {
                System.out.println("Error obtaining the exchange rate"); // Error handling for null response.
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage()); // General error handling.
        }
        return 0; // Returns 0 in case of failure.
    }
}