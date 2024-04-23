package com.exchangeconverter.bashconverter.main;

import com.exchangeconverter.bashconverter.api.ApiTest;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Call the ApiTest class
        ApiTest apiTest = new ApiTest();

        // Print the response
        System.out.println(apiTest.response.body());

    }
}
