package main;

import java.io.IOException;

import main.com.exchangeconverter.bashconverter.api.ExchangeRateApi;

public class main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ExchangeRateApi exchangeRateApi = new ExchangeRateApi();
        ConsoleView consoleView = new ConsoleView();
        ExchangeRateController exchangeRateController = new ExchangeRateController(exchangeRateApi, consoleView);
        exchangeRateController.start();
    }

}
