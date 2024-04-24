package com.exchangeconverter.bashconverter.api;

import java.io.IOException;
import java.util.Scanner;

public class ApiEndpoints {

    public static void main(String[] args) throws IOException, InterruptedException {
        ExchangeRateApi exchangeRateApi = new ExchangeRateApi();

        int user = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to get the latest exchange rates or 2 to get the latest exchange rates with amount:");
        user = scanner.nextInt();

        if(user == 1){
            exchangeRateApi.getLatestExchangeRates();
            System.out.println("Do you want to go back to the main menu? Enter 1 for yes or 2 for no:");
            user = scanner.nextInt();
            if(user == 1){
                main(args);
            } else {
                System.out.println("Goodbye!");
            }
        } else if(user == 2){
            exchangeRateApi.getLatestExchangeRatesWithAmount();
            System.out.println("Do you want to go back to the main menu? Enter 1 for yes or 2 for no:");
            user = scanner.nextInt();
            if(user == 1){
                main(args);
            } else {
                System.out.println("Goodbye!");
            }
        } else {
            System.out.println("Invalid option");
        }


    }

}
