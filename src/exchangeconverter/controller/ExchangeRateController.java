package exchangeconverter.controller;

import exchangeconverter.model.UrlApi;

public class ExchangeRateController {

    public void convertDollarToArgentinePeso() {
        String url = UrlApi.buildUrlWithApiKey() + "/pair/USD/ARS";
        ExchangeRateResponse response = apiConsume.obtainData(url, ExchangeRateResponse.class);
        if (response != null) {
            System.out.println("1 Dollar is equivalent to " + response.getConversionRate() + " Argentine Pesos");
        } else {
            System.out.println("Error obtaining the exchange rate");
        }
    }
    
}
